
package Vista;

import Controlador.Conexion;
import Controlador.Principal;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Jorge Herrera
 */
public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal() {
        initComponents();
        
        
        visualizar.setEnabled(false);
        acerca.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        conexion = new javax.swing.JMenuItem();
        visualizar = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PROGRAMA DE GESTION CON BASE DE DATOS");

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        conexion.setText("Conexion");
        conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionActionPerformed(evt);
            }
        });
        menu.add(conexion);

        visualizar.setText("Visualizar datos");
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });
        menu.add(visualizar);

        acerca.setText("Acerda de");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        menu.add(acerca);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Se llama a JDialog que muestra informacion acerca de la version
    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
            AcercaDe a = new AcercaDe(this, true); //Se sobre pone a este JFrame, y hasta que no se cierre el JDialog no se puede hacer nada
            a.setTitle("Version: 0.9.9");
            a.setVisible(true);
    }//GEN-LAST:event_acercaActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        
    }//GEN-LAST:event_menuActionPerformed
    
    //Se llama a JDialog que pide contraseña
    private void conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionActionPerformed
            
            String pass;
            
            pedirContraseña p1 = new pedirContraseña(this, true); //Se sobre pone a este JFrame, y hasta que no se cierre el JDialog no se puede hacer nada
            p1.setTitle("Verificacion");
            p1.setVisible(true);
            
    }//GEN-LAST:event_conexionActionPerformed

    //Visualizar los directores
    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        
        VisualizarDirector objeto = new VisualizarDirector();
        
        this.setContentPane(objeto);
        this.pack();
    }//GEN-LAST:event_visualizarActionPerformed

    // Metodo que llamo en la conexion para activar los otros menus si la conexion sale bien
    public void activarMenu()
    {
             acerca.setEnabled(true);
             visualizar.setEnabled(true);
    }
    // Metodo que llamo en la conexion para desactivar los otros menus si la conexion sale mal
    public void desactivarMenu()
    {
             acerca.setEnabled(false);
             visualizar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acerca;
    private javax.swing.JMenuItem conexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem visualizar;
    // End of variables declaration//GEN-END:variables
}
