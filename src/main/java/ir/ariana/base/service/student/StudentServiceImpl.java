package ir.ariana.base.service.student;

import ir.ariana.base.model.Student;
import ir.ariana.base.repository.student.StudentRepository;
import ir.ariana.base.service.base.BaseServiceImpl;
import org.hibernate.SessionFactory;

import java.util.Scanner;

public class StudentServiceImpl extends BaseServiceImpl<Student,Long, StudentRepository>
        implements StudentService{


    public StudentServiceImpl(StudentRepository studentRepository, SessionFactory sessionFactory) {
        super(studentRepository,sessionFactory);
    }
}
