package repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection init(){
        try{
            return  DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/course_management",
                    "postgres",
                    "Canadiabank@12345678"
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
