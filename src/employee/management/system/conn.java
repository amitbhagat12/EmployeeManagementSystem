package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class conn {
    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url  = "jdbc:mysql://localhost:3306/employeemanagement"; // your DB
            String user = "root";
            String pass = "Mysql@Am1204";

            // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","mysql1204");
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
