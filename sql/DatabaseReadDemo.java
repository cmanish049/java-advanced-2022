package sql;

import java.sql.*;

public class DatabaseReadDemo {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecord", "root", "root");
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString(2));
                System.out.println("Email: " + resultSet.getString(3));
            }
            statement.close();
            connect.close();
        } catch (Exception ignored) { 
            ignored.printStackTrace();
        }
    }
}
