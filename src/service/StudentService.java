package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    boolean insert(Student student);
    boolean update(Student student);
    boolean delete(int id);
    Student findById(int id);
    List<Student> findByName(String name);
}
