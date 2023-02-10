package com.hillel.somov.javaPRO.lessons.HW16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    public static int addLesson(Lesson lesson) throws SQLException {

        Connection connection = DataBaseConnection.getMyConnection();
        PreparedStatement ps = connection.prepareStatement("insert into lesson (name, homework, id) values (?,?,?)");
        ps.setString(1, lesson.getName());
        ps.setString(2, lesson.getHomework());
        ps.setInt(3, Integer.parseInt(String.valueOf(lesson.getId())));

        int status = ps.executeUpdate();
        connection.close();
        return status;

    }

    public static int deleteLesson(int id) throws SQLException {
        Connection connection = DataBaseConnection.getMyConnection();
        PreparedStatement ps = connection.prepareStatement("delete from lesson where id=?");
        ps.setInt(1, id);
        int status = ps.executeUpdate();
        connection.close();
        return status;
    }

    public static List<Lesson> allLessons() throws SQLException {
        List<Lesson> lessons = new ArrayList<>();
        Connection connection = DataBaseConnection.getMyConnection();
        PreparedStatement ps = connection.prepareStatement("select * from lesson");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Lesson lesson = new Lesson();
            lesson.setId(Integer.parseInt(String.valueOf(rs.getInt(1))));
            lesson.setName(rs.getString(2));
            lesson.setHomework(rs.getString(4));
            lessons.add(lesson);
        }
        connection.close();
        return lessons;
    }

    public static Lesson findLessonById(int id) throws SQLException {
        Lesson lesson = new Lesson();
        Connection connection = DataBaseConnection.getMyConnection();
        PreparedStatement ps = connection.prepareStatement("select * from lesson where id=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            lesson.setId(Integer.parseInt(String.valueOf(rs.getInt(1))));
            lesson.setName(rs.getString(2));
            lesson.setHomework(rs.getString(4));
        }
        connection.close();
        return lesson;
    }

    public static void update(Lesson lesson) throws SQLException {

        Connection connection = DataBaseConnection.getMyConnection();
        PreparedStatement ps = connection.prepareStatement("update lespson set name=?, homework=? where id=?");
        ps.setString(2, lesson.getHomework());
        ps.setString(1, lesson.getName());
        ps.setInt(3, Integer.parseInt(String.valueOf(lesson.getId())));
        int status = ps.executeUpdate();
        connection.close();
    }

}
