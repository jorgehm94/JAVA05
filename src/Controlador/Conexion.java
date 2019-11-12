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
    private static String ip = "192.168.59.128";
    public static void crearConexion(String pass) throws Errores
    {

         try {
            Class.forName("org.postgresql.Driver");  //loads the driver

            String url = "jdbc:postgresql://"+ip+":5432/PINACOTECA";
            
            conexionPostgres = DriverManager.getConnection(url, "jorge", pass);
            
            Class.forName("com.mysql.cj.jdbc.Driver");  //loads the driver
            
            String urls = "jdbc:mysql://"+ip+":3306/PINACOTECA?useSSL=false";
            
            conexionMysql = DriverManager.getConnection(urls, "jorge", pass);            
            
        } catch (ClassNotFoundException classNotFoundException) {
        } catch (SQLException sQLException) {
            System.out.println(sQLException.toString());
             throw new Errores(1);
        }

    }

    
    
    public boolean validarUsuario(String cod, String pass) throws Errores
    {
         try {
            Conexion.crearConexion(pass);

            String consulta = "select * from PINACOTECA where COD_PINA = ? ";
        
       
            PreparedStatement validacion = conexionPostgres.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rsP;
            ResultSet rsM;
            
            validacion.setInt(1, Integer.parseInt(cod));
            
            rsP = validacion.executeQuery();
            
            validacion = conexionMysql.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            validacion.setInt(1, Integer.parseInt(cod));
            
            rsM = validacion.executeQuery();
            
            if (rsP.next() && rsM.next()) {
                return true;
            } else {
                throw new Errores(1);
            }
         }catch(NullPointerException | SQLException | NumberFormatException ex)
          {
              System.out.println(ex.toString());
              throw new Errores(1);
          }
        
    }
    

    //Metodo para cerrar la conexion con la base de datos
    public static void cerrarConexion() throws Errores
    {
         try {
            //Cierra la conexion de la Base de Datos
            conexionPostgres.close();
            conexionMysql.close();
            System.out.println("Cerrada la conexion con la Base de Datos");
        } catch (SQLException e) {
             System.out.println(e.toString());
             throw new Errores(1);
        }
       
    }
    
    public Connection devolverConexion()
    {
        return conexionPostgres;
    }
}

