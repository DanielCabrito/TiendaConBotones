package com.daniel.store.dao;

import com.daniel.store.entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<Product> getAllProductsFromDB() { 
        List<Product> productList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PRODUCTOS";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Product p = new Product();
                    p.setProductId(rs.getInt("PRODUCTO_ID"));
                    p.setName(rs.getString("NOMBRE"));
                    p.setBrand(rs.getString("MARCA"));
                    p.setPrice(rs.getDouble("PRECIO"));
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    p.setNotes(rs.getString("NOTAS"));
                    p.setStock(rs.getInt("INVENTARIO"));
                    productList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productList;
    }

    //Regresa los productos disponibles (producto con al menos una existencia en inventario)
     public List<Product> getAllAvailableProductsFromDB() { 
        List<Product> productList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PRODUCTOS WHERE INVENTARIO>0";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Product p = new Product();
                    p.setProductId(rs.getInt("PRODUCTO_ID"));
                    p.setName(rs.getString("NOMBRE"));
                    p.setBrand(rs.getString("MARCA"));
                    p.setPrice(rs.getDouble("PRECIO"));
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    p.setNotes(rs.getString("NOTAS"));
                    p.setStock(rs.getInt("INVENTARIO"));
                    productList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productList;
    }

     
    public boolean setProductToDB(Product producto) {
        String sql = "INSERT INTO tiendacabrito.PRODUCTOS (NOMBRE, MARCA, PRECIO, PROVEEDOR_ID, NOTAS) "
                + "VALUES (?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection( myConnectionURL, user, pwd);
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, producto.getName());
            ps.setString(2, producto.getBrand());
            ps.setDouble(3, producto.getPrice());
            ps.setInt(4, producto.getSupplierId());
            ps.setString(5, producto.getNotes());
           
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
