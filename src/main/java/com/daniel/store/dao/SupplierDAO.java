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
    
    public List<Supplier> getAllSupplierFromDB() { 
        List<Supplier> supplierList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PROVEEDORES";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Supplier p = new Supplier();
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    p.setName(rs.getString("NOMBRE"));
                    p.setPhoneNumber(rs.getString("TELEFONO"));
                    p.setAdress(rs.getString("DIRECCION"));
                    p.setNote(rs.getString("NOTAS"));
                    supplierList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return supplierList;
    }
    
     public List<Supplier> getAllAvailableSuppliersFromDB() { 
        List<Supplier> supplierList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.PROVEEDORES WHERE PRODUCTO_ID>0";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                     Supplier p = new Supplier();
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    p.setName(rs.getString("NOMBRE"));
                    p.setPhoneNumber(rs.getString("TELEFONO"));
                    p.setAdress(rs.getString("DIRECCION"));
                    p.setNote(rs.getString("NOTAS"));
                    supplierList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return supplierList;
    }
    
    public boolean saveNewProductToDB(Supplier supplierUi) {
        String sql = "INSERT INTO tiendacabrito.PROVEEDORES (NOMBRE, TELEFONO, DIRECCION, NOTAS) "
                + "VALUES (?,?,?,?)";
        try (Connection con = DriverManager.getConnection( myConnectionURL, user, pwd);
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, supplierUi.getName());
            ps.setString(2, supplierUi.getPhoneNumber());
            ps.setString(3, supplierUi.getAdress());
            ps.setString(4, supplierUi.getNote());
           
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
   public boolean updateExistingSupplierToDB(int supplierId, Supplier supplierUi) {
    String sql = "UPDATE tiendacabrito.PROVEEDORES SET NOMBRE=?, TELEFONO=?, DIRECCION=?, NOTAS=? "
        + "WHERE PROVEEDOR_ID = ?";
    try (Connection con = DriverManager.getConnection(myConnectionURL, user, pwd);
            PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, supplierUi.getName());
        ps.setString(2, supplierUi.getPhoneNumber());
        ps.setString(3, supplierUi.getAdress());
        ps.setString(4, supplierUi.getNote());
        ps.setInt(5, supplierId);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    
     public boolean deleteSupplierFromDB(int supplierId) {
        
        String sql = "DELETE FROM tiendacabrito.PROVEEDORES WHERE PROVEEDOR_ID = ?";
        try (Connection con = DriverManager.getConnection( myConnectionURL, user, pwd);
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, supplierId);
           
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
