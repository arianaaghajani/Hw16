package ir.ariana.base.repository.course;

import ir.ariana.base.model.Course;
import ir.ariana.base.repository.base.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class CourseRepositoryImpl extends BaseRepositoryImpl<Course,Long>
        implements CourseRepository{
    public CourseRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Course> getEntityClass() {
        return Course.class;
    }

    @Override
    public String getEntity() {
        return null;
    }
}
