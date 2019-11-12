
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class GestionGaleria {
    
    ResultSet consulta;
    Conexion conex = new Conexion();
    Statement sen;
    
    PreparedStatement sentencia;
    
    public GestionGaleria() throws Errores
    {
        try {
            sen = conex.devolverConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public void prepararSentencia(String con) throws Errores
    {

        try {
            sentencia = conex.devolverConexion().prepareStatement(con);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public int insertarGaleria(int codGaleria, String direccion, int codPina, int ganancias) throws Errores
    {
        try {
            sentencia.setInt(1, codGaleria);
            sentencia.setString(2, direccion);
            sentencia.setInt(3, codPina);
            sentencia.setInt(4, ganancias);
            int filas= sentencia.executeUpdate();
            return filas;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public void recogerConsulta(String con) throws Errores
    {
        try {
            consulta=sen.executeQuery(con);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public int devolverUltimoCod() throws Errores
    {
        try {
            consulta.next();
            return consulta.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
             throw new Errores(1);
        }
                
    }
    
    
    public void avanzar() throws Errores
    {
        try {
            consulta.next();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public void retroceder() throws Errores
    {
        try {
            consulta.previous();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    
    
    public void primero() throws Errores
    {
        try {
            consulta.beforeFirst();
            consulta.next();
        } catch (SQLException ex) {
            throw new Errores(1);
        }
    }
    
    public void ultimo() throws Errores
    {
        try {
            consulta.afterLast();
            consulta.previous();
        } catch (SQLException ex) {
            throw new Errores(1);
        }
    }
    
    
    public boolean esUltimo() throws Errores
    {
        try {
            return consulta.isLast();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    public boolean esPrimero() throws Errores
    {
        try {
            return consulta.isFirst();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            throw new Errores(1);
        }
    }
    
    
    public String devolverDato(int i) throws Errores
    {
        try {
            
            return consulta.getString(i);
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            throw new Errores(1);
        }
    }
    
}
