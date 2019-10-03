/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mjara
 */
public class conexion {
        
    private static Connection conexion;
    
    private String usuario = "EMPLEADO";
    private String pass = "123";
    
    private String url = "jdbc:oracle:thin:"+usuario+"/"+pass+"@localhost:1521:xe";
    
    public conexion() {
            
        try {
            
            //cargar la libreria jdbc para oracle
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conexion = DriverManager.getConnection(url, usuario, pass);
            
        } catch(Exception ex) {
            System.out.println("Error de conexion");
        }
    }
    

    public Connection obtenerConexion() {
        return conexion;
    }
}
