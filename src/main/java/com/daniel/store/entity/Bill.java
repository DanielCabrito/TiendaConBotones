/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 *
 * @author carri
 */
public class Bill {
    private int billsId;
    private int client;
    private int date;
    private int saleId;

    public Bill() {
    }

    public Bill(int billsId, int client, int date, int saleId) {
        this.billsId = billsId;
        this.client = client;
        this.date = date;
        this.saleId = saleId;
    }

    public int getBillsId() {
        return billsId;
    }

    public void setBillsId(int billsId) {
        this.billsId = billsId;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    @Override
    public String toString() {
        return "Bill{" + "billsId=" + billsId + ", client=" + client + ", date=" + date + ", saleId=" + saleId + '}';
    }

    
}
