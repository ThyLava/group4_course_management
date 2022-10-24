package repository.impl;

import entity.Student;
import repository.StudentRepository;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    @Override
    public List<Student> findAll() {
        try {
            String sql = "SELECT * FROM students";
            connection = DatabaseConnection.init();
            assert connection != null;
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFull_name(resultSet.getString("full_name"));
                student.setPhone(resultSet.getLong("phone"));
                studentList.add(student);

            }
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean insert(Student student) {
        String insertSql = "INSERT INTO students " + "(full_name) ,(phone)"+ "VALUES (?),(?)";
        try {
            connection = DatabaseConnection.init();
            preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, student.getFull_name());
            preparedStatement.setInt(2, (int) student.getPhone());
            if(preparedStatement.executeUpdate() != 0){
                return  true;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                preparedStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
