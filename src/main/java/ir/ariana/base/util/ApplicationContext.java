package ir.ariana.base.util;

import ir.ariana.base.connection.SessionFactorySingleton;
import ir.ariana.base.repository.Teacher.TeacherRepository;
import ir.ariana.base.repository.Teacher.TeacherRepositoryImpl;
import ir.ariana.base.repository.course.CourseRepository;
import ir.ariana.base.repository.course.CourseRepositoryImpl;
import ir.ariana.base.repository.employee.EmployeeRepository;
import ir.ariana.base.repository.employee.EmployeeRepositoryImpl;
import ir.ariana.base.repository.reportCard.ReportCardRepository;
import ir.ariana.base.repository.reportCard.ReportCardRepositoryImpl;
import ir.ariana.base.repository.selectUnit.SelectUnitRepository;
import ir.ariana.base.repository.selectUnit.SelectUnitRepositoryImpl;
import ir.ariana.base.repository.student.StudentRepository;
import ir.ariana.base.repository.student.StudentRepositoryImpl;
import ir.ariana.base.service.course.CourseService;
import ir.ariana.base.service.course.CourseServiceImpl;
import ir.ariana.base.service.employee.EmployeeService;
import ir.ariana.base.service.employee.EmployeeServiceImpl;
import ir.ariana.base.service.reportCard.ReportCardService;
import ir.ariana.base.service.reportCard.ReportCardServiceImpl;
import ir.ariana.base.service.selectUnit.SelectUnitService;
import ir.ariana.base.service.selectUnit.SelectUnitServiceImpl;
import ir.ariana.base.service.student.StudentService;
import ir.ariana.base.service.student.StudentServiceImpl;
import ir.ariana.base.service.teacher.TeacherService;
import ir.ariana.base.service.teacher.TeacherServiceImpl;
import org.hibernate.SessionFactory;

public class ApplicationContext {
    static final SessionFactory SESSION_FACTORY;
    private static final StudentRepository STUDENT_REPOSITORY;
    private static final TeacherRepository TEACHER_REPOSITORY;
    private static final CourseRepository COURSE_REPOSITORY;
    private static final EmployeeRepository EMPLOYEE_REPOSITORY;

    private static final ReportCardRepository REPORT_CARD_REPOSITORY;
    private static final SelectUnitRepository SELECT_UNIT_REPOSITORY;




    private static final CourseService COURSE_SERVICE;
    private static final EmployeeService EMPLOYEE_SERVICE;
    private static final TeacherService TEACHER_SERVICE;
    private static final StudentService STUDENT_SERVICE;
    private static final SelectUnitService SELECT_UNIT_SERVICE;

    private static final ReportCardService REPORT_CARD_SERVICE;

    static {
        SESSION_FACTORY = SessionFactorySingleton.getInstance();

        STUDENT_REPOSITORY =new StudentRepositoryImpl(SESSION_FACTORY);
        STUDENT_SERVICE = new StudentServiceImpl(STUDENT_REPOSITORY,SESSION_FACTORY);

        TEACHER_REPOSITORY =new TeacherRepositoryImpl(SESSION_FACTORY);
        TEACHER_SERVICE =new TeacherServiceImpl(TEACHER_REPOSITORY,SESSION_FACTORY);

        EMPLOYEE_REPOSITORY =new EmployeeRepositoryImpl(SESSION_FACTORY);
        EMPLOYEE_SERVICE= new EmployeeServiceImpl(EMPLOYEE_REPOSITORY,SESSION_FACTORY);

        COURSE_REPOSITORY=new CourseRepositoryImpl(SESSION_FACTORY);
        COURSE_SERVICE=new CourseServiceImpl(COURSE_REPOSITORY,SESSION_FACTORY);

        REPORT_CARD_REPOSITORY =new ReportCardRepositoryImpl(SESSION_FACTORY);
        REPORT_CARD_SERVICE=new ReportCardServiceImpl(REPORT_CARD_REPOSITORY,SESSION_FACTORY);

        SELECT_UNIT_REPOSITORY=new SelectUnitRepositoryImpl(SESSION_FACTORY);
        SELECT_UNIT_SERVICE=new SelectUnitServiceImpl(SELECT_UNIT_REPOSITORY,SESSION_FACTORY);
    }
    public static StudentService getStudentService(){
        return STUDENT_SERVICE;
    }
    public static TeacherService getTeacherService(){
        return TEACHER_SERVICE;
    }
    public static CourseService getCourseService(){
        return COURSE_SERVICE;
    }
    public static EmployeeService getEmployeeService(){
        return EMPLOYEE_SERVICE;
    }
    public static ReportCardService getReportCardService(){
        return REPORT_CARD_SERVICE;
    }

    public static SelectUnitService getSelectUnitService(){
        return SELECT_UNIT_SERVICE;
    }

}
