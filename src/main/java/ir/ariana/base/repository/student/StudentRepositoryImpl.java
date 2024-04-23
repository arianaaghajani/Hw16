package ir.ariana.base.repository.student;

import ir.ariana.base.model.Student;
import ir.ariana.base.repository.base.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class StudentRepositoryImpl extends BaseRepositoryImpl<Student,Long> implements StudentRepository {
    public StudentRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }

    @Override
    public String getEntity() {
        return null;
    }

    @Override
    public boolean isExistsByUsername(String username) {
        return false;
    }
}
