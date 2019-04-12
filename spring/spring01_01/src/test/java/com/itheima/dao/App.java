package com.itheima.dao;

import java.sql.*;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "root");
        PreparedStatement pstm = conn.prepareStatement("SELECT * FROM USER ");
        ResultSet resultSet = pstm.executeQuery();

        while(resultSet.next()){
            System.out.println(resultSet);
        }

        resultSet.close();
        pstm.close();
        conn.close();


    }
}
