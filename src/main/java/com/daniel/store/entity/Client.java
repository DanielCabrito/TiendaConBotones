/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 *
 * @author carri
 */
public class Client {
    private int clientId;
    private String name;
    private String address;
    private String rfc;
    private String phoneNumber;
    private String email;

    public Client() {
    }

    public Client(int clientId, String name, String address, String rfc, String phoneNumber, String email) {
        this.clientId = clientId;
        this.name = name;
        this.address = address;
        this.rfc = rfc;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" + "clientId=" + clientId + ", name=" + name + ", address=" + address + ", rfc=" + rfc + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }

   

    
   
    
}
