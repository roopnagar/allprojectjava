package jdbc.app.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class DBConnectionSingleton {
    private static DBConnectionSingleton singletonClass;
    private static final String URL = "jdbc:mysql://localhost:3306/prodaptdb";
    Connection con = null;
  
    private DBConnectionSingleton() {
        try {
            
            con = DriverManager.getConnection(URL,"root" , "admin");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getInstance() {
        if(singletonClass == null) {
        	singletonClass = new DBConnectionSingleton();
    }
        return singletonClass.con;
}}