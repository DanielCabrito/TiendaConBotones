/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.daniel.store.view;

import com.daniel.store.dao.SupplierDAO;
import com.daniel.store.entity.Supplier;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author carri
 */
public class ProveedoresUI extends javax.swing.JFrame {

    /**
     * Creates new form ProveedoresUI
     */
    public ProveedoresUI() {
        initComponents();
        loadSuppliers ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButtonEliminar = new javax.swing.JToggleButton();
        jToggleButtonGuardar = new javax.swing.JToggleButton();
        jToggleButtonCancelar = new javax.swing.JToggleButton();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNotas = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldNota = new javax.swing.JTextField();
        jLabelTituloProveedores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProveedores = new javax.swing.JList<>();
        jLabelTituloProveedores1 = new javax.swing.JLabel();
        jLabelFondoPantalla = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 991, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 684, -1, -1));

        jToggleButtonEliminar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jToggleButtonEliminar.setForeground(new java.awt.Color(102, 102, 102));
        jToggleButtonEliminar.setText("Eliminar");
        jToggleButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 140, 50));

        jToggleButtonGuardar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jToggleButtonGuardar.setForeground(new java.awt.Color(102, 102, 102));
        jToggleButtonGuardar.setText("Guardar");
        jToggleButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 140, 50));

        jToggleButtonCancelar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jToggleButtonCancelar.setForeground(new java.awt.Color(102, 102, 102));
        jToggleButtonCancelar.setText("Cancelar");
        getContentPane().add(jToggleButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 140, 50));

        jLabelTelefono.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTelefono.setText("Telefono:");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabelDireccion.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDireccion.setText("Direccion:");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabelNotas.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelNotas.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNotas.setText("Notas:");
        getContentPane().add(jLabelNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 440, 40));

        jTextFieldTelefono.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 440, 40));

        jTextFieldDireccion.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 440, 40));

        jTextFieldNota.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 440, 40));

        jLabelTituloProveedores.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTituloProveedores.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloProveedores.setText("PROVEEDORES");
        getContentPane().add(jLabelTituloProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jListProveedores.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jListProveedoresComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(jListProveedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 320));

        jLabelTituloProveedores1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTituloProveedores1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloProveedores1.setText("PROVEEDORES");
        getContentPane().add(jLabelTituloProveedores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelFondoPantalla.setIcon(new javax.swing.ImageIcon("C:\\Users\\carri\\Downloads\\INTERFAZ\\21423.png")); // NOI18N
        jLabelFondoPantalla.setText("jLabel1");
        jLabelFondoPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1003, 678));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonEliminarActionPerformed

    private void jToggleButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonGuardarActionPerformed

    private void jListProveedoresComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jListProveedoresComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jListProveedoresComponentHidden

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFondoPantalla;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNotas;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTituloProveedores;
    private javax.swing.JLabel jLabelTituloProveedores1;
    private javax.swing.JList<String> jListProveedores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNota;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JToggleButton jToggleButtonCancelar;
    private javax.swing.JToggleButton jToggleButtonEliminar;
    private javax.swing.JToggleButton jToggleButtonGuardar;
    // End of variables declaration//GEN-END:variables

     DefaultListModel supplierModel = new DefaultListModel();
    SupplierDAO supplierDao = new SupplierDAO();
    List<Supplier> suppliers;
    List<String> suppliersDescription = new ArrayList<>();
        
    private void loadSuppliers() {
        jListProveedores.setModel(supplierModel);
        suppliers = supplierDao.getAllSupplierFromDB();
        
         for(Supplier p :suppliers ){
             suppliersDescription.add(p.getName());
         }
         
        supplierModel.addAll(suppliersDescription);
    }

   
}
