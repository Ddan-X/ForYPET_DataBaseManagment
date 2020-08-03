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
public class OtherExpenses {
    private int id;
    private String name;
    private BigDecimal price;
    private Date date;

    public OtherExpenses(String name, BigDecimal price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public OtherExpenses() {
    }

    public OtherExpenses(int id, String name, BigDecimal price, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
