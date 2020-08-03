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
public class sales {
    private int id;
    private String ProductCode;
    private String name;
    private BigDecimal salePrice;
    private int quantity;
    private BigDecimal totalsales;
    private Date Date;
    private BigDecimal pofits;

    public sales() {
    }

    public sales(int id, String ProductCode, String name, BigDecimal salePrice, int quantity, BigDecimal totalsales, Date Date, BigDecimal pofits) {
        this.id = id;
        this.ProductCode = ProductCode;
        this.name = name;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.totalsales = totalsales;
        this.Date = Date;
        this.pofits = pofits;
    }

    public sales(String ProductCode, String name, BigDecimal salePrice, int quantity, BigDecimal totalsales, Date Date, BigDecimal pofits) {
        this.ProductCode = ProductCode;
        this.name = name;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.totalsales = totalsales;
        this.Date = Date;
        this.pofits = pofits;
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

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(BigDecimal totalsales) {
        this.totalsales = totalsales;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public BigDecimal getPofits() {
        return pofits;
    }

    public void setPofits(BigDecimal pofits) {
        this.pofits = pofits;
    }
    
    
}
