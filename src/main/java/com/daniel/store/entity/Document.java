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
    private String siteCompany;
    private int supplierId;




    public Document() {
       
    }

    public Document(int documentsId, String site, Date date, Date datePay, float amountPay, String siteCompany, int supplierId) {
        this.documentsId = documentsId;
        this.site = site;
        this.date = date;
        this.datePay = datePay;
        this.amountPay = amountPay;
        this.siteCompany = siteCompany;
        this.supplierId = supplierId;
    }

    public java.util.Date getUtilDate() {
        return utilDate;
    }

    public void setUtilDate(java.util.Date utilDate) {
        this.utilDate = utilDate;
    }

    public Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
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

    public String getSiteCompany() {
        return siteCompany;
    }

    public void setSiteCompany(String siteCompany) {
        this.siteCompany = siteCompany;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Document{" + "utilDate=" + utilDate + ", sqlDate=" + sqlDate + ", documentsId=" + documentsId + ", site=" + site + ", date=" + date + ", datePay=" + datePay + ", amountPay=" + amountPay + ", siteCompany=" + siteCompany + ", supplierId=" + supplierId + '}';
    }

    

   

   
    
    
}
