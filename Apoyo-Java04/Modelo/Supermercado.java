
package Modelo;

import java.sql.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class Supermercado {
    
    private int cod_sup;
    private int dir_sup;
    private Date fechaAper;

    public Supermercado(int cod_sup, int dir_sup, Date fechaAper) {
        this.cod_sup = cod_sup;
        this.dir_sup = dir_sup;
        this.fechaAper = fechaAper;
    }

    public int getCod_sup() {
        return cod_sup;
    }

    public void setCod_sup(int cod_sup) {
        this.cod_sup = cod_sup;
    }

    public int getDir_sup() {
        return dir_sup;
    }

    public void setDir_sup(int dir_sup) {
        this.dir_sup = dir_sup;
    }

    public Date getFechaAper() {
        return fechaAper;
    }

    public void setFechaAper(Date fechaAper) {
        this.fechaAper = fechaAper;
    }
    
    
    
}
