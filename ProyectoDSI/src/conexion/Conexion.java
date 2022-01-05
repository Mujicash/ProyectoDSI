
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author André Mujica 
 */
public class Conexion {
    
    private static String login = "";
    private static String clave = "";
    private static String url = "";
    
    private static Conexion instance; //Singleton
    private Connection conn;
    
    private Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //driver
            conn = DriverManager.getConnection(url, login, clave);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized static Conexion getInstance(){
        
        if(instance == null){
            instance = new Conexion();
        }
        
        return instance;
    }

    public Connection getConn() {
        return conn;
    }
    
    public void desconectar(){
        instance = null;
    }

}
