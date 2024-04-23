package ir.ariana.base;

import ir.ariana.base.connection.SessionFactorySingleton;
import ir.ariana.base.model.*;
import ir.ariana.base.util.ApplicationContext;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //todo student
//        Course course1 = new Course("fizik", "11:15", "13:30", 3, 254000L);
//        Course course2 = new Course("ARABI", "14:30", "16:30", 2, 250000L);
//        List<Course> courses = List.of(course1, course2);
//
//        ApplicationContext.getCourseService().saveOrUpdate(course1);
//        ApplicationContext.getCourseService().saveOrUpdate(course2);


//        Student student = new Student("ali", "aghaee", "135478", "12ad",
//                "09124721", courses);
//        ApplicationContext.getStudentService().saveOrUpdate(student);

//        ApplicationContext.getStudentService().saveOrUpdate(student);
//        ApplicationContext.getStudentService().deleteById(2L);
//        ApplicationContext.getStudentService().findAll();

//        ApplicationContext.getStudentService().saveOrUpdate(student1);
        SessionFactory instance = SessionFactorySingleton.getInstance();

        //todo employee
//        Employee employee=new Employee("sama","akbari","09125698325","as123hj"
//                ,"a1236sd");
//        System.out.println(ApplicationContext.getEmployeeService().saveOrUpdate(employee));
//        ApplicationContext.getEmployeeService().findById(1L);
//        ApplicationContext.getEmployeeService().deleteById(1L);


//        Optional<Employee> byId= ApplicationContext.getEmployeeService().findById(1L);
//        System.out.println(byId);


        //TODO TEACHER
//        Course course1=new Course("zaban","13:30","15:30",3,320000l);
//
//        Course course2=new Course("adabiat","12:00","14:30",2,250000L);
//        List<Course> courses=List.of(course1,course2);
//
//        Teacher teacher=new Teacher("elham","begloo","09124365849",MasterDegree.B,
//                courses, "asdfg1","asd123");
//        ApplicationContext.getCourseService().saveOrUpdate(course1);
//        ApplicationContext.getCourseService().saveOrUpdate(course2);
//        ApplicationContext.getTeacherService().saveOrUpdate(teacher);

        //TODO reportCard
//        Course course=new Course("shii","16:00","18:00",3,250000L);
//        Course course1=new Course("riaz3","18:30","20:45",2,200000L);
//
//        List<Course> courses=List.of(course,course1);
//
//        Student student=new Student("mahtab","maleki","134557","askllrf"
//                ,"09142335943",courses);
//        ReportCard reportCard=new ReportCard(student,courses,16/30,10);
//
//        ApplicationContext.getCourseService().saveOrUpdate(course);
//        ApplicationContext.getCourseService().saveOrUpdate(course1);
//        ApplicationContext.getStudentService().saveOrUpdate(student);
//        ApplicationContext.getReportCardService().saveOrUpdate(reportCard);

        //TODO SELECT Unit
//        Course course=new Course("andishe1","07:00","10:00",2,256000L);
//        Course course1=new Course("ALGORITM","11:30","13:30",3,259000L);
//
//        List<Course> courses=List.of(course1,course);
//
//
//       Student student=new Student("YALDA","ALAEE","1235689","AS12",
//               "09153627803",courses);
//       ReportCard reportCard=new ReportCard(student,courses,19/5,17);
//
//       ApplicationContext.getCourseService().saveOrUpdate(course);
//       ApplicationContext.getCourseService().saveOrUpdate(course1);
//       ApplicationContext.getStudentService().saveOrUpdate(student);
//       ApplicationContext.getReportCardService().saveOrUpdate(reportCard);

    }

}