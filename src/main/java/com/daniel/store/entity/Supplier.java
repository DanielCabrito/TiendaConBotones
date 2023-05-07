/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 *
 * @author carri
 */
public class Supplier {
    private int supplierId;
    private String name;
    private String phoneNumber;
    private String adress;
    private String note;

    public Supplier() {
    }

    public Supplier(int supplierId, String name, String phoneNumber, String adress, String note) {
        this.supplierId = supplierId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.note = note;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Supplier{" + "supplierId=" + supplierId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", adress=" + adress + ", note=" + note + '}';
    }

    
    
}
