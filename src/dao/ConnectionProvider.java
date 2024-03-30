/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class ConnectionProvider {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/lib?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Nour21644162-";

    // Private constructor to prevent instantiation
    private ConnectionProvider() {
    }

    public static Connection getCon() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
            throw new SQLException("MySQL JDBC Driver not found", e);
        }
    }

    // Close the connection
    public static void closeCon(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Log or handle the exception appropriately
            }
        }
    }
}

