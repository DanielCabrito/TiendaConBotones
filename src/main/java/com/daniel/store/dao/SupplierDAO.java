/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.dao;


import com.daniel.store.entity.Supplier;
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
public class SupplierDAO {
    private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<Supplier> getAllProductsFromDB() { 
        List<Supplier> productList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PRODUCTOS";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Supplier p = new Supplier();
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    p.setName(rs.getString("NOMBRE"));
                    p.setPhoneNumber(rs.getInt("TELEFONO"));
                    p.setAdress(rs.getString("DIRECCION"));
                    p.setNote(rs.getString("NOTAS"));
                    productList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productList;
    }
}
