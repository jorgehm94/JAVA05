/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class GestionDirector {
        
    ResultSet datos;
    
    //Metodo de consulta
    public void consulta(String consulta) throws SQLException
    {
        Conexion con = new Conexion();
          
        datos = con.crearSentenciaDirector().executeQuery(consulta); //El "executeQuery" devuelve datos
    }
    
    //Metodo de update
    public void modificar(String consulta) throws SQLException
    {
        Conexion con = new Conexion();
          
        con.crearSentenciaDirector().execute(consulta); // El "execute" no devuelve datos
    }
    
    //Metodo para avanzar
    public void avanzar() throws SQLException
    {
        datos.next();
    }
    
    //Metodo para retroceder
    public void retroceder() throws SQLException
    {
        datos.previous();
    }
    
    //Metodo para acceder al primero
    public void primero() throws SQLException
    {
        datos.beforeFirst();
        datos.next(); //Esto se hace para colocarnos correctamente en la celda
    }
    
    //Metodo para acceder al ultimo
    public void ultimo() throws SQLException
    {
        datos.afterLast();
        datos.previous(); //Esto se hace para colocarnos correctamente en la celda
    }
    
    //Metodo que devuelve "TRUE" si es el primero
    public boolean isFirst() throws SQLException
    {
        return datos.isFirst();
    }
    
    //Metodo que devuelve "TRUE" si es el ultimo
    public boolean isLast() throws SQLException
    {
        return datos.isLast();
    }
    
    //Metodo que devuelve una columa pasandole como parametro un indice
    public String devolverColumna(int i) throws SQLException
    {
        return datos.getString(i);
    }
    
}
