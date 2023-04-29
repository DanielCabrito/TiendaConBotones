/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.dao;

import com.daniel.store.entity.Document;
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
public class DocumentDAO {
    private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<Document> getAllProductsFromDB() { 
        List<Document> productList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PRODUCTOS";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Document p = new Document();
                    p.setDocumentsId(rs.getInt("DOCUMENTO_ID"));
                    p.setSite(rs.getString("LUGAR"));
                    p.setDate(rs.getInt("FECHA"));
                    p.setDatePay(rs.getInt("FECHA_A_PAGAR"));
                    p.setAmountPay(rs.getFloat("MONTO_A_PAGAR"));
                    p.setSupplierId(rs.getInt("PROVEEDORES_PROVEEDOR_ID1"));
                    productList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productList;
    }
}
