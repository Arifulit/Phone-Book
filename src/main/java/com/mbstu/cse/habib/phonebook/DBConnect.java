 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstu.cse.habib.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class DBConnect {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/phonebook";
            String user = "root";
            String password = "arif&&15";
            connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection is successful at " + url);
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
