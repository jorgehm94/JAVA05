
package Modelo;

import Controlador.Errores;
import Controlador.GestionPinacoteca;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Herrera
 */
public class ConsultasSQL {
    
    private String consulta;
    
    private GestionPinacoteca pinacoteca;
    
    
    public ConsultasSQL()
    {
        try {
            pinacoteca  = new GestionPinacoteca();
        } catch (Errores ex) {ex.lanzarMensaje();}
    }
    
    public void verDatos(int cod)
    {
        String consulta = "select * from GALERIA where pina_galeria = "+cod+" ;";
        
        try {
            pinacoteca.recogerConsulta(consulta);
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
    public void primero()
    {
        try {
            pinacoteca.primero();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
     public void ultimo()
    {
        try {
            pinacoteca.ultimo();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
    
    public void avanzar()
    {
        try {
            pinacoteca.avanzar();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
    
    public void retroceder()
    {
        try {
            pinacoteca.retroceder();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
    public boolean esUltimo()
    {
        boolean correcto = false;
        try {
           correcto= pinacoteca.esUltimo();
        } catch (Errores ex) {ex.lanzarMensaje();}
        
        return correcto;
    }
    
    public boolean esPrimero()
    {
        boolean correcto = false;
        try {
            correcto= pinacoteca.esPrimero();
        } catch (Errores ex) {ex.lanzarMensaje();}
        
        return correcto;
    }
    
    public String devolverDato(int i)
    {
        String dato = null;
        
        try {
            dato = pinacoteca.devolverDato(i);
            
        } catch (Errores ex) {
           ex.lanzarMensaje();
        }
        
        return dato;
    }
    
    
    
    
    
}
