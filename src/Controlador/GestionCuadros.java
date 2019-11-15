
package Controlador;

import Modelo.Cuadro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorge Herrera
 */
public class GestionCuadros {
    ResultSet consulta;
    Conexion conex = new Conexion();
    
    PreparedStatement sentencia;
    ArrayList cuadros;
    Cuadro pintura;
    
    public void selectPreparedStatement(String con) throws Errores
    {
        
        try {
            sentencia = conex.devolverConexion().prepareStatement(con, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public int consultarTamaño() throws Errores
    {
        try {
            consulta.last();
            int tamaño = consulta.getRow();
            consulta.beforeFirst();
            return tamaño;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public int devolverContador(int gale, int autor) throws Errores
    {
        try {
            ResultSet rs;
            sentencia.setInt(1, gale);
            sentencia.setInt(2, autor);
            rs = sentencia.executeQuery();
           if (rs.next())
               return rs.getInt(1);
           else
               return 0;
           
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
        
    }
    
    public void cuadros(int cod) throws Errores
    {
        try {
            sentencia.setInt(1, cod);
            consulta = sentencia.executeQuery();
            consulta.first();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public ArrayList devolverCuadros() throws Errores
    {
        try {
             cuadros = new ArrayList();
            
            while(consulta.next())
            {
                Cuadro nuevo = new Cuadro(consulta.getInt(1), consulta.getInt(2), consulta.getInt(3), consulta.getString(4), consulta.getInt(5));
                cuadros.add(nuevo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
        
        return cuadros;
    }
    
    public Cuadro devolverCuadro() throws Errores
    {
        try {
            consulta.next();
            Cuadro nuevo = new Cuadro(consulta.getInt(1), consulta.getInt(2), consulta.getInt(3), consulta.getString(4), consulta.getInt(5));
            return nuevo;
        } catch (SQLException ex) {
            System.out.println(ex.toString()); 
            throw new Errores(1);
        }
    }
    
    public int insertarCuadro(int gale, int autor, int cont, String nombre, int valor) throws Errores
    {
        try {
            sentencia.setInt(1, gale);
            sentencia.setInt(2, autor);
            sentencia.setInt(3, cont);
            sentencia.setString(4, nombre);
            sentencia.setInt(5, valor);
            
            
            int filas = sentencia.executeUpdate();
            return filas;
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
        
    }
    
}
