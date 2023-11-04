package javaapplication1;

import java.sql.*;

public class JDBCCONN {

    Connection c;
    Statement s;

    public JDBCCONN() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
