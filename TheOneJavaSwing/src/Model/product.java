/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author luod1
 */
public class product {
    private int id;
    private String ProductCode;
    private String name;
    private String unit;

    public product() {
    }

    public product(String ProductCode, String name, String unit) {
        this.ProductCode = ProductCode;
        this.name = name;
        this.unit = unit;
    }

    public product(int id, String ProductCode, String name, String unit) {
        this.id = id;
        this.ProductCode = ProductCode;
        this.name = name;
        this.unit = unit;
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
    
    
}
