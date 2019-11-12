
package Vista;

import Controlador.Errores;
import Modelo.ConsultasSQL;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jorge Herrera
 */
public class NuevaGaleria extends javax.swing.JDialog {

    private int codPinacoteca;
    private ConsultasSQL controlSQL = new ConsultasSQL();
    private File fichero;
    private int codGaleria;
    public NuevaGaleria(java.awt.Frame parent, boolean modal, int codPina) {
        super(parent, modal);
        initComponents();
        this.codPinacoteca=codPina;
        actualizarDialog();
    }

 
    private void actualizarDialog()
    {
        ImageIcon def = new ImageIcon("src/img/default.png");
        def = adaptarImagen(def);
        labelFoto.setIcon(def);
        
        // Campo de codigo de galeria, accedo a el a traver de una consulta
        codGaleria = controlSQL.ultimoCodGaleria();
        codGaleria++;
        
        jTextField1.setText(""+codGaleria);
    }
    
    private ImageIcon adaptarImagen(ImageIcon i)
    {
        Image imagen = i.getImage();
        
        imagen = imagen.getScaledInstance(418, 328, Image.SCALE_SMOOTH);
       
        return new ImageIcon(imagen);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        labelFoto = new javax.swing.JLabel();
        botonCambiar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Direccion:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ganancias:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo de galeria:");

        jTextField1.setEditable(false);

        botonCambiar.setText("Cambiar imagen");
        botonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonCancelar)
                                .addGap(63, 63, 63)
                                .addComponent(botonAceptar)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonCambiar)
                                .addGap(39, 39, 39)))))
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(botonCambiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarActionPerformed
         JFileChooser imagenUsuario = new JFileChooser();
       //Añadir filtro personalizado a filechooser
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "png", "jpg", "jpeg");
       imagenUsuario.setFileFilter(filter);
       imagenUsuario.addChoosableFileFilter(filter);
       
       // Desactivar todos los archivos del filtro del filechooser
       imagenUsuario.setAcceptAllFileFilterUsed(false);
       
       int seleccion = imagenUsuario.showDialog(this, "Pillar imagen");
       
       if (seleccion == JFileChooser.APPROVE_OPTION)
       {
           fichero = imagenUsuario.getSelectedFile();
           ImageIcon image = new ImageIcon(fichero.getPath());
           image = adaptarImagen(image);
           labelFoto.setIcon(image);
       }
    }//GEN-LAST:event_botonCambiarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        try {
            String dire = jTextField2.getText();
            int ganancias = Integer.parseInt(jTextField3.getText());
            
            ImageIcon as = (ImageIcon) labelFoto.getIcon();
            String origen;
            
            if(fichero == null)
                origen = "src/img/default.png";
            else
                origen = fichero.getAbsolutePath();
            
            String destino = "src/img/"+codGaleria+".jpg";
            
          Files.copy(Paths.get(origen), Paths.get(destino), REPLACE_EXISTING);
          int filas = controlSQL.insertarGaleria(codGaleria, dire, codPinacoteca, ganancias);
          if(filas>0)
          {
              JOptionPane.showMessageDialog(this, "Galeria añadida correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
          }
          
          dispose();
        } catch (NumberFormatException ex) {
            Errores error = new Errores(4);
            error.lanzarMensaje();
        } catch (IOException ex) { }
        
    }//GEN-LAST:event_botonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCambiar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelFoto;
    // End of variables declaration//GEN-END:variables
}
