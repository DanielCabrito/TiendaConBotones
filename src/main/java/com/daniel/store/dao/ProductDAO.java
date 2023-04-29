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
                    productList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return productList;
    }

}
