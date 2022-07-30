
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexión {
    Connection connection;
    //Atributos:
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_sem4_g53";
    String usuario = "root";
    String contraseña = "";
    

    public Conexión() {
        try{
            Class.forName(driver);
            connection =DriverManager.getConnection(cadenaConexion, usuario,contraseña);
            if(connection != null){
                System.out.println("Conexion exitosa con la base de datos");
                             
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudo establecer conexión con la base de datos.");       
        }         
    }
    
    //Crear funcion que retorna la clase connection.
    public Connection getConnection(){
        return connection;
    }
    
  
}
