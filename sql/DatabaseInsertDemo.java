package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecord", "root", "root");
            Statement statement = connect.createStatement();
            statement.executeUpdate("insert into students (name, email, roll_number) values ('Gita', 'gita@test.com', 3)");
            System.out.println("Student Record Inserted Successfully");
            statement.close();
            connect.close();
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }
    }
}
