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
public class Conexion {


        //Objeto Tipo conexion que contiene todos los parametros para interactuar 
        //con la BD se crea un objeto tipo con
    public static Connection conexionPostgres;
    public static Connection conexionMysql;

    public static void crearConexion(String pass) throws ClassNotFoundException, SQLException
    {

         Class.forName("org.postgresql.Driver");  //loads the driver

         String url = "jdbc:postgresql://localhost:5432/PINACOTECA";
         
         conexionPostgres = DriverManager.getConnection(url, "jorge", pass);
              
         Class.forName("com.mysql.jdbc.Driver");  //loads the driver
              
         String urls = "jdbc:mysql://localhost:3306/PINACOTECA?useSSL=false";
              
         conexionMysql = DriverManager.getConnection(urls, "jorge", pass);   
         

    }

    
    
    public boolean validarUsuario(String cod, String pass) throws SQLException, ClassNotFoundException
    {
        
        crearConexion(pass);
        
        PreparedStatement validacion = null;
        String consulta = "select * from pinacoteca where cod_pina = ? ";
        ResultSet rsP;
        ResultSet rsM;
        
        
        validacion = conexionPostgres.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE,
          ResultSet.CONCUR_UPDATABLE);
        
        validacion.setInt(1, Integer.parseInt(cod));
        
        rsP = validacion.executeQuery();
        
       validacion = conexionMysql.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE,
          ResultSet.CONCUR_UPDATABLE);
       
        validacion.setInt(1, Integer.parseInt(cod));
        
        rsM = validacion.executeQuery();
        
        if(rsP.next() && rsM.next()){
            System.out.println("Todo bien");
            return true;
        }
        else{
            System.out.println("No se ha encontrado el usuario");
            return false;
        }
        
    }
    

    //Metodo para cerrar la conexion con la base de datos
    public static void cerrarConexion() throws SQLException
    {
            //Cierra la conexion de la Base de Datos
            conexionPostgres.close();
            conexionMysql.close();
            System.out.println("Cerrada la conexion con la Base de Datos");
       
    }
}

