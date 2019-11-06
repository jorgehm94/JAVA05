/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionSupermercado;
import java.awt.HeadlessException;
import java.sql.Date;
import java.util.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class NuevaActividad extends javax.swing.JDialog {

    private int directorActual;
    
    public NuevaActividad(java.awt.Frame parent, boolean modal, int cod) { //Se le pasa el codigo de Director
        super(parent, modal);
        initComponents();
        
        jTextField1.setText("");
        jTextField2.setText("");
        
        jTextField3.setEditable(false);
        jTextField3.setText(""+cod);
        
        directorActual = cod;
        
        desactivarCampos(); //Inicialmente los campos de texto estan desactivados
        
    }

    
    //Metodo para activar los campos
    public void activarCampos()
    {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jDatePicker1.setVisible(true);
        
    }
    
    //Metodo para desactivar los campos
    public void desactivarCampos()
    {
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jDatePicker1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ventaCheck = new javax.swing.JCheckBox();
        repoCheck = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        aceptarActividad = new javax.swing.JButton();
        cancelarActividad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo Actividad:");

        jLabel2.setText("Ganancias/Inversiones:");

        ventaCheck.setText("Venta");
        ventaCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaCheckActionPerformed(evt);
            }
        });

        repoCheck.setText("Reposicion");
        repoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repoCheckActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        aceptarActividad.setText("Aceptar");
        aceptarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActividadActionPerformed(evt);
            }
        });

        cancelarActividad.setText("Cancelar");
        cancelarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActividadActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo de director: ");

        jTextField3.setText("jTextField3");

        jLabel4.setText("Fecha de inicio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(ventaCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(repoCheck)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jDatePicker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(cancelarActividad)
                .addGap(83, 83, 83)
                .addComponent(aceptarActividad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ventaCheck)
                    .addComponent(repoCheck))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarActividad)
                    .addComponent(aceptarActividad))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para el checkbox de venta
    private void ventaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaCheckActionPerformed
        
        if(ventaCheck.isSelected())
        {
            repoCheck.setEnabled(false);
            repoCheck.setSelected(false);
            
            activarCampos();
            jLabel2.setText("Ganancias: ");
        }
        else
        {
            ventaCheck.setSelected(false);
            repoCheck.setEnabled(true);
            
            desactivarCampos();
        }
    }//GEN-LAST:event_ventaCheckActionPerformed
    //Metodo para el checkbox de reposicion
    private void repoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repoCheckActionPerformed
        if(repoCheck.isSelected())
        {
            ventaCheck.setEnabled(false);
            ventaCheck.setSelected(false);
            
            activarCampos();
            jLabel2.setText("Inversiones: ");
        }
        else
        {
            repoCheck.setSelected(false);
            ventaCheck.setEnabled(true);
            
            desactivarCampos();
        }
    }//GEN-LAST:event_repoCheckActionPerformed

    //Si se pulsa el boton de aceptar
    private void aceptarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActividadActionPerformed
        
        GestionSupermercado obj = new GestionSupermercado(); //Nuevo objeto de la clase Gestion Supermercado
        
        //Se recoge el codigo y la cantidad
        String codSuper = jTextField1.getText(); 
        String numero = jTextField2.getText();
        
        //Se recoge la fecha
        String f = ""+jDatePicker1.getModel().getYear()+"/"+jDatePicker1.getModel().getMonth()+"/"+jDatePicker1.getModel().getDay();
        
        
        try {
            
            obj.inserccion("insert into SUPERMERCADO values(" + codSuper + "," + directorActual + ",\'" + f + "\');"); //Se hace una insercion de lo introducido
            
            if (ventaCheck.isSelected()) { //Si el checkbox que se ha marcado es el de ventas se introduce datos en esa tabla
                obj.inserccion("insert into VENTA values(" + codSuper + "," + numero + ");");
            } else {
                if (repoCheck.isSelected()) { //Si el checkbox que se ha marcado es el de reposicion se introduce datos en esa tabla
                    obj.inserccion("insert into REPOSICION values(" + codSuper + "," + numero + ");");
                }
            }
            
            JOptionPane.showMessageDialog(null, "Has añadido una nueva actividad", "Nueva actividad", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(null, "Esa actividad ya existe", "Error actividad", JOptionPane.ERROR_MESSAGE);
            
        } 
        
        dispose(); //Se cierra la ventana
        
    }//GEN-LAST:event_aceptarActividadActionPerformed

    //Si se pulsa cancelar se cierra la ventana
    private void cancelarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActividadActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActividadActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarActividad;
    private javax.swing.JButton cancelarActividad;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JCheckBox repoCheck;
    private javax.swing.JCheckBox ventaCheck;
    // End of variables declaration//GEN-END:variables
}
