
package Modelo;

import java.sql.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class Venta extends Supermercado{
    
    private float ganancias;

    public Venta(float ganancias, int cod_sup, int dir_sup, Date fechaAper) {
        super(cod_sup, dir_sup, fechaAper);
        this.ganancias = ganancias;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
    
    
    
}
