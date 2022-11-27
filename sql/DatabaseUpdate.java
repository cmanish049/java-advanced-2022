package sql;

import java.sql.*;

public class DatabaseUpdate {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // update database name, database user and database password
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecord", "root", "root");
            Statement statement = connect.createStatement();
            statement.executeUpdate("update students set name='Student 2' where id = 2");
            System.out.println("Student Record updated Successfully");

            statement.close();
            connect.close();
        } catch (Exception ignored) { 
            ignored.printStackTrace();
        }
    }
}
