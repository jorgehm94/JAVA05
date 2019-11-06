
package Vista;

import Controlador.GestionDirector;
import Controlador.GestionSupermercado;
import Controlador.Principal;
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VisualizarDirector extends javax.swing.JPanel {
    
        GestionDirector con =new GestionDirector(); //Se crea nuevo objeto de la clase GestionDirector
        
        
    public VisualizarDirector() {
        initComponents();
        try {
           
            con.consulta("select * from DIRECTOR;"); //Se llama al metodo de consulta pasandole la consulta
            
            con.primero(); //Y nos colocamos en el principio
            
            controlBotones(); //Metodo para controlar botones
            
            // Los campos no se van a editar
            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            jTextField3.setEditable(false);
            
            // Oculto el campo de presupuesto
            jLabel4.setVisible(false);
            jTextField3.setVisible(false);
            //
            
            actualizarDatos(); //Funcion de actualizar datos
             
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Ha fallado esa consulta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        botonProductos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonAdelante = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();
        editarNombre = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        botonProductos.setText("PRODUCTOS");
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CÓDIGO DIRECTOR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adelante.png"))); // NOI18N
        botonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdelanteActionPerformed(evt);
            }
        });

        botonCalcular.setText("CALCULAR");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        editarNombre.setText("jButton2");
        editarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PRESUPUESTO");

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 198, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAtras)
                                .addGap(117, 117, 117)
                                .addComponent(botonCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAdelante)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarNombre))))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAtras)
                            .addComponent(botonAdelante))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonCalcular)
                        .addGap(48, 48, 48))))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Boton que llama a un JDialog que nos muestra las acciones relacionadas con ese director
    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        
        Acciones objeto; //Objeto del JDialog
        
          
            try {
                objeto = new Acciones(Principal.devolverVentana(),true, Integer.parseInt(con.devolverColumna(1))); //Se sobre pone al JFrame y se le pasa el codigo de director
                
                objeto.setTitle("Actividades");
                objeto.setVisible(true);
                objeto.pack();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(VisualizarDirector.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_botonProductosActionPerformed

    //Metodo de boton adelante
    private void botonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdelanteActionPerformed

        try {
            con.avanzar(); //Avanzamos
            
             botonCalcular.setEnabled(true); //Cuando se avanze se activa el boton "calcular"
        
        // oculto el campo de presupuesto
            jLabel4.setVisible(false);
            jTextField3.setVisible(false);
         
          
            controlBotones(); //Metodo para controlar botones
            
            actualizarDatos(); //Metodo para actualizar datos
        } catch (SQLException sQLException) {
        }
    }//GEN-LAST:event_botonAdelanteActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        try {
            
             botonCalcular.setEnabled(true); //Se habilita el boton Calcular
        
        // oculto el campo de presupuesto
            jLabel4.setVisible(false);
            jTextField3.setVisible(false);
          
            con.retroceder(); //Se retrocede
            
            controlBotones(); //Metodo para controlar botones
            
            actualizarDatos(); //Metodo para actualizar datos
        } catch (SQLException sQLException) {
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        
            botonCalcular.setEnabled(false);
        
        // Muestro el campo de presupuesto
            jLabel4.setVisible(true);
            jTextField3.setVisible(true);
          
          GestionSupermercado bd = new GestionSupermercado(); //Objeto de la clase Gestion Supermercado
          ResultSet ganancias;
          ResultSet inversiones;
          float ganan=0, inver=0, resul=0;
          
            try {
                String codigoDirector = con.devolverColumna(1); //Recdogemos el codigo de director

                bd.consulta("select sum(GANANCIAS) FROM VENTA V, SUPERMERCADO S WHERE V.COD_VEN=S.COD_SUP AND DIR_SUP="+codigoDirector+";"); //Hacemos la consulta
                
               ganancias  = bd.devolverResultSet(); //Lo guardamos
               
               bd.consulta("select sum(INVERSION) FROM REPOSICION R, SUPERMERCADO S WHERE R.COD_REP=S.COD_SUP AND DIR_SUP="+codigoDirector+";"); //Hacemos la consulta
          
               inversiones = bd.devolverResultSet(); //Lo guardamos
               
               ganancias.next();
               inversiones.next();
               
               //Se guardan tipo float
               ganan = ganancias.getFloat(1); 
               inver = inversiones.getFloat(1);
               
            } catch (SQLException ex) {
                Logger.getLogger(VisualizarDirector.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           resul = ganan-inver; //Se calcula el resultado
           
           jTextField3.setText(""+resul); //Se muestra
          
          
    }//GEN-LAST:event_botonCalcularActionPerformed

    
   //Se llama a un JDialog para cambiar el nombre de los directores
    private void editarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNombreActionPerformed
       
            try {
                cambioNombre c1 = new cambioNombre(Principal.devolverVentana(), true, Integer.parseInt(con.devolverColumna(1))); //Se sobrepone al JFrame y se pasa el codigo de director
                c1.setVisible(true);
                
                // Metodo para colocarme en el registro actualizado
               String cod = con.devolverColumna(1);
               con.consulta("select * from DIRECTOR;");
               while(con.isLast()==false)
               {
                   con.avanzar();
                   if(con.devolverColumna(1).equals(cod))
                       break;
               }

               controlBotones(); //Control de los botones
               
               actualizarDatos(); //Actualizamos los datos
               
            } catch (SQLException ex) {
                Logger.getLogger(VisualizarDirector.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_editarNombreActionPerformed

    //Metodo para controlar botones
    private void controlBotones()
    {
        try {
            if (con.isLast() == false) {
                botonAdelante.setEnabled(true);
            } else {
                botonAdelante.setEnabled(false);
            }
            
            if (con.isFirst() == false) {
                botonAtras.setEnabled(true);
            } else {
                botonAtras.setEnabled(false);
            }
        } catch (SQLException sQLException) {
        }
    }
    
    //Metodo para actualizar datos
    private void actualizarDatos()
    {
        try {
            //Se llama al metodo pasandole el indice de la columna para que nos devuelva la info
            jTextField1.setText("" + con.devolverColumna(1));
            jTextField2.setText("" + con.devolverColumna(2));
            
            jLabel2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+con.devolverColumna(1)+".jpg"))); //La imagen se escoge segun el codigo de director
            
        } catch (SQLException sQLException) {
        }
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdelante;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton editarNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
