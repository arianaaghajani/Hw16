package ir.ariana.base;
import ir.ariana.base.repository.Teacher.TeacherRepository;
import ir.ariana.base.repository.course.CourseRepository;
import ir.ariana.base.repository.employee.EmployeeRepository;
import ir.ariana.base.repository.student.StudentRepository;
import ir.ariana.base.repository.student.StudentRepositoryImpl;
import ir.ariana.base.service.base.BaseService;
import ir.ariana.base.util.ApplicationContext;
import org.hibernate.SessionFactory;

import java.util.Scanner;

//public class Menu {
//    Scanner scanner = new Scanner(System.in);
//    ApplicationContext applicationContext=new ApplicationContext();
//
//
//    public void menu() {
//        int choice = -1;
//        while (choice != 0) {
//            System.out.println("*** menu ***");
//            System.out.println("1. STUDENT");
//            System.out.println("2. TEACHER");
//            System.out.println("3. EMPLOYEE");
//            System.out.println("0. EXIT");
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1 -> studentMenu();
////                case 2 -> teacherMenu();
////                case 3 -> employeeMenu();
//                case 0 -> {
//                }
//                default -> System.out.println("wrong choice!!!");
//            }
//        }
//    }
//
//    private void studentMenu() {
//        int choice = -1;
//        while (choice != 0) {
//            System.out.println("***** STUDENT MENU *****");
//            System.out.println("1. SIGNUP");
//            System.out.println("2. UPDATE");
//            System.out.println("3. DELETE");
//            System.out.println("4. FINDALL");
//            System.out.println("0. EXIT");
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
////                case 1 -> studentSignUp;
////                case 2 -> studentUpdate();
////                case 3 -> studentDelete();
////                case 4 -> studentloadAll();
//                case 0 -> {
//                }
//                default -> System.out.println("wrong choice!!!");
//            }
//
//        }
//    }
//
//    private void studentSignUp() {
//        System.out.println("First name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Last name: ");
//        String lastName = scanner.nextLine();
//
//    }
