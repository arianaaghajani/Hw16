package ir.ariana.base.service.base;

import ir.ariana.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity<ID>,ID extends Serializable> {

    T saveOrUpdate(T entity);
    Optional<T>findById(ID id);
    void deleteById (ID id);
    List<T> findAll();
}
