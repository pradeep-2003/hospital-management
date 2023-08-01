package com.taskmanager.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHandler {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/task_manager_db?useSSL=false";
            connection = DriverManager.getConnection(url, "root", "Kiruba@123");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found: " + e.getMessage());
        }
        return connection;
    }

	public static void closeResources(Connection conn, PreparedStatement ps, ResultSet rs) {
		// TODO Auto-generated method stub
		
	}
}