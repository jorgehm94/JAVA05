package Controlador;

    //Este archivo contiene la configuracion de la conexion por ODBC de la BD, donde se 
    //Cargan todos los drives necesarios y archivos que permiten realizar las operaciones
    //con las tablas de la BD

    //Paquete con las funcion que pemite configurar la conexion de la BD y tiene definido 
    //los controladores necesarios para las conexiones de la BD //Connection - ResultSet(consulta selet) - Statement(ejecutar consultas insert, update, delete) - SQException (Excepciones en SQL)
import java.sql.*; 
import javax.swing.JOptionPane;

    //paquete que permite configurar las funciones de red
/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class Conexion {


        //Objeto Tipo conexion que contiene todos los parametros para interactuar 
        //con la BD se crea un objeto tipo con
    public static Connection con;
    
    //Se crea dos Statement de las dos tablas
    public  Statement director;
    public  Statement supermercado;
    
   
    public static boolean crearConexion(String pass)
    {
        
         try
            {
              //Clase que especifica el nombre de los controladores que se van
              //ha utilizar en la carga de la BD en este caso son los de Access
              Class.forName("org.postgresql.Driver");  //loads the driver
            }
            catch(ClassNotFoundException e)
            {
                    System.out.println("No encontro driver");
            }

            try
            {
                    //url es un texto que contiene la ruta del nombre o la direccion
                    //de conexon de la base da Datos conectada al JDBC
                    String url = "jdbc:postgresql://localhost:5432/SUPERMERCADO";

                    //Con es el objeto creado para la coneccion donde se especifican los
                    //parametros de la ubicacion de la BD, login si la base de datos
                    //posee seguridad y por ultimo la clave
                    //DriverManager.getConnection es el servicio que permite establecer
                    //la conexion ABRIR CONEXION!!!
                    
                    con = DriverManager.getConnection(url, "postgres", pass);
                    
                    JOptionPane.showMessageDialog(null, "Conexion exitosa" ,"Estado de conexión", JOptionPane.PLAIN_MESSAGE);
                    
                    
                    return true;

            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Error en la conexion con la base de datos" ,"Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            catch (java.lang.Exception ex) 
            {
                ex.printStackTrace ();
                return false;
            }
    }

    
    //Se coloca el "TYPE_SCROLL_SENSITIVE" para poder ir para atrás y "CONCUR_UPDATABLE" para que se pueda modificar los datos de la base de datos

    //Statement para la clase Director
    public  Statement crearSentenciaDirector() throws SQLException
    {
        director = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                   
        return director;
    }
    
    //Statement para la clase Supermercado
    public Statement crearSentenciaSupermercado() throws SQLException
    { 
        supermercado = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        return supermercado;
    }
   
    //Metodo para cerrar la conexion con la base de datos
    public static void cerrarConexion()
    {
        try
        {
            //Cierra la conexion de la Base de Datos
            con.close();
            System.out.println("Cerrada la conexion con la Base de Datos");
        }
        catch(SQLException e)
        {
            System.out.println("Error al cerrar la conexion con la Base de datos. \n"+e);
        }
    }
}

