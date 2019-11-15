
package Controlador;

/**
 *
 * @author Jorge Herrera
 */

// Nada mas entrar guardo el codigo, para luego enviarlo al constructor de errores unificador
public class Errores extends Exception{
 
    private int codigoError;
    
    public Errores (int cod)
    {
        this.codigoError = cod;
        
    }
    
    public void lanzarMensaje()
    {
       ErroresUnificados nuevo = new ErroresUnificados(codigoError);
       nuevo.mostrarMensajeError();
       nuevo.generarLog();
       
       
    }
}
