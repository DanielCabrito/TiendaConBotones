/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.daniel.store.view;


import com.daniel.store.dao.SaleDAO;
import com.daniel.store.dao.SaleProductDAO;

import com.daniel.store.entity.Sale;
import com.daniel.store.entity.SaleProduct;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author carri
 */
public class TicketUI extends javax.swing.JFrame {

    /**
     * Creates new form TicketUIÇ
     */
    public TicketUI() {
        initComponents();
        loadProductsDescription();
        loadSalesUI();
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
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTicket = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProductos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("TICKET");

        jListTicket.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jListTicket);

        jScrollPane2.setViewportView(jListProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListProductos;
    private javax.swing.JList<String> jListTicket;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
   DefaultListModel salesModel = new DefaultListModel();
    SaleDAO saleDao = new SaleDAO();
    List<Sale> sales;
    List<String> salesDescription = new ArrayList<>();
        
    private void loadSalesUI() {
        jListTicket.setModel(salesModel);
        sales = saleDao.getAllSaleFromDB();
        
         for(Sale p : sales){
             salesDescription.add(p.getSaleId() + "\\n" + p.getSubtotal()+ "\\n" + p.getIva() + "\\n" + p.getTotal());
         }
         
        salesModel.addAll(salesDescription);
    }
    
    DefaultListModel salesproductsModel = new DefaultListModel();
    SaleProductDAO saleProductDao = new SaleProductDAO();
    List<SaleProduct> saleProducts;
    List<String> salesProductsDescription = new ArrayList<>();
        
    private void loadProductsDescription() {
        jListProductos.setModel(salesproductsModel);
        saleProducts = saleProductDao.getAllSaleProductFromDB();
        
         for(SaleProduct p : saleProducts){
             salesProductsDescription.add( " ID Producto " + p.getProductId() + " -Cantidad " + p.getAmount() + " -$ " + p.getUnitPrice());
         }
         
        salesproductsModel.addAll(salesProductsDescription);
    }
}