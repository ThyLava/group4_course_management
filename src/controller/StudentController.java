package controller;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.findAll();
        if(studentList.size() != 0){
            for (Student student:studentList){
                System.out.println(student.toString());
            }
        }
    }
}
