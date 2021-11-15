package com.codegym.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static Connection connection;
//    private static String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
//    private static String jdbcUsername = "root";
//    private static String jdbcPassword = "Cuongtien1809";

//    private ConnectionSingleton() {
//    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("ket noi thanh cong");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/demo",
                        "root",
                        "Cuongtien1809");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Ket noi k thanh cong");
                e.printStackTrace();
            }
        }
        return connection;
    }
}
