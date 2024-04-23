package ir.ariana.base.service.teacher;

import ir.ariana.base.model.Teacher;
import ir.ariana.base.repository.Teacher.TeacherRepository;
import ir.ariana.base.service.base.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class TeacherServiceImpl extends BaseServiceImpl<Teacher,Long, TeacherRepository>
        implements TeacherService{
    public TeacherServiceImpl(TeacherRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
