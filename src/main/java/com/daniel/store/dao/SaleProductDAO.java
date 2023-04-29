/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.dao;


import com.daniel.store.entity.SaleProduct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carri
 */
public class SaleProductDAO {
    private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<SaleProduct> getAllProductsFromDB() { 
        List<SaleProduct> productList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PRODUCTOS";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    SaleProduct p = new SaleProduct();
                    p.setSaleProductId(rs.getInt("VENTAS_PRODUCTO_ID"));
                    p.setProductId(rs.getInt("PRODUCTO_ID"));
                    p.setAmount(rs.getInt("CANTIDAD"));
                    p.setUnitPrice(rs.getFloat("PRECIO_UNIDAD"));
                    p.setSaleId(rs.getInt("VENTA_ID"));
                    productList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productList;
    }
}
