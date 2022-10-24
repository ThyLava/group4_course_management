package controller;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        // get all students
        List<Student> studentList = studentService.findAll();
        if(studentList.size() != 0){
            for (Student student:studentList){
                System.out.println(student.toString());
            }
        }

        // insert a student;
        Student student = new Student();
        student.setFull_name("Narita Keo");
        student.setPhone(0702112322);
        if(studentService.insert(student)){
            System.out.println("Insert Student Successfully");
        }else{
            System.out.println("Insert Student Failed !!");
        }
    }
}
