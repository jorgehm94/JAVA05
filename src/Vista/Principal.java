package Vista;


import javax.swing.JPanel;

// Jorge Herrera

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
