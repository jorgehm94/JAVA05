
package Modelo;

import Controlador.*;
import java.util.ArrayList;



/**
 *
 * @author Jorge Herrera
 */

// Intermediario con las clases Gestion del controlador
public class ConsultasSQL {
     
    private GestionGaleria galerias;
    private GestionCuadros cuadros;
    private GestionAutores autores;
    
    public ConsultasSQL()
    {
        try {
            galerias  = new GestionGaleria();
            cuadros = new GestionCuadros();
            autores=new GestionAutores();
        } catch (Errores ex) {ex.lanzarMensaje();}
    }
    
    public void verDatosGaleria(int cod)
    {
        String consulta = "select * from GALERIA where pina_galeria = "+cod+" ;";
        
        try {
            galerias.recogerConsulta(consulta);
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
    // Metodo que manda el String con la consulta deseada, en este caso de Cuadros
    public void verDatosCuadros(int cod)
    {
        
        String consulta = "select gale, autor, cont, cuadro.nombre, ganancias-coste_pintura \"valor_neto\" from cuadro\n" +
        "inner join galeria on cuadro.gale=galeria.cod_galeria\n" +
        "inner join autor on cuadro.autor=autor.cod_autor where gale = ?;";
        
        try {
            cuadros.selectPreparedStatement(consulta);
            cuadros.cuadros(cod);
        } catch (Errores ex) {ex.lanzarMensaje();
        }
    }
    
    // Metodo que manda el String con la consulta deseada, en este caso de Cuadros
    public void verDatosAutores(int cod)
    {
        
        String consulta = "Select * from autor where cod_autor = ?";
        
        try {
            autores.selectPreparedStatement(consulta);
            autores.autores(cod);
        } catch (Errores ex) {ex.lanzarMensaje();
        }
    }
    
    
    public int ultimoCodGaleria()
    {
        try {
            String consulta = "Select max(cod_galeria) from galeria";
            
            galerias.prepararSentencia(consulta);
            galerias.recogerConsulta(consulta);
            return galerias.devolverUltimoCod();
        } catch (Errores ex) {
            ex.lanzarMensaje();
            return 0;
        }
     }
    
    public void todosLosAutores()
    {
        
        String consulta = "Select * from autor";
        try {
            autores.selectPreparedStatement(consulta);
            autores.autores();
        } catch (Errores ex) {ex.lanzarMensaje();
        }
    }
    
    public int obtenerContadorCuadros(int gale, int autor)
    {
        try {
            String consulta = "select COALESCE(max(cont), 0) from cuadro where gale=? and autor=?";
            cuadros.selectPreparedStatement(consulta);
            return cuadros.devolverContador(gale, autor);
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
        return 0;
    }
    
    public int calcularValorNeto(int gale, int autor)
    {
        try {
            String ganancias = "select ganancias from galeria where cod_galeria=?";
            String perdidas = "select coste_pintura from autor where cod_autor=?";
            
            int resul = autores.calcularValorNeto(ganancias, perdidas, gale, autor);
            return resul;
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
        return 0;
    }
    
    public int insertarCuadro(int gale, int autor, int cont, String nombre, int valorNeto)
    {
        try {
            String consulta="insert into cuadro values(?, ?, ?, ?, ?)";
            cuadros.selectPreparedStatement(consulta);
           return cuadros.insertarCuadro(gale, autor, cont, nombre, valorNeto);
        } catch (Errores ex) {
            ex.lanzarMensaje();
            return 0;
        }
    }
    
    public int insertarGaleria(int codGaleria, String direccion, int codPina, int ganancias)
    {
         try {
            String consulta="insert into galeria values(?, ?, ?, ?)";
            galerias.prepararSentencia(consulta);
           return galerias.insertarGaleria(codGaleria, direccion, codPina, ganancias);
        } catch (Errores ex) {
            ex.lanzarMensaje();
            return 0;
        }
    }
    
    
    public ArrayList devolverArrayListCuadros()
    {
        
        try {
            return cuadros.devolverCuadros();
        } catch (Errores ex) {ex.lanzarMensaje(); return null;}
        
    }
    
    
    public Cuadro devolverCuadro()
    {
        try {
            return cuadros.devolverCuadro();
        } catch (Errores ex) {ex.lanzarMensaje();return null;}
    }
    
    public Autor devolverAutor()
    {
        try {
            return autores.devolverAutor();
        } catch (Errores ex) {ex.lanzarMensaje();return null;}
    }
    
    public ArrayList devolverAutores()
    {
        try {
            return autores.devolverAutores();
        } catch (Errores ex) {ex.lanzarMensaje();return null;}
    }
    
   
    
    public int cantidadCuadros()
    {
        try {
            return cuadros.consultarTamaño();
        } catch (Errores ex) {ex.lanzarMensaje(); return 0;}
    
    }
    
    // PINACOTECA
    public void primeraPinacoteca()
    {
        try {
            galerias.primero();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
    //AUTOR
    public void primerAutor()
    {
        try {
            autores.primero();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
     //AUTOR
    public void ultimoAutor()
    {
        try {
            autores.ultimo();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
     // PINACOTECA
     public void ultimaPinacoteca()
    {
        try {
            galerias.ultimo();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
     // PINACOTECA
    public void avanzar()
    {
        try {
            galerias.avanzar();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
    
     // PINACOTECA
    public void retroceder()
    {
        try {
            galerias.retroceder();
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
    }
     // PINACOTECA
    public boolean esUltimo()
    {
        boolean correcto = false;
        try {
           correcto= galerias.esUltimo();
        } catch (Errores ex) {ex.lanzarMensaje();}
        
        return correcto;
    }
    
     // PINACOTECA
    public boolean esPrimero()
    {
        boolean correcto = false;
        try {
            correcto= galerias.esPrimero();
        } catch (Errores ex) {ex.lanzarMensaje();}
        
        return correcto;
    }
    
     // PINACOTECA
    public String devolverDatoPinaco(int i)
    {
        String dato = null;
        
        try {
            dato = galerias.devolverDato(i);
            
        } catch (Errores ex) {
           ex.lanzarMensaje();
        }
        
        return dato;
    }
    
    
    
    
    
    
    
}
