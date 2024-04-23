package ir.ariana.base.service.base;

import ir.ariana.base.entity.BaseEntity;
import ir.ariana.base.exeption.NotFoundException;
import ir.ariana.base.repository.base.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class BaseServiceImpl <T extends BaseEntity<ID>, ID extends Serializable,
        R extends BaseRepository<T,ID>>
        implements BaseService<T,ID> {

    protected final R repository;
    protected  final SessionFactory sessionFactory;

    @Override
    public T saveOrUpdate(T entity) {
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            T t = repository.saveOrUpdate(entity);
            transaction.commit();
            return t;
        } catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
            return null;
        }
    }

    @Override
    public Optional<T> findById(ID id) {
        try (Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            Optional<T> findEntity = repository.findById(id);
            findEntity.orElseThrow(() -> new NotFoundException(String.format("Entity with id : %s not found", id)));
            session.getTransaction().commit();
            session.close();
            return findEntity;
        }
        catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public void deleteById(ID id) {
        try (Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            Optional<T> findEntity = repository.findById(id);
            findEntity.orElseThrow(() -> new NotFoundException(String.format("Entity with id : %s not found", id)));
            repository.delete(findEntity.get());
            session.getTransaction().commit();
        }
        catch (Exception ignored){}

    }

    @Override
    public List<T> findAll() {
        try (Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            List<T> listAll = repository.findAll();
            session.getTransaction().commit();
            session.close();
            return listAll;
        }
        catch (Exception ignored){
            return null;
        }
    }
}
