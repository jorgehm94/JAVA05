package Controlador;

    //Este archivo contiene la configuracion de la conexion por ODBC de la BD, donde se 
    //Cargan todos los drives necesarios y archivos que permiten realizar las operaciones
    //con las tablas de la BD

    //Paquete con las funcion que pemite configurar la conexion de la BD y tiene definido 
    //los controladores necesarios para las conexiones de la BD //Connection - ResultSet(consulta selet) - Statement(ejecutar consultas insert, update, delete) - SQException (Excepciones en SQL)
import java.sql.*; 

    //paquete que permite configurar las funciones de red
/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class ConexionPostgres {


        //Objeto Tipo conexion que contiene todos los parametros para interactuar 
        //con la BD se crea un objeto tipo con
    public static Connection con;
    

    public static boolean crearConexion(String user, String pass) throws ClassNotFoundException, SQLException
    {
        

              Class.forName("org.postgresql.Driver");  //loads the driver

              String url = "jdbc:postgresql://localhost:5432/PINACOTECA";

              con = DriverManager.getConnection(url, user, pass);

               return true;

    }

    public void validarUsuario(String nombre)
    {
        
    }
    
    //Se coloca el "TYPE_SCROLL_SENSITIVE" para poder ir para atrás y "CONCUR_UPDATABLE" para que se pueda modificar los datos de la base de datos
    

    //Metodo para cerrar la conexion con la base de datos
    public static void cerrarConexion() throws SQLException
    {
            //Cierra la conexion de la Base de Datos
            con.close();
            System.out.println("Cerrada la conexion con la Base de Datos");
       
    }
}
