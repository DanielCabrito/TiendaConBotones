/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 *
 * @author carri
 */
public class Document {
    private int documentsId;
    private String site;
    private int date;
    private int datePay;
    private float amountPay;
    private int supplierId;

    public Document() {
    }

    public Document(int documentsId, String site, int date, int datePay, float amountPay, int supplierId) {
        this.documentsId = documentsId;
        this.site = site;
        this.date = date;
        this.datePay = datePay;
        this.amountPay = amountPay;
        this.supplierId = supplierId;
    }

    public int getDocumentsId() {
        return documentsId;
    }

    public void setDocumentsId(int documentsId) {
        this.documentsId = documentsId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDatePay() {
        return datePay;
    }

    public void setDatePay(int datePay) {
        this.datePay = datePay;
    }

    public float getAmountPay() {
        return amountPay;
    }

    public void setAmountPay(float amountPay) {
        this.amountPay = amountPay;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "documents{" + "documentsId=" + documentsId + ", site=" + site + ", date=" + date + ", datePay=" + datePay + ", amountPay=" + amountPay + ", supplierId=" + supplierId + '}';
    }
    
    
}
