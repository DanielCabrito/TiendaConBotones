/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.main;

import com.daniel.store.dao.BillDAO;
import com.daniel.store.dao.ClientDAO;
import com.daniel.store.dao.DocumentDAO;
import com.daniel.store.dao.ProductDAO;
import com.daniel.store.dao.SaleDAO;
import com.daniel.store.dao.SaleProductDAO;
import com.daniel.store.dao.SupplierDAO;
import com.daniel.store.entity.Bill;
import com.daniel.store.entity.Client;
import com.daniel.store.entity.Document;
import com.daniel.store.entity.Product;
import com.daniel.store.entity.Sale;
import com.daniel.store.entity.SaleProduct;
import com.daniel.store.entity.Supplier;
import java.util.List;

/**
 *
 * @author carri
 */
public class Tienda {
     public static void main(String[] args) {
         //llamamos y hacemos visible nuestra pantalla
         //InicioTienda princ = new InicioTienda ();
         //princ.setVisible(true);
         //princ.setLocationRelativeTo(null);
         
         ProductDAO productDao = new ProductDAO();
         List<Product> prodcuts = productDao.getAllProductsFromDB();
         for(Product p : prodcuts){
             System.out.println(p);
         }
           BillDAO billDao = new BillDAO();
         List<Bill> bills = billDao.getAllProductsFromDB();
         for(Bill p : bills){
             System.out.println(p);
         }
          ClientDAO clientDao = new ClientDAO();
         List<Client> clients = clientDao.getAllProductsFromDB();
         for(Client p : clients){
             System.out.println(p);
         }
          DocumentDAO documentDao = new DocumentDAO();
         List<Document> documents = documentDao.getAllProductsFromDB();
         for(Document p : documents){
             System.out.println(p);
         }
          SaleDAO saleDao = new SaleDAO();
         List<Sale> sales = saleDao.getAllProductsFromDB();
         for(Sale p : sales ){
             System.out.println(p);
         }
          SaleProductDAO saleProductDao = new SaleProductDAO();
         List<SaleProduct> saleProducts = saleProductDao.getAllProductsFromDB();
         for(SaleProduct p : saleProducts){
             System.out.println(p);
         }
         SupplierDAO supplierDao = new SupplierDAO();
         List<Supplier> suppliers = supplierDao.getAllProductsFromDB();
         for(Supplier p : suppliers){
             System.out.println(p);
         }
         
         
     }
}
