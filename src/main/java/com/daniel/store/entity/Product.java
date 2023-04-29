/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.store.entity;

/**
 * POJO - Plain Old Java Object
 * @author carri
 */
public class Product {

    private int productId;
    private String name;
    private String brand;
    private double price;
    private int supplierId;
    private String notes;

    public Product(int productId, String name, String brand, double price, int supplierId, String notes) {
        this.productId = productId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.supplierId = supplierId;
        this.notes = notes;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + ", supplierId=" + supplierId + ", notes=" + notes + '}';
    }

}
