package com.example.midtermtest1;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility
{
    private static String user = DBCrendentials.user;
    private static String password = DBCrendentials.password;
    private static String connectURL = "jdbc:mysql://localhost:3306/javaTest";


    public static ArrayList<Student> getStudentFromDB()
    {
        ArrayList<Student> students = new ArrayList<>();

        String sql = "SELECT * FROM students;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int studentNum = resultSet.getInt("studentNum");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String gender = resultSet.getString("gender");
                String telephone = resultSet.getString("telephone");
                String province = resultSet.getString("province");
                int avgGrade = resultSet.getInt("avgGrade");
                String majorCode = resultSet.getString("majorCode");

                students.add(new Student(studentNum, firstName, lastName, gender, telephone, province, majorCode, avgGrade));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;

    }
    public static ArrayList<Student> showStudentsByProvince(String prv)
    {
        ArrayList<Student> students = new ArrayList<>();
       String sql = String.format("SELECT * FROM students where province = '%s';", prv);
        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int studentNum = resultSet.getInt("studentNum");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String gender = resultSet.getString("gender");
                String telephone = resultSet.getString("telephone");
                String province = resultSet.getString("province");
                int avgGrade = resultSet.getInt("avgGrade");
                String majorCode = resultSet.getString("majorCode");

                students.add(new Student(studentNum, firstName, lastName, gender, telephone, province, majorCode, avgGrade));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
