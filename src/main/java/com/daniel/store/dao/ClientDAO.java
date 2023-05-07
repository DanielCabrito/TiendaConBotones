/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.dao;

import com.daniel.store.entity.Client;
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
public class ClientDAO {
     private String myConnectionURL="jdbc:mysql://localhost:3306/tiendacabrito?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user="root";
    private String pwd="";
    
    public List<Client> getAllClientFromDB() { 
        List<Client> clientList = new ArrayList<>();
        //Conectarse a BD
        String sql = "SELECT * FROM tiendacabrito.CLIENTES";
        try (Connection con = DriverManager.getConnection(
                myConnectionURL,
                user, pwd); PreparedStatement ps = con.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Client p = new Client();
                    p.setClientId(rs.getInt("CLIENTE_ID"));
                    p.setName(rs.getString("NOMBRE"));
                    p.setAddress(rs.getString("DIRECCION"));
                    p.setRfc(rs.getString("RFC"));
                    p.setPhoneNumber(rs.getString("TELEFONO"));
                    p.setEmail(rs.getString("CORREO"));
                    clientList.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return clientList;
    }
}
