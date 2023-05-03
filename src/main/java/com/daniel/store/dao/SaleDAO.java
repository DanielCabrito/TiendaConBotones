/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.dao;


import com.daniel.store.entity.Sale;
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
public class SaleDAO {
    private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<Sale> getAllSaleFromDB() { 
        List<Sale> saleList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.VENTAS";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Sale p = new Sale();
                    p.setSaleId(rs.getInt("VENTA_ID"));
                    p.setDate(rs.getInt("FECHA"));
                    p.setSubtotal(rs.getFloat("SUBTOTAL"));
                    p.setIva(rs.getFloat("IVA"));
                    p.setTotal(rs.getFloat("TOTAL"));
                    saleList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return saleList;
    }
}
