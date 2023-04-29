/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 *
 * @author carri
 */
public class SaleProduct {
    private int saleProductId;
    private int productId;
    private int amount;
    private float unitPrice;
    private int saleId;

    public SaleProduct() {
    }

    public SaleProduct(int saleProductId, int productId, int amount, float unitPrice, int saleId) {
        this.saleProductId = saleProductId;
        this.productId = productId;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.saleId = saleId;
    }

    public int getSaleProductId() {
        return saleProductId;
    }

    public void setSaleProductId(int saleProductId) {
        this.saleProductId = saleProductId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    @Override
    public String toString() {
        return "saleProduct{" + "saleProductId=" + saleProductId + ", productId=" + productId + ", amount=" + amount + ", unitPrice=" + unitPrice + ", saleId=" + saleId + '}';
    }
    
}
