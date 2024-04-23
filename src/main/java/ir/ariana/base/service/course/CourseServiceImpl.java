package ir.ariana.base.service.course;

import ir.ariana.base.model.Course;
import ir.ariana.base.repository.course.CourseRepository;
import ir.ariana.base.service.base.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class CourseServiceImpl extends BaseServiceImpl<Course,Long, CourseRepository>
        implements CourseService {
    public CourseServiceImpl(CourseRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
