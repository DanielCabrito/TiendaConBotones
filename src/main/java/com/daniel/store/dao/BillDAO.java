/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.dao;

import com.daniel.store.entity.Bill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carri
 */
public class BillDAO {
    private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<Bill> getAllBillFromDB() { 
        List<Bill> billList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.FACTURA";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Bill p = new Bill();
                    p.setBillsId(rs.getInt("FACTURA_ID"));
                    p.setClient(rs.getInt("CLIENTE_ID"));
                    p.setDate(rs.getDate("FECHA"));
                    p.setSaleId(rs.getInt("VENTA_ID"));
                    billList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return billList;
    }
    
     public boolean saveNewBillDB(Bill bill) throws SQLException {
        String sql = "INSERT INTO tiendacabrito.FACTURA (FECHA,CLIENTE_ID, VENTA_ID) VALUES (CURRENT_TIMESTAMP,?,?)";
        try (Connection con = DriverManager.getConnection( myConnectionURL, user, pwd);
                PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            
            ps.setInt(1, bill.getClient());
            ps.setInt(2, bill.getSaleId());
            
        return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
