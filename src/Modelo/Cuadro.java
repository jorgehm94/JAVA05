
package Modelo;

/**
 *
 * @author Jorge Herrera
 */
public class Cuadro {
    private int gale;
    private int autor;
    private int cantidad;
    private String nombre;
    private int valorNeto;

    public Cuadro(int gale, int autor, int cantidad, String nombre, int valorNeto) {
        this.gale = gale;
        this.autor = autor;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.valorNeto = valorNeto;
    }

    public int getGale() {
        return gale;
    }

    public void setGale(int gale) {
        this.gale = gale;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(int valorNeto) {
        this.valorNeto = valorNeto;
    }
    
    public String toString()
    {
        return "| "+this.gale+" | "+this.autor+" | "+this.cantidad+" | "+this.nombre+" | "+this.valorNeto+" |";
    }
    
}
