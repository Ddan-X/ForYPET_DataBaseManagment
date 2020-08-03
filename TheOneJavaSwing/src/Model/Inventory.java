/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author luod1
 */
public class Inventory {
    private int id;
    private String ProductCode;
    private String name;
    private String unit;
    private int stock;
    private BigDecimal recentPurchasePrice;
    private BigDecimal averageCost;
    private Date storeDate;

    public Inventory() {
    }

    public Inventory(int id, String ProductCode, String name, String unit, int stock, BigDecimal recentPurchasePrice, BigDecimal averageCost, Date storeDate) {
        this.id = id;
        this.ProductCode = ProductCode;
        this.name = name;
        this.unit = unit;
        this.stock = stock;
        this.recentPurchasePrice = recentPurchasePrice;
        this.averageCost = averageCost;
        this.storeDate = storeDate;
    }

    public Inventory(String ProductCode, String name, String unit, int stock, BigDecimal recentPurchasePrice, BigDecimal averageCost, Date storeDate) {
        this.ProductCode = ProductCode;
        this.name = name;
        this.unit = unit;
        this.stock = stock;
        this.recentPurchasePrice = recentPurchasePrice;
        this.averageCost = averageCost;
        this.storeDate = storeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getRecentPurchasePrice() {
        return recentPurchasePrice;
    }

    public void setRecentPurchasePrice(BigDecimal recentPurchasePrice) {
        this.recentPurchasePrice = recentPurchasePrice;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public Date getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(Date storeDate) {
        this.storeDate = storeDate;
    }

    @Override
    public String toString() {
        return "Inventory{" + "id=" + id + ", ProductCode=" + ProductCode + ", name=" + name + ", unit=" + unit + ", stock=" + stock + ", recentPurchasePrice=" + recentPurchasePrice + ", averageCost=" + averageCost + ", storeDate=" + storeDate + '}';
    }
    
    

}
