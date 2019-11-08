package Vista;


import Controlador.Conexion;
import Vista.VentanaPrincipal;
import java.awt.Container;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Principal {

    private static VentanaPrincipal prog = new VentanaPrincipal();
    
    public static void main(String[] args) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                prog.setVisible(true);
            }
        });
    }
    
    public static VentanaPrincipal devolverVentana()
    {
        return prog;
    }
    
    public static void cambiarPanel(JPanel pane)
    {
        prog.setContentPane(pane);
    }
    
}
