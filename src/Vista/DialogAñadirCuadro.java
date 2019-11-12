
package Vista;

import Modelo.Autor;
import Modelo.ConsultasSQL;
import Modelo.Cuadro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Herrera
 */
public class DialogAñadirCuadro extends javax.swing.JDialog {

    private ConsultasSQL gesCon = new ConsultasSQL();
    private ArrayList autores;
    private Cuadro nuevo;
    private int gale;
    
    public DialogAñadirCuadro(java.awt.Frame parent, boolean modal, int galeria) {
        super(parent, modal);
        initComponents();
         this.gale=galeria;
        textGaleria.setText(""+gale);
        gesCon.todosLosAutores();
        autores= gesCon.devolverAutores();
        
        llenarCombo();
    }

    
    public void llenarCombo()
    {
       int cont =0;
       
       while(cont<autores.size())
       {
           comboAutor.addItem(((Autor)autores.get(cont)).toString());
           cont++;
       }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCancelar = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        labelGaleria = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        comboAutor = new javax.swing.JComboBox<>();
        textGaleria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        labelGaleria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelGaleria.setText("Galeria:");

        labelAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAutor.setText("Autor:");

        textGaleria.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelAutor)
                    .addComponent(labelGaleria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboAutor, 0, 225, Short.MAX_VALUE)
                    .addComponent(textNombre)
                    .addComponent(textGaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(botonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGaleria)
                    .addComponent(textGaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(comboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonAceptar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        int codAutor = comboAutor.getSelectedIndex();
        codAutor++;
        
        int contadorC = gesCon.obtenerContadorCuadros(gale, codAutor);
        contadorC++;
        
        int valorNeto = gesCon.calcularValorNeto(gale, codAutor);
        
        String nombreCuadro = textNombre.getText();
        
        int filas = gesCon.insertarCuadro(gale, codAutor, contadorC, nombreCuadro, valorNeto);
        
        if (filas > 0) {
            
            JOptionPane.showMessageDialog(this, "Cuadro nuevo insertado", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JComboBox<String> comboAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelGaleria;
    private javax.swing.JTextField textGaleria;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
