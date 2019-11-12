/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Errores;
import Modelo.ConsultasSQL;
import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Jorge Herrera
 */
public class verGalerias extends javax.swing.JPanel {
   
    private ConsultasSQL gestionConsultas = new ConsultasSQL();
    
    
    public verGalerias(int cod) {
        initComponents();
        
        gestionConsultas.verDatosGaleria(cod);
        gestionConsultas.avanzar();
        actualizarDatos();
        controlBotones();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirFoto = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textGanancias = new javax.swing.JTextField();
        labelFoto = new javax.swing.JLabel();
        botonAvanzar = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cambiarFoto = new javax.swing.JButton();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        verCuadros = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Codigo de galeria: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Direccion: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Ganancias:");

        textCodigo.setEditable(false);

        textDireccion.setEditable(false);

        textGanancias.setEditable(false);

        botonAvanzar.setText("--->");
        botonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzarActionPerformed(evt);
            }
        });

        botonRetroceder.setText("<---");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Fecha de hoy:");

        cambiarFoto.setText("Cambiar foto");
        cambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarFotoActionPerformed(evt);
            }
        });

        jDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatePicker1ActionPerformed(evt);
            }
        });

        verCuadros.setText("Ver cuadros de la galeria");
        verCuadros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCuadrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(botonRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verCuadros, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cambiarFoto)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(verCuadros)
                        .addGap(42, 42, 42))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        gestionConsultas.retroceder();
        actualizarDatos();
        controlBotones();
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvanzarActionPerformed
        gestionConsultas.avanzar();
        actualizarDatos();
        controlBotones();
    }//GEN-LAST:event_botonAvanzarActionPerformed

    private void cambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarFotoActionPerformed
        
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
           File fichero = imagenUsuario.getSelectedFile();
           String destino = "src/img/"+gestionConsultas.devolverDatoPinaco(1)+".jpg";
           String origen = fichero.getPath();
           
           try {
               Files.copy(Paths.get(origen), Paths.get(destino), REPLACE_EXISTING);
               JOptionPane.showMessageDialog(this, "Imagen cambiada con exito", "Exito",JOptionPane.INFORMATION_MESSAGE);
               actualizarDatos();
           } catch (IOException ex) {
           }

       }
       
       
    }//GEN-LAST:event_cambiarFotoActionPerformed

    private void jDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatePicker1ActionPerformed
        
        try {
            GregorianCalendar fecha = new GregorianCalendar(jDatePicker1.getModel().getYear(), jDatePicker1.getModel().getMonth(), jDatePicker1.getModel().getDay());
            comprobarFecha(fecha);
        } catch (Errores ex) {
            ex.lanzarMensaje();
        }
        
    }//GEN-LAST:event_jDatePicker1ActionPerformed

    private void verCuadrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCuadrosActionPerformed
        
        DialogCuadros nuevo  = new DialogCuadros(Principal.devolverVentana(), true, gestionConsultas.devolverDatoPinaco(1));
        nuevo.setTitle("Ver cuadros");
        nuevo.setVisible(true);
        
    }//GEN-LAST:event_verCuadrosActionPerformed

    private void colocarFechaActual()
    {
        GregorianCalendar fecha = new GregorianCalendar();
        
        jDatePicker1.getFormattedTextField().setText(""+fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR));
        
    }
   
    private void comprobarFecha(GregorianCalendar fecha) throws Errores
    {
        Date date = fecha.getTime();
        Date sistema = new Date();
        
        if(date != sistema){
            colocarFechaActual();
            JOptionPane.showMessageDialog(this, "No puedes modificar la fecha, para mas informacion examine el log", "Error de log",JOptionPane.OK_OPTION);
            throw new Errores(2);
            
        }
        
    }
    
    // Metodo que actualiza los datos para los campos de textos e imagen
    private void actualizarDatos()
    { 
        String url = "src/img/"+gestionConsultas.devolverDatoPinaco(1)+".jpg";
        
        GregorianCalendar fecha = new GregorianCalendar();
        
        jDatePicker1.getFormattedTextField().setText(""+fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR));
        
        ImageIcon i = new ImageIcon(url);
        
        i = adaptarImagen(i);

        labelFoto.setIcon(i);
        
        textCodigo.setText(""+gestionConsultas.devolverDatoPinaco(1));
        textDireccion.setText(""+gestionConsultas.devolverDatoPinaco(2));
        textGanancias.setText(""+gestionConsultas.devolverDatoPinaco(4));
        
    }
    
    // Metodo que adapta la imagen recibida por parametro al tamaño del label de las fotos de galerias
    private ImageIcon adaptarImagen(ImageIcon i)
    {
        Image imagen = i.getImage();
        
        imagen = imagen.getScaledInstance(551, 200, Image.SCALE_SMOOTH);
       
        return new ImageIcon(imagen);
    }
    
    private void controlBotones()
    {
        if(gestionConsultas.esPrimero())
        {
            botonRetroceder.setEnabled(false);
            botonAvanzar.setEnabled(true);
            
        }
        else
            botonRetroceder.setEnabled(true);
        
        if(gestionConsultas.esUltimo())
        {
            botonRetroceder.setEnabled(true);
            botonAvanzar.setEnabled(false);
        }
        else
            botonAvanzar.setEnabled(true);
        
        
    }

    public JPanel devolverPanel()
    {
        return this;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAvanzar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JButton cambiarFoto;
    private javax.swing.JFileChooser elegirFoto;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textGanancias;
    private javax.swing.JButton verCuadros;
    // End of variables declaration//GEN-END:variables
}
