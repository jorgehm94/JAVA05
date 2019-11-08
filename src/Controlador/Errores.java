
package Controlador;

/**
 *
 * @author Jorge Herrera
 */
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
