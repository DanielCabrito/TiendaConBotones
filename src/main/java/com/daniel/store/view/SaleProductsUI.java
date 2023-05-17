/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.daniel.store.view;

import com.daniel.store.dao.ProductDAO;
import com.daniel.store.dao.SaleDAO;
import com.daniel.store.dao.SaleProductDAO;
import com.daniel.store.entity.Product;
import com.daniel.store.entity.Sale;
import com.daniel.store.entity.SaleProduct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carri
 */
public class SaleProductsUI extends javax.swing.JFrame {

    private SaleDAO saleDAO = new SaleDAO();
    private SaleProductDAO saleProductDao = new SaleProductDAO();
    private ProductDAO productDAO = new ProductDAO();
    private Sale currentSale;
    private Product selectedProduct = null;
    private final float IVA = 0.16f;
   
    /**
     * Al iniciar el UI hay que:
     * 1. Cargar el UI (initComponents() )
     * 2. Cargar Productos de la base de datos (tabla PRODUCTOS)
     * 3. Inicir un objeto Sale que representa la venta
     */
    public SaleProductsUI() {
        initComponents();
        loadProducts();
        currentSale = new Sale();
    }
    
    //Productos de la base de datos
    private List<Product> products = new ArrayList<>();
    //Descripciones para mostrar al usaurio en la lista de Productos
    private List<String> prodcutsDescription = new ArrayList<>();
    //Modelo usado para mostrar productos en la Lista
    DefaultListModel productsDescriptionModel = new DefaultListModel();
    boolean productListLoaded = false;
    
    //Cargar los productos disponibles para vender
    private void loadProducts() {
        productListLoaded = false;
        productsDescriptionModel = new DefaultListModel();
        products = new ArrayList<>();
        prodcutsDescription = new ArrayList<>();

        jListInventario.setModel(productsDescriptionModel);
        products = productDAO.getAllAvailableProductsFromDB();

        for (Product p : products) {
            prodcutsDescription.add(p.getName() +" - "+ p.getBrand()+ " - " + p.getPrice()+" - " + p.getStock());
        }

        productsDescriptionModel.addAll(prodcutsDescription);
        productListLoaded = true;
    }  
   
    
    //Productos del carrito
    private List<SaleProduct> shoppingCar = new ArrayList<>();
    //Modelo usado para mostrar productos en el carrito
    DefaultListModel shoppingCarDescriptionModel = new DefaultListModel();
    private void addToShoppingCar(){
        //1. Armar la descirpcion que se va a mostrar en el carrito
        String amount= this.jTextFieldCantidad.getText();
        if (amount == null || amount.isBlank() || amount.trim().length() < 1 || amount.trim().length() > 45) {
            JOptionPane.showMessageDialog(null, "ERROR: Cantidad", "Ventas", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String subtotal = this.jTextFieldPSubtotal.getText();
        String description = selectedProduct.getName() + " - " + amount + " - " + subtotal;
        
        //2. Guardar el producto seleccionado en el carrito 
        SaleProduct product = new SaleProduct();
        product.setProductId(selectedProduct.getProductId());
       
        product.setAmount(Integer.parseInt(amount));
        product.setUnitPrice((float) selectedProduct.getPrice());
        shoppingCar.add(product);
        this.jListCarrito.setModel(shoppingCarDescriptionModel);
        shoppingCarDescriptionModel.addElement(description);
        
        
         if (!subtotal.isEmpty()) {
        currentSale.setSubtotal(currentSale.getSubtotal() + Float.parseFloat(subtotal));
}
        this.jTextFieldTotal.setText( String.valueOf(currentSale.getTotal()));
        
        //3. Limpiar el formularoio
        this.cleanForm();
        selectedProduct = null;
        
        
    }
    
    private void calculateTotal(){
        try{
            //Cantidad ingressda
            int cantidad = Integer.parseInt( this.jTextFieldCantidad.getText() );
            //Buscar en el carrito si ya se agregaron productos del mismo
            for(SaleProduct p : this.shoppingCar){
                if(p.getProductId() == selectedProduct.getProductId()){
                    cantidad = cantidad + p.getAmount();
                    break;
                }
            }
            
            if(cantidad > selectedProduct.getStock()){
                JOptionPane.showMessageDialog(null, "ERROR: Inventario insuficiente", "Ventas", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double subtotal = cantidad * selectedProduct.getPrice();
            this.jTextFieldPSubtotal.setText(String.valueOf(subtotal));
        }catch(Exception ex){
            this.jTextFieldCantidad.setText("");
            this.jTextFieldPSubtotal.setText("");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jButtonPagar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelProductoID = new javax.swing.JLabel();
        jLabelPrecioUnidad = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelTituloTablaInventario = new javax.swing.JLabel();
        jLabelTituloTablaCarrito = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelProductoID1 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldPSubtotal = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelPrecioUnidad1 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListInventario = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCarrito = new javax.swing.JList<>();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAgregarCarrito = new javax.swing.JButton();
        jLabelFondoPantalla = new javax.swing.JLabel();

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPagar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPagar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButtonPagar.setForeground(new java.awt.Color(51, 255, 51));
        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });
        jPanel.add(jButtonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 160, 50));

        jLabelTitulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setText("VENTAS");
        jPanel.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jLabelProductoID.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelProductoID.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProductoID.setText("Producto:");
        jPanel.add(jLabelProductoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabelPrecioUnidad.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelPrecioUnidad.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPrecioUnidad.setText("Subtotal:");
        jPanel.add(jLabelPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabelCantidad.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCantidad.setText("Cantidad:");
        jPanel.add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabelTituloTablaInventario.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTituloTablaInventario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloTablaInventario.setText("INVENTARIO");
        jPanel.add(jLabelTituloTablaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        jLabelTituloTablaCarrito.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTituloTablaCarrito.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloTablaCarrito.setText("CARRITO");
        jPanel.add(jLabelTituloTablaCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 160, -1));

        jTextFieldPrice.setEditable(false);
        jTextFieldPrice.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextFieldPrice.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldPrice.setEnabled(false);
        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });
        jPanel.add(jTextFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 380, -1));

        jLabelProductoID1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelProductoID1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProductoID1.setText("Precio Unidad:");
        jPanel.add(jLabelProductoID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jTextFieldProductName.setEditable(false);
        jTextFieldProductName.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextFieldProductName.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldProductName.setEnabled(false);
        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });
        jPanel.add(jTextFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 380, -1));

        jTextFieldPSubtotal.setEditable(false);
        jTextFieldPSubtotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextFieldPSubtotal.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldPSubtotal.setEnabled(false);
        jTextFieldPSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPSubtotalActionPerformed(evt);
            }
        });
        jPanel.add(jTextFieldPSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 380, -1));

        jTextFieldCantidad.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextFieldCantidad.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCantidadFocusLost(evt);
            }
        });
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });
        jPanel.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 380, -1));

        jLabelPrecioUnidad1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelPrecioUnidad1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPrecioUnidad1.setText("Total:");
        jPanel.add(jLabelPrecioUnidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldTotal.setEnabled(false);
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });
        jPanel.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 380, -1));

        jListInventario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListInventario.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListInventarioValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListInventario);

        jPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 330));

        jListCarrito.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListCarrito);

        jPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 200, 330));

        jButtonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 51, 51));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 160, 50));

        jButtonAgregarCarrito.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgregarCarrito.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButtonAgregarCarrito.setForeground(new java.awt.Color(0, 153, 255));
        jButtonAgregarCarrito.setText("Agregar");
        jButtonAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCarritoActionPerformed(evt);
            }
        });
        jPanel.add(jButtonAgregarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 170, 50));

        jLabelFondoPantalla.setIcon(new javax.swing.ImageIcon("C:\\Users\\carri\\Downloads\\INTERFAZ\\21423.png")); // NOI18N
        jPanel.add(jLabelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1117, 666));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        //1. Guardar la Venta (genreal)
        currentSale.setIva( currentSale.getSubtotal() * IVA);
        currentSale.setTotal( currentSale.getIva() + currentSale.getSubtotal());
        int saleId;
        try {
            saleId = saleDAO.saveNewSaleDB(currentSale);
            currentSale.setSaleId(saleId);
        } catch (SQLException ex) {
            Logger.getLogger(SaleProductsUI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        for(SaleProduct product:shoppingCar){
            //2. Guardar cada producto vendido
            product.setSaleId(saleId);
            saleProductDao.saveNewProductSaleInDB(product);
            //3. Actuaizar Stock de productos vendidos
            productDAO.updateProductStockInDB(product);
        }
               

        SeleccionDeTicketFacturaUI seleccionUI = new SeleccionDeTicketFacturaUI (shoppingCarDescriptionModel, currentSale);
        
        //LIMPIAR TODO
        cleanForm();
        cleanShoppingCart();
        loadProducts();
        currentSale = new Sale();
        
        seleccionUI.setVisible(true);
        seleccionUI.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void cleanShoppingCart(){
        shoppingCar = new ArrayList<>();
        shoppingCarDescriptionModel = new DefaultListModel();
        this.jListCarrito.setModel(shoppingCarDescriptionModel);
    }
    
    private void cleanForm (){
        jTextFieldCantidad.setText(" ");
        jTextFieldPSubtotal.setText(" ");
        jTextFieldPrice.setText(" ");
        jTextFieldProductName.setText(" "); 
        selectedProduct = null;
    }
    
    
    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jTextFieldPSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPSubtotalActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jListInventarioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListInventarioValueChanged
        if(!evt.getValueIsAdjusting() && this.productListLoaded){
            JList lsm = (javax.swing.JList)evt.getSource();
            int index = lsm.getSelectedIndex();
            selectedProduct = products.get(index);
            System.out.println(index + ": " + selectedProduct);
        }       
        
        if(selectedProduct!=null){
            this.jTextFieldProductName.setText(selectedProduct.getName());
            this.jTextFieldPrice.setText(String.valueOf(selectedProduct.getPrice()));
            this.jTextFieldCantidad.setText("");
            this.jTextFieldPSubtotal.setText("");
        }
    }//GEN-LAST:event_jListInventarioValueChanged

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
DefaultTableModel tableModel = new DefaultTableModel();

 
         if(selectedProduct!=null){
            //2. El usuario no ha seleccionado ningun producto de la lista. Guardar nuevo producto.
            boolean deleted = productDAO(selectedProduct.getSupplierId());
            if (deleted) {
                JOptionPane.showMessageDialog(null, "Clente Eliminado", "Clientes", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Cliente NO Eliminado", "Clientes ", JOptionPane.ERROR_MESSAGE);
            }
            this.loadClients();
        }
        cleanForm();
        



    }//GEN-LAST:event_jButtonEliminarActionPerformed
           
      
     
    private void jButtonAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCarritoActionPerformed
        if(selectedProduct != null){
            addToShoppingCar();
        }       
    }//GEN-LAST:event_jButtonAgregarCarritoActionPerformed

    private void jTextFieldCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCantidadFocusLost
        calculateTotal();
    }//GEN-LAST:event_jTextFieldCantidadFocusLost

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCarrito;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelFondoPantalla;
    private javax.swing.JLabel jLabelPrecioUnidad;
    private javax.swing.JLabel jLabelPrecioUnidad1;
    private javax.swing.JLabel jLabelProductoID;
    private javax.swing.JLabel jLabelProductoID1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloTablaCarrito;
    private javax.swing.JLabel jLabelTituloTablaInventario;
    private javax.swing.JList<String> jListCarrito;
    private javax.swing.JList<String> jListInventario;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldPSubtotal;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
 

}
