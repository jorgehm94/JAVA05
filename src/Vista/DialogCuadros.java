package Vista;

import Modelo.ConsultasSQL;
import Modelo.Cuadro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge Herrera
 */
public class DialogCuadros extends javax.swing.JDialog {

    private ConsultasSQL gestionConsultas = new ConsultasSQL();
    private String galeriaSelec;
    
    DefaultTableModel model;

    private ArrayList listaC;
    private Cuadro cuadro;
    
    public DialogCuadros(java.awt.Frame parent, boolean modal, String galeria) {
        super(parent, modal);
        initComponents();
        this.galeriaSelec=galeria;
        
        // Cambiar el texto del dialog
        jLabel1.setText("Cuadros de la Galeria "+galeriaSelec);
        model = (DefaultTableModel) jTable1.getModel();
        
        
        llenarJtable();
        
        
    }

    private void llenarJtable()
    {
        gestionConsultas.verDatosCuadros(Integer.parseInt(galeriaSelec));
        
        Object columns[] = { "Autor", "Nombre", "Valor neto"};

        for (Object column : columns) {
            model.addColumn(column);
        }
      
        // Si la consulta da mayor que 1, es que necesitamos un ArrayList
        // Por el contrario solo devuelvo un objeto
        
      if (gestionConsultas.cantidadCuadros()>1)
      {
          listaC = gestionConsultas.devolverArrayListCuadros();
          int cont=0;
          
          while(cont<listaC.size())
          {
              añadirFila((Cuadro) listaC.get(cont));
              cont++;
          }
      }
      else
      {
          if (gestionConsultas.cantidadCuadros()==1) {
              
              Cuadro reg = gestionConsultas.devolverCuadro();
              añadirFila(reg);
          }
      }
      jTable1.setModel(model);
    }
    
    private void añadirFila(Cuadro obj)
    {
        model.addRow(new Object[]{obj.getAutor(), obj.getNombre(), obj.getValorNeto()}); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cuadros de la galeria ");

        botonAñadir.setText("Añadir nuevo cuadro");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botonCerrar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    // Si hacemos click al JTable muestro los datos del autor a traves de un dialog
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
       if(jTable1.getSelectedRow()!=-1)
       {
           int cod = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
           
           DialogAutor nuevo = new DialogAutor(Principal.devolverVentana(), true, cod);
           nuevo.setVisible(true);
       }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
                    
        DialogAñadirCuadro nuevo = new DialogAñadirCuadro(Principal.devolverVentana(), true, Integer.parseInt(galeriaSelec));
            nuevo.setTitle("Añadir cuadro en galeria "+galeriaSelec);
            nuevo.setVisible(true);
            
            // Actualizar los datos para añadir  filas en el jtable y otra vez las columnas, por que en el metodo ya lo repito
            model.setColumnCount(0);
            model.setRowCount(0);
            llenarJtable();

    }//GEN-LAST:event_botonAñadirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
