/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import Database.DBSalesInterface;
import Database.DBSalesSql;
import Model.sales;
import java.util.List;

/**
 *
 * @author luod1
 */
public class SalesApapter implements DBSalesInterface{

    DBSalesInterface sale = new DBSalesSql();
    @Override
    public boolean addSales(sales s) {
        return sale.addSales(s);
    }

    @Override
    public boolean deleteSales(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateSales(sales s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public sales findOne(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<sales> getAll() {
        return sale.getAll();
    }

    @Override
    public List<sales> findSales(String ProductCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> findName() {
        return sale.findName();
    }

    @Override
    public List<String> findCode() {
        return sale.findCode();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<sales> findMonth(int month) {
        return sale.findMonth(month);
    }

    @Override
    public String findName(String code) {
        return sale.findName(code);
    }

    @Override
    public String findCode(String name) {
       return sale.findCode(name);
       
    }
    
}
