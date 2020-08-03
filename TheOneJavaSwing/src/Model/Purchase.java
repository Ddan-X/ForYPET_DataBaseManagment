/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  进货管理
 * @author luod1
 */
public class Purchase {
    private int id;
    private String ProductCode;
    private String name;
    private BigDecimal price;
    private int quantity;
    private String unit;
    private Date purchaseDate;
    private String factor;
    private BigDecimal totalCost;
    public String status;
    
    public Purchase() {
    }

    public Purchase(int id, String ProductCode, String name, BigDecimal price, int quantity, String unit, Date purchaseDate, String factor, BigDecimal totalCost) {
        this.id = id;
        this.ProductCode = ProductCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.purchaseDate = purchaseDate;
        this.factor = factor;
        this.totalCost = totalCost;
    }

    public Purchase(int id, String ProductCode, String name, BigDecimal price, int quantity, String unit, Date purchaseDate, String factor, BigDecimal totalCost, String status) {
        this.id = id;
        this.ProductCode = ProductCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.purchaseDate = purchaseDate;
        this.factor = factor;
        this.totalCost = totalCost;
        this.status = status;
    }

   

    public Purchase(String ProductCode, String name, BigDecimal price, int quantity, String unit, Date purchaseDate, String factor, BigDecimal totalCost,String status) {
        this.ProductCode = ProductCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.purchaseDate = purchaseDate;
        this.factor = factor;
        this.totalCost = totalCost;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
    
    
}
