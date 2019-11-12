
package Modelo;

import java.util.Date;

/**
 *
 * @author Jorge Herrera
 */
public class Autor {
    
    private int codAutor;
    private String pais;
    private String nombre;
    private int costePintura;
    private Date fechaNacimiento;

    public Autor(int codAutor, String pais, String nombre, int costePintura, Date fechaNacimiento) {
        this.codAutor = codAutor;
        this.pais = pais;
        this.nombre = nombre;
        this.costePintura = costePintura;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCostePintura() {
        return costePintura;
    }

    public void setCostePintura(int costePintura) {
        this.costePintura = costePintura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public String toString()
    {
        return "| "+this.codAutor+" "+this.nombre+" "+this.pais+" "+this.costePintura+" "+this.fechaNacimiento+" |";
    }
    
    
}
