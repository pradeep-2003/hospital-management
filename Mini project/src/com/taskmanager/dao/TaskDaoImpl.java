package com.taskmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.taskmanager.model.Task;
import com.taskmanager.util.DBHandler;

public class TaskDaoImpl implements TaskDao {

    @Override
    public void create(Task task) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBHandler.getConnection();
            String query = "INSERT INTO tasks (task_name, username, due_date, is_completed) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, task.getTaskName());
            ps.setString(2, task.getUsername());
            ps.setString(3, task.getDueDate());
            ps.setBoolean(4, task.isCompleted());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            System.out.println("Error creating task: " + e.getMessage());
        } finally {
            DBHandler.closeResources(conn, ps, null);
        }
    }

    @Override
    public List<Task> getTasksForUser(String username) {
        List<Task> tasks = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBHandler.getConnection();
            String query = "SELECT * FROM tasks WHERE username = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                Task task = new Task();
                task.setId(rs.getInt("id"));
                task.setTaskName(rs.getString("task_name"));
                task.setUsername(rs.getString("username"));
                task.setDueDate(rs.getString("due_date"));
                task.setCompleted(rs.getBoolean("is_completed"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching tasks for user: " + e.getMessage());
        } finally {
            DBHandler.closeResources(conn, ps, rs);
        }
        return tasks;
    }

    @Override
    public void markTaskAsCompleted(int taskId) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBHandler.getConnection();
            String query = "UPDATE tasks SET is_completed = ? WHERE id = ?";
            ps = conn.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, taskId);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated.");
        } catch (SQLException e) {
            System.out.println("Error updating task status: " + e.getMessage());
        } finally {
            DBHandler.closeResources(conn, ps, null);
        }
    }
}