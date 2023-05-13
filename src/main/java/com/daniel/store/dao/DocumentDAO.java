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
    
    public List<Document> getAllDocumentFromDB() { 
        List<Document> documentList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.DOCUMENTOS_POR_PAGAR";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Document p = new Document();
                    p.setDocumentsId(rs.getInt("DOCUMENTO_ID"));
                    p.setSite(rs.getString("LUGAR"));
                    p.setDate(rs.getDate("FECHA"));
                    p.setDatePay(rs.getDate("FECHA_A_PAGAR"));
                    p.setAmountPay(rs.getFloat("MONTO_A_PAGAR"));
                    p.setSiteCompany(rs.getString("DIRECCION_EMPRESA"));
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    documentList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return documentList;
    }
    
    //Regresa los productos disponibles (producto con al menos una existencia en inventario)
     public List<Document> getAllAvailableDocumentsFromDB() { 
        List<Document> documentList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.DOCUMENTS WHERE INVENTARIO>0";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Document p = new Document();
                    p.setDocumentsId(rs.getInt("DOCUMENTO_ID"));
                    p.setSite(rs.getString("LUGAR"));
                    p.setDate(rs.getDate("FECHA"));
                    p.setDatePay(rs.getDate("FECHA_A_PAGAR"));
                    p.setAmountPay(rs.getFloat("MONTO_A_PAGAR"));
                    p.setSiteCompany(rs.getString("DIRECCION_EMPRESA"));
                    p.setSupplierId(rs.getInt("PROVEEDOR_ID"));
                    documentList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return documentList;
    }
    
    public boolean saveNewDocumentToDB(Document document) {
        String sql = "INSERT INTO tiendacabrito.DOCUMENTOS_POR_PAGAR ( DOCUMENTO_ID,LUGAR, FECHA, FECHA_A_PAGAR, MONTO_A_PAGAR, DIRECCION_EMPRESA, PROVEEDOR_ID) "
                + "VALUES (?,?,?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection( myConnectionURL, user, pwd);
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, document.getDocumentsId());
            ps.setString(2, document.getSite());
            ps.setDate(3, document.getDate());
            ps.setDate(4, document.getDatePay());
            ps.setFloat(5, document.getAmountPay());
            ps.setString(6,document.getSiteCompany());
            ps.setInt(7, document.getSupplierId());
           
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } public boolean updateExistingDocumentToDB(int documentsId, Document document) {
        String sql = "UPDATE tiendacabrito.DOCUMENTOS_POR_PAGAR SET LUGAR=?, FECHA=?, FECHA_A_PAGAR=?, MONTO_A_PAGAR=?, DIRECCION_EMPRESA=?, PROVEEDOR_ID=? "
        + "WHERE DOCUMENTO_ID = ?";

        try (Connection con = DriverManager.getConnection( myConnectionURL, user, pwd);
                PreparedStatement ps = con.prepareStatement(sql)) {
            
            
            ps.setString(1, document.getSite());
            ps.setDate(2, document.getDate());
            ps.setDate(3, document.getDatePay());
            ps.setFloat(4, document.getAmountPay());
            ps.setString(5,document.getSiteCompany());
            ps.setInt(6, document.getSupplierId());
            ps.setInt(7, documentsId);
           
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteDocument(int documentsId) {
    String sql = "DELETE FROM tiendacabrito.DOCUMENTOS_POR_PAGAR WHERE DOCUMENTO_ID = ?";
    try (Connection con = DriverManager.getConnection(myConnectionURL, user, pwd);
            PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, documentsId);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

   

    
}
    
    

