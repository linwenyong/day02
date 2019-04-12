package com.itheima;
import sun.security.util.Resources;

import java.sql.*;



public class App01 {
    public static void main(String[] args) throws Exception {
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");


        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", "root", "root");
        PreparedStatement pstm = conn.prepareStatement("SELECT * FROM USER ");

        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("username"));
        }

        rs.close();
        pstm.close();
        conn.close();

    }
}
