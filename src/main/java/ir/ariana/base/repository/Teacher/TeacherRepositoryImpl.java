package ir.ariana.base.repository.Teacher;

import ir.ariana.base.model.Teacher;
import ir.ariana.base.repository.base.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class TeacherRepositoryImpl extends BaseRepositoryImpl<Teacher,Long> implements TeacherRepository {
    public TeacherRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Teacher> getEntityClass() {
        return Teacher.class;
    }

    @Override
    public String getEntity() {
        return null;
    }
}
