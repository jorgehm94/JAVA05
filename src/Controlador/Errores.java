
package Controlador;

import java.io.IOException;
import java.sql.SQLException;

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
    
    private void lanzarMensaje() throws IOException
    {
       ErroresUnificados nuevo = new ErroresUnificados(codigoError);
       nuevo.generarLog(codigoError);
       
    }
}
