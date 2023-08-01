package com.taskmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.taskmanager.model.User;
import com.taskmanager.util.DBHandler;

public class UserDaoImpl implements UserDao {

    @Override
    public void registerUser(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBHandler.getConnection();
            String query = "INSERT INTO user (username, password) VALUES (?, ?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            System.out.println("Error registering user: " + e.getMessage());
        } finally {
            DBHandler.closeResources(conn, ps, null);
        }
    }

    @Override
    public boolean loginUser(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean loggedIn = false;
        try {
            conn = DBHandler.getConnection();
            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            loggedIn = rs.next(); // If a row is returned, the login is successful.
        } catch (SQLException e) {
            System.out.println("Error logging in: " + e.getMessage());
        } finally {
            DBHandler.closeResources(conn, ps, rs);
        }
        return loggedIn;
    }
}