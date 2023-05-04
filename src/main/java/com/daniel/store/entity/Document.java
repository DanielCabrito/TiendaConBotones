/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;
import java.sql.Date;


/**
 *
 * @author carri
 */
public class Document {
    java.util.Date utilDate = new java.util.Date(2023,05,03);
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());



    private int documentsId;
    private String site;
    private Date date;
    private Date datePay;
    private float amountPay;
    private int supplierId;




    public Document() {
       
    }

    public Document(int documentsId, String site, Date date, Date datePay, float amountPay, int supplierId) {
        this.sqlDate = new java.sql.Date(utilDate.getTime());
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDatePay() {
        return datePay;
    }

    public void setDatePay(Date datePay) {
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
        return "Document{" + "documentsId=" + documentsId + ", site=" + site + ", date=" + date + ", datePay=" + datePay + ", amountPay=" + amountPay + ", supplierId=" + supplierId + '}';
    }

   

   
    
    
}
