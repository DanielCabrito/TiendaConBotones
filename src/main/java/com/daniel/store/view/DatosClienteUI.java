/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.daniel.store.view;

import com.daniel.store.dao.ClientDAO;
import com.daniel.store.dao.BillDAO;
import com.daniel.store.entity.Bill;
import com.daniel.store.entity.Client;
import com.daniel.store.entity.Sale;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author carri
 */
public class DatosClienteUI extends javax.swing.JFrame {
     private DefaultListModel shoppingCarDescriptionModel;
    private Sale currentSale;
    private BillDAO facturaDao =new BillDAO();
    /**
     * Creates new form DatosClienteUI
     */
    
    
    public DatosClienteUI() {
        initComponents();
        loadClients();
    }
    
    public DatosClienteUI(DefaultListModel shoppingCarDescriptionMode, Sale currentSale) {
        initComponents();
        loadClients();
        this.shoppingCarDescriptionModel=shoppingCarDescriptionMode;
        this.currentSale = currentSale;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListClientes = new javax.swing.JList<>();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelRFC = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextRFC = new javax.swing.JTextField();
        jTextCorreo = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jButtonFacturar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        jListClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListClientes);

        jLabelTitulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("DATOS DEL CLIENTE");

        jLabelNombre.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelRFC.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelRFC.setText("RFC:");

        jLabelDireccion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelDireccion.setText("Direccion:");

        jLabelCorreo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelCorreo.setText("Correo:");

        jLabelTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelTelefono.setText("Telefono:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoActionPerformed(evt);
            }
        });

        jButtonFacturar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonFacturar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButtonFacturar.setText("Facturar");
        jButtonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturarActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonGuardar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonLimpiar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEliminar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelRFC)
                                            .addGap(56, 56, 56))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelDireccion)
                                                .addComponent(jLabelNombre))
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTelefono)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDireccion)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRFC)
                            .addComponent(jTextRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefono)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreo)
                            .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturarActionPerformed
         Bill bill =  new Bill();
         bill.setClient(selectedClient.getClientId());
         bill.setSaleId(currentSale.getSaleId());
         try {
             facturaDao.saveNewBillDB(bill);
         } catch (SQLException ex) {
             Logger.getLogger(DatosClienteUI.class.getName()).log(Level.SEVERE, null, ex);
         }
      
      FacturaUI factura=new FacturaUI(shoppingCarDescriptionModel, currentSale, selectedClient);
      factura.setVisible(true);
      factura.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_jButtonFacturarActionPerformed
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       Client  clientUi= new Client();
       
       String name=this.jTextFieldNombre.getText();
        if (name == null || name.isBlank() || name.trim().length() < 2 || name.trim().length() > 45) {
            JOptionPane.showMessageDialog(null, "ERROR: Nombre", " Datos Cliente ", JOptionPane.ERROR_MESSAGE);
            return;
        }
       clientUi.setName(name);
       //
       String adress=this.jTextDireccion.getText();
        if (adress == null || adress.isBlank() || adress.trim().length() < 2 || adress.trim().length() > 45) {
            JOptionPane.showMessageDialog(null, "ERROR: Direccion", "Datos Cliente", JOptionPane.ERROR_MESSAGE);
            return;
        }
       clientUi.setAddress(adress);
       //
       String rfc=this.jTextRFC.getText();
       if (rfc == null || rfc.isBlank() || rfc.trim().length() < 2 || rfc.trim().length() > 45) {
            JOptionPane.showMessageDialog(null, "ERROR: RFC", "Datos Cliente", JOptionPane.ERROR_MESSAGE);
            return;
        }
       clientUi.setRfc(rfc);
       //
       String cellPhone = this.jTextTelefono.getText();
       if (cellPhone == null || cellPhone.isBlank() || cellPhone.trim().length() < 2 || cellPhone.trim().length() > 45) {
            JOptionPane.showMessageDialog(null, "ERROR: RFC", "Datos Cliente", JOptionPane.ERROR_MESSAGE);
            return;
        }
       clientUi.setPhoneNumber(cellPhone);
       //
       String email=this.jTextCorreo.getText();
       if (email == null || email.isBlank() || email.trim().length() < 2 || email.trim().length() > 45) {
            JOptionPane.showMessageDialog(null, "ERROR: EMAIL ", "Datos Cliente", JOptionPane.ERROR_MESSAGE);
            return;
        }
       clientUi.setEmail(email);
       //
       clientUi.setClientId(1);
        System.out.println(clientUi);
        
        if(selectedClient==null){
            boolean saved = clientDao.saveNewProductToDB(clientUi);
            if (saved){
                JOptionPane.showMessageDialog(null, "Cliente guardado", "Cliente", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "ERROR:Cliete No Guardado", "Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            boolean saved =clientDao.updateExistingClientToDB(selectedClient.getClientId(), clientUi);
            if(saved){
                JOptionPane.showMessageDialog(null, "Cliente Actualizado", "Cliente", JOptionPane.INFORMATION_MESSAGE); 
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR: Producto NO Actualizado", "Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        loadClients();
        //selectedClient = clientUi
        cleanForm();
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
    cleanForm();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed
Client selectedClient = null;
    private void jListClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListClientesValueChanged

        if(!evt.getValueIsAdjusting()&& clientListLoaded ){
            JList lsm = (javax.swing.JList)evt.getSource();
            int index = lsm.getSelectedIndex();
            selectedClient =   clients.get(index);
            System.out.println(index + ": " + selectedClient);
        }       
        
        if(selectedClient!=null){
            this.jTextFieldNombre.setText(selectedClient.getName());
            this.jTextDireccion.setText(selectedClient.getAddress());
            this.jTextRFC.setText(selectedClient.getRfc());
            this.jTextTelefono.setText(selectedClient.getPhoneNumber());
            this.jTextCorreo.setText(selectedClient.getEmail());
        }
    }//GEN-LAST:event_jListClientesValueChanged

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
            
        if(selectedClient!=null){
            //2. El usuario no ha seleccionado ningun producto de la lista. Guardar nuevo producto.
            boolean deleted = clientDao.deleteClientFromDB(selectedClient.getClientId());
            if (deleted) {
                JOptionPane.showMessageDialog(null, "Clente Eliminado", "Clientes", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Cliente NO Eliminado", "Clientes ", JOptionPane.ERROR_MESSAGE);
            }
            this.loadClients();
        }
        cleanForm();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonFacturar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListClientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextRFC;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
DefaultListModel clientsModel = new DefaultListModel();
    ClientDAO clientDao = new ClientDAO();
    List<Client> clients = new ArrayList<>();
    List<String> clientsDescription = new ArrayList<>();
    boolean clientListLoaded = false;
        
    private void loadClients() {
        clientListLoaded = false;
        clientsModel = new DefaultListModel();
        clients = new ArrayList<>();
        clientsDescription = new ArrayList<>();
        
       
        jListClientes.setModel(clientsModel);
        clients = clientDao.getAllClientFromDB();
        
         for(Client p : clients){
             clientsDescription.add(" ID- " + p.getClientId() + " -Nombre " + p.getName() + " -Direccion " 
                     + p.getAddress() + " \nRFC " + p.getRfc() + " Telefono " + p.getPhoneNumber() + " -Correo " + p.getEmail());
         }
         
        clientsModel.addAll(clientsDescription);
        clientListLoaded =  true;
    }
    private void cleanForm(){
     jTextCorreo.setText(" ");
     jTextDireccion.setText(" ");
     jTextFieldNombre.setText(" ");
     jTextRFC.setText(" ");
     jTextTelefono.setText(" ");
        this.selectedClient = null;
    }
}
