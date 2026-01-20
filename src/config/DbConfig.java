package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    private static Connection conn ;
    public static Connection getInstace(){
        return conn;
    }

    public static void init (){
        if(conn == null){
            try {
                String url = "jdbc:postgresql://localhost:5432/event_management";
                String username = "postgres";
                String password = "04182022";
                conn = DriverManager.getConnection(url,username,password);
            }catch (SQLException e){
                System.out.println("Failed To Connect To The Database !");
            }
        }else {
            System.out.println("You already connected to the database !");
        }
    }
}
