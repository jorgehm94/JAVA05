/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionSupermercado;
import Controlador.Principal;
import Modelo.Reposicion;
import Modelo.Supermercado;
import Modelo.Venta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge Herrera - Sergio Ruiz
 */
public class Acciones extends javax.swing.JDialog {

    GestionSupermercado con = new GestionSupermercado();
    
    ArrayList<Venta> lisVenta = new ArrayList(); //ArrayList de la tabla Venta
    
    ArrayList<Reposicion> lisRepo = new ArrayList(); //ArrayList de la tabla Venta
    
    DefaultTableModel modelo, modelo1; //Declaracion de los modelos
    
    private int directorActual;
    
    public Acciones(java.awt.Frame parent, boolean modal, int codDir) throws SQLException {
        super(parent, modal);
        
        initComponents();
        
        modelo = (DefaultTableModel) jTable1.getModel(); //modelo para el JTable1
        
        modelo1 = (DefaultTableModel) jTable2.getModel(); //modelo para el JTable1
        
        rellenarTablaVenta(codDir); //Metodo para rellenar tabla Venta
        
        rellenarTablaRepo(codDir); //Metodo para rellenar tabla Reposicion
        
        directorActual = codDir;
        
        jLabel1.setText("Actividades del Director de codigo "+codDir);
    }
    
    //Metodo para rellenar tabla Venta
    private void rellenarTablaVenta(int codigo) throws SQLException
    {
        lisVenta = con.crearListaVenta(codigo); //Llamamos al metodo de la clase Gestion Supermercado que nos devuelve una lista
        
        Object vector[]; //Creamos un vector de tipo objeto
        
        int i=0; 
        while (i<lisVenta.size()) //Mientras no se llegue al final
        {
            vector = obtenerDatos(lisVenta.get(i)); //El vector se rellena
            modelo.addRow(vector); //Se añade al modelo
            i++; //Se suma al contador
        }
        
        jTable1.setModel(modelo); //El modelo se le aplica al JTable
        
    }
    
    //Metodo para rellenar tabla Reposicion (Explicacion en el metodo anterior)
    private void rellenarTablaRepo(int codigo) throws SQLException
    {
        lisRepo = con.crearListaRepo(codigo);
        
        Object vector[];
        
        int i=0; 
        while (i<lisRepo.size())
        {
            vector = obtenerDatos(lisRepo.get(i));
            modelo1.addRow(vector);
            i++;
        }
        
        jTable2.setModel(modelo1);
        
    }
            
    private Object[] obtenerDatos(Supermercado objeto) //Objeto de tipo Supermercado
    {
        Object vector[] = new Object[2]; //Creamos un vector del mismo numero de campos que la tabla
     
        vector[0] = objeto.getCod_sup(); //La primera celda es el codigo de Supermercado
        
        if (objeto instanceof Venta) //Se hace un casting 
            vector[1] = ( (Venta) objeto).getGanancias(); //Se guardara las ganancias
        else
            vector[1] = ( (Reposicion) objeto).getInversion(); // O las inversiones
        return vector;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        añadirActividad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Venta", "Ganancias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Reposicion", "Inversion"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        añadirActividad.setText("Añadir");
        añadirActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActividadActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(añadirActividad)
                        .addGap(130, 130, 130))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(añadirActividad)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(botonAtras)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //El boton atras hace que se cierre al ventana
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    //Si el usuario pulsa en el boton de añadir una nueva actividad, se crea un JDialog
    private void añadirActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActividadActionPerformed
        NuevaActividad p1 = new NuevaActividad(Principal.devolverVentana(), true, directorActual); // Se le pasa el codigo de Director
        p1.setTitle("Inserción de actividad");
        p1.setVisible(true);

        modelo.setRowCount(0); //Se resetean los modelos
        modelo1.setRowCount(0); //Se resetena los modelos
        
        try {
            rellenarTablaVenta(directorActual); //Se rellena la tabla venta con el director que se le pasa como parametro 
        } catch (SQLException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            rellenarTablaRepo(directorActual);//Se rellena la tabla venta con el director que se le pasa como parametro 
        } catch (SQLException ex) {
            Logger.getLogger(Acciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_añadirActividadActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirActividad;
    private javax.swing.JButton botonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
