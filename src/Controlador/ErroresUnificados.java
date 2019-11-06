/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author JorgeHerrera
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
    
    public void mostrarMensajeError()
    {
        GregorianCalendar sistema = new GregorianCalendar();
        System.out.println("Creando log "+cont+"...");
        System.out.println("" + sistema.get(Calendar.DAY_OF_MONTH) + "/" + (sistema.get(Calendar.MONTH) + 1) + "/" + sistema.get(Calendar.YEAR) + " Hora: " + sistema.get(Calendar.HOUR) +":" + sistema.get(Calendar.MINUTE));
    }
    
    public void generarLog()
    {
       
        File carpeta = new File("logs/");

        if (carpeta.exists())
           crearFichero();
        else
        {
            carpeta.mkdir();
            crearFichero();
        }
            
    }
    
    private void crearFichero()
    {
        GregorianCalendar sistema = new GregorianCalendar();
        
        String mensaje = obtenerMensaje(codError);
        
        try {
            String ruta = "logs/log" + cont + ".txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            
            bw.write("" + sistema.get(Calendar.DAY_OF_MONTH) + "/" + (sistema.get(Calendar.MONTH) + 1) + "/" + sistema.get(Calendar.YEAR) + " Hora: " + sistema.get(Calendar.HOUR) +":" + sistema.get(Calendar.MINUTE) + "\n");
            bw.write(mensaje + "\n");
            cont++;
            bw.close();
            
        } catch (IOException iOException) {
        }
        
    }
}
