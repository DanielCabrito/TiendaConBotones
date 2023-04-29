/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 *
 * @author carri
 */
public class Sale {
    private int saleId;
    private int date;
    private float subtotal;
    private float iva;
    private float total;

    public Sale() {
    }

    public Sale(int saleId, int date, float subtotal, float iva, float total) {
        this.saleId = saleId;
        this.date = date;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Sale{" + "saleId=" + saleId + ", date=" + date + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + '}';
    }
    
}
