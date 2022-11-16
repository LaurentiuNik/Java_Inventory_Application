package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;
    public Connection getDBConnection(){

        String databaseUser = "root";
        String databasePassword = "oparolacaoricarealtaA1";
        String url = "jdbc:mysql://localhost:3306/pocbase";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;

    }
}
