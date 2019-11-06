

package Vista;

import Controlador.Errores;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author JorgeHerrera
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        
        // Desactivo el usuario el cual está conectado
        labelUsuario.setEnabled(false);
        
        try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
          }
          catch (Exception e)
          {
               e.printStackTrace();
          }
        
        
        pedirDatos datos = new pedirDatos(this, true);
        
        datos.setVisible(true);
        
        if(datos.estadoConexion())
        {
            itemCerrarr.setEnabled(true);
            itemConexion.setEnabled(false);
            String usuario = datos.devolverUserOPass(1);
            labelUsuario.setEnabled(true);
            labelUsuario.setText("PINACOTECA: "+usuario);
            
        }
        else
        {
            labelUsuario.setEnabled(false);
            itemCerrarr.setEnabled(false);
            itemConexion.setEnabled(true);
        }
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        labelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSuperior = new javax.swing.JMenu();
        itemConexion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        itemCerrarr = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        menuSuperior.setText("Menu");

        itemConexion.setText("Conexion");
        itemConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConexionActionPerformed(evt);
            }
        });
        menuSuperior.add(itemConexion);

        jMenuItem2.setText("jMenuItem2");
        menuSuperior.add(jMenuItem2);

        itemCerrarr.setText("Cerrar Conexion");
        itemCerrarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarrActionPerformed(evt);
            }
        });
        menuSuperior.add(itemCerrarr);

        jMenuBar1.add(menuSuperior);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemConexionActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_itemConexionActionPerformed
        
        pedirDatos datos = new pedirDatos(this, true);
        
        datos.setVisible(true);
        
        if(datos.estadoConexion())
        {
            itemCerrarr.setEnabled(true);
            itemConexion.setEnabled(false);
            
            String usuario = datos.devolverUserOPass(1);
            labelUsuario.setEnabled(true);
            labelUsuario.setText("PINACOTECA: "+usuario);
        }
        else
        {
            labelUsuario.setEnabled(false);
            itemCerrarr.setEnabled(false);
            itemConexion.setEnabled(true);
        }
            
    }//GEN-LAST:event_itemConexionActionPerformed

    private void itemCerrarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarrActionPerformed
       labelUsuario.setEnabled(false);
       itemConexion.setEnabled(true);
       itemCerrarr.setEnabled(false);
    }//GEN-LAST:event_itemCerrarrActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCerrarr;
    private javax.swing.JMenuItem itemConexion;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JMenu menuSuperior;
    // End of variables declaration//GEN-END:variables
}
