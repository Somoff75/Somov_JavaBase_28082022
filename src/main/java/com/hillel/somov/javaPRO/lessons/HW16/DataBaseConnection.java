package com.hillel.somov.javaPRO.lessons.HW16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection extends LessonDao {

    static String url = "jdbc:postgresql://localhost:5432/employee";
    static String user = "postgres";
    static String password = "qwerty";

    public static void main(String[] args) throws SQLException {

        Lesson lesson = new Lesson();
        lesson.setId(1);
        lesson.setName("Java");
        lesson.setId(2);
        lesson.setName("Java");

        Homework homework = new Homework();
        homework.setId(1);
        homework.setName("HW16");
        homework.setDescription("Do something");
        homework.setId(2);
        homework.setName("HW17");
        homework.setDescription("Do something new");

        System.out.println(lesson);

        System.out.println(allLessons());

        System.out.println(findLessonById(1));

        deleteLesson(1);

        Connection connection = getMyConnection();
        System.out.println(connection);
        closeConnection(connection);
    }

    public static Connection getMyConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

}
