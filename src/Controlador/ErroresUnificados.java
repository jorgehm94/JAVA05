/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class ErroresUnificados {
    
    private int codError;
    private static int cont = 1;
    public ErroresUnificados(int cod)
    {
        this.codError = cod;
    }
    
    protected String obtenerMensaje(int pos)
    {
        switch(pos)
        {
            case 1:
                return "Error en la base de datos";
                
            case 2:
                return "Error en la fecha";
                
            case 3:
                return "Error en el NIF";
            
            default:
                return "Estas doramio";
        }
        
    }
    
    protected void generarLog(int cod) throws IOException
    {
        GregorianCalendar sistema = new GregorianCalendar();
        
        String mensaje = obtenerMensaje(cod);
        
        FileWriter fichero = new FileWriter("/logs/log"+cont+".txt");
        
        fichero.write(""+sistema.get(Calendar.DAY_OF_WEEK)+"/"+sistema.get(Calendar.MONTH)+"/"+sistema.get(Calendar.YEAR)+"Hora: "+sistema.get(Calendar.HOUR)+"\n");
        fichero.write(mensaje+"\n");
        cont++;
        fichero.close();
        
    }
}
