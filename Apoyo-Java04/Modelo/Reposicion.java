
package Modelo;

/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
import java.sql.Date;
import java.util.GregorianCalendar;


public class Reposicion extends Supermercado{
    
    private float inversion;

    public Reposicion(float inversion, int cod_sup, int dir_sup, Date fechaAper) {
        super(cod_sup, dir_sup, fechaAper);
        this.inversion = inversion;
    }

    public float getInversion() {
        return inversion;
    }

    public void setInversion(float inversion) {
        this.inversion = inversion;
    }
    
    
}
