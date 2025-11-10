package wavecode.database;

/**
 *
 * @author FRANCIS
 */
import java.sql.*;

public class ConnectionDB {
    // Database connection parameters
    private static final String url = "jdbc:mysql://localhost:3306/wavecode",
            user = "root",
            pword = "Chap04",
            driver = "com.mysql.cj.jdbc.Driver";
    private Connection conn;

    public ConnectionDB() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pword);
            System.out.println(" Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e);
            conn = null;
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    
    
}
