
package Controlador;

import Modelo.Autor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorge Herrera
 */
public class GestionAutores {
    
    ResultSet datos;
    PreparedStatement sentenciaPreparada;
    Conexion conex = new Conexion();
    
    public void selectPreparedStatement(String con) throws Errores
    {
        
        try {
            sentenciaPreparada = conex.devolverConexion().prepareStatement(con, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    public void autores(int  cod) throws Errores
    {
        
        try {
            sentenciaPreparada.setInt(1, cod);
            datos = sentenciaPreparada.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            
            throw new Errores(1);
        }
    }
    
    public void autores() throws Errores
    {
        
        try {
            datos = sentenciaPreparada.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public void primero() throws Errores
    {
        try {
            datos.beforeFirst();
            datos.next();
         } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public void ultimo() throws Errores
    {
        try {
            datos.afterLast();
            datos.previous();
         } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public Autor devolverAutor() throws Errores
    {
        try {
            datos.next();
            Autor nuevo = new Autor(datos.getInt(1), datos.getString(2), datos.getString(3), datos.getInt(4), datos.getDate(5));
            
            return nuevo;
        } catch (SQLException ex) {
            System.out.println(ex.toString()); 
            throw new Errores(1);
        }
    }
    
    public ArrayList devolverAutores() throws Errores
    {
        try {
            ArrayList listA = new ArrayList();
            
            while (datos.next()) {                
                
                Autor nuevo = new Autor(datos.getInt(1), datos.getString(2), datos.getString(3), datos.getInt(4), datos.getDate(5));
                listA.add(nuevo);
            }
            
            return listA;
        } catch (SQLException ex) {
            System.out.println(ex.toString()); 
            throw new Errores(1);
        }
    }
    // Metodo que devuelve el valor neto de la tabla Cuadros
    public int calcularValorNeto(String ganancias, String perdidas, int gale, int autor) throws Errores
    {
        
         try {

            ResultSet gan, per;
            selectPreparedStatement(ganancias);
            sentenciaPreparada.setInt(1, gale);
            gan = sentenciaPreparada.executeQuery();
            
            selectPreparedStatement(perdidas);
            sentenciaPreparada.setInt(1, autor);
            per = sentenciaPreparada.executeQuery();
            
            gan.next();
            per.next();
            int total = gan.getInt(1)-per.getInt(1);
            
            return total;
        } 
         catch (SQLException z) {
            System.out.println(z.toString());
            throw new Errores(1);
        }

    }
    
    
}
