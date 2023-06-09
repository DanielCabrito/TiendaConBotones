/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

import java.util.Date;


/**
 *
 * @author carri
 */
public class Bill {
    private int billsId;
    private int clientId;
    private Date date;
    private int saleId;

    public Bill() {
    }

    public Bill(int billsId, int client, Date date, int saleId) {
        this.billsId = billsId;
        this.clientId = client;
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
        return clientId;
    }

    public void setClient(int client) {
        this.clientId = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
        return "Bill{" + "billsId=" + billsId + ", client=" + clientId + ", date=" + date + ", saleId=" + saleId + '}';
    }

    

    

    
}
