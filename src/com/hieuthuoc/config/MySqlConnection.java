package com.hieuthuoc.config;

import java.sql.*;

public class MySqlConnection {
    private static String url = "jdbc:mysql://localhost:3306/ql_hieu_thuoc";
    private static String user = "root";
    private static String password = "Nguyen96#";

    public static Connection open() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
