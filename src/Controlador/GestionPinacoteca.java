/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class GestionPinacoteca {
    
    ResultSet consulta;
    Conexion conex = new Conexion();
    Statement sen;
    
    PreparedStatement sentencia;
    
    public GestionPinacoteca() throws Errores
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
    
    
    public void recogerConsulta(String con) throws Errores
    {
        try {
            consulta=sen.executeQuery(con);
            
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
