/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author luod1
 */
public class Return {
    private int id;
    private String ProductCode;
    private String name;
    private int quantity;
    private Date Date;
    private String reSale;

    public Return(String ProductCode, String name, int quantity, Date Date, String reSale) {
        this.ProductCode = ProductCode;
        this.name = name;
        this.quantity = quantity;
        this.Date = Date;
        this.reSale = reSale;
    }

    public Return() {
    }

    public Return(int id, String ProductCode, String name, int quantity, Date Date, String reSale) {
        this.id = id;
        this.ProductCode = ProductCode;
        this.name = name;
        this.quantity = quantity;
        this.Date = Date;
        this.reSale = reSale;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getReSale() {
        return reSale;
    }

    public void setReSale(String reSale) {
        this.reSale = reSale;
    }
    
    
}
