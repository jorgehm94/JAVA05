

package Vista;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author JorgeHerrera
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private int codPina;

    public VentanaPrincipal() {
        initComponents();
       
        // Desactivo el usuario el cual está conectado
        labelUsuario.setEnabled(false);
        
        try{
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
       
        setTitle("Programa Gestion BD");
        setIconImage(new ImageIcon("src/img/index.png").getImage());
        
        pedirDatos datos = new pedirDatos(this, true);
        
        datos.setVisible(true);
        
        controlarConexion(datos.estadoConexion(), datos.devolverUserOPass(1));
        guardarPinaco(datos.devolverUserOPass(1));
        
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
        panelPrincipal = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSuperior = new javax.swing.JMenu();
        itemConexion = new javax.swing.JMenuItem();
        verGalerias = new javax.swing.JMenuItem();
        itemNuevaGaleria = new javax.swing.JMenuItem();
        itemCerrarr = new javax.swing.JMenuItem();
        itemAcercaDe = new javax.swing.JMenuItem();
        menuValidar = new javax.swing.JMenu();

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

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        menuSuperior.setText("Menu");

        itemConexion.setText("Conexion");
        itemConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConexionActionPerformed(evt);
            }
        });
        menuSuperior.add(itemConexion);

        verGalerias.setText("Ver Galerias");
        verGalerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGaleriasActionPerformed(evt);
            }
        });
        menuSuperior.add(verGalerias);

        itemNuevaGaleria.setText("Nueva Galeria");
        itemNuevaGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevaGaleriaActionPerformed(evt);
            }
        });
        menuSuperior.add(itemNuevaGaleria);

        itemCerrarr.setText("Cerrar Conexion");
        itemCerrarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarrActionPerformed(evt);
            }
        });
        menuSuperior.add(itemCerrarr);

        itemAcercaDe.setText("Acerca de");
        itemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaDeActionPerformed(evt);
            }
        });
        menuSuperior.add(itemAcercaDe);

        jMenuBar1.add(menuSuperior);

        menuValidar.setText("Validar NIF");
        menuValidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuValidarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuValidar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarPinaco(String user)
    {
        try {
            
            codPina = Integer.parseInt(user);
        } catch (NumberFormatException e) {}
    }
    
    
    private void itemConexionActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_itemConexionActionPerformed
        
        pedirDatos datos = new pedirDatos(this, true);
        
        datos.setVisible(true);
        
        controlarConexion(datos.estadoConexion(), datos.devolverUserOPass(1));
        guardarPinaco(datos.devolverUserOPass(1));
        
    }//GEN-LAST:event_itemConexionActionPerformed

    
    private void controlarConexion(boolean conex, String user)
    {
        if (conex)
        {
            itemCerrarr.setEnabled(true);
            itemConexion.setEnabled(false);
            verGalerias.setEnabled(true);
            itemNuevaGaleria.setEnabled(true);
            
            labelUsuario.setEnabled(true);
            labelUsuario.setText("PINACOTECA: "+user);
        }
        else
        {
            labelUsuario.setEnabled(true);
            labelUsuario.setText("NO CONECTADO");
            itemCerrarr.setEnabled(false);
            verGalerias.setEnabled(false);
            itemConexion.setEnabled(true);
            itemNuevaGaleria.setEnabled(false);
        }
        
    }
    
    
    private void itemCerrarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarrActionPerformed
       labelUsuario.setEnabled(false);
       itemConexion.setEnabled(true);
       itemCerrarr.setEnabled(false);
       
       this.setContentPane(panelPrincipal);
       controlarConexion(false, null);
       
       // Redimensionar un JFrame
       this.pack();
        
    }//GEN-LAST:event_itemCerrarrActionPerformed

    private void verGaleriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGaleriasActionPerformed
        verGalerias nuevo = new verGalerias(codPina);
        
        this.setContentPane(nuevo);
        this.pack();
       
    }//GEN-LAST:event_verGaleriasActionPerformed

    private void itemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaDeActionPerformed
        
        AcercaDe nuevo = new AcercaDe(this, true);
        nuevo.setTitle("Version: 0.0.12");
        nuevo.setVisible(true);
    }//GEN-LAST:event_itemAcercaDeActionPerformed

    private void itemNuevaGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevaGaleriaActionPerformed
       
        this.setContentPane(panelPrincipal);
        this.pack();
        NuevaGaleria nueva = new NuevaGaleria(this, true, codPina);
        nueva.setTitle("Nueva galeria en pinacoteca "+ codPina);
        nueva.setVisible(true);
        
    }//GEN-LAST:event_itemNuevaGaleriaActionPerformed

    private void menuValidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuValidarMouseClicked
            validarNIF nuevo = new validarNIF(this, true);
            nuevo.setTitle("Validar NIF");
            nuevo.setVisible(true);
    }//GEN-LAST:event_menuValidarMouseClicked

    private void desactivarPanel(JPanel nuevo)
    {
        nuevo.setVisible(false);
    }
    
    private void activarPanel(JPanel nuevo)
    {
        nuevo.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JMenuItem itemCerrarr;
    private javax.swing.JMenuItem itemConexion;
    private javax.swing.JMenuItem itemNuevaGaleria;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JMenu menuSuperior;
    private javax.swing.JMenu menuValidar;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JMenuItem verGalerias;
    // End of variables declaration//GEN-END:variables
}
