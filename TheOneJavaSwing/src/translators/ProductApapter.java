/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import Database.DBProductInterface;
import Database.DBProductSql;
import Model.product;
import Model.sales;
import java.util.List;

/**
 *
 * @author luod1
 */
public class ProductApapter implements DBProductInterface{

    DBProductInterface pro = new DBProductSql();
    @Override
    public boolean insertProduct(product p) {
        return pro.insertProduct(p);    
    }

    @Override
    public boolean deleteProduct(String code) {
       return pro.deleteProduct(code);
    }

    @Override
    public boolean updateProduct(product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public product findOne(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<product> getAll() {
        return pro.getAll();
    }

   

    @Override
    public List<String> findName() {
        return pro.findName();
    }

    @Override
    public List<String> findCode() {
        return pro.findCode();
    }

    @Override
    public String findName(String code) {
        return pro.findName(code);
    }

    @Override
    public String findCode(String name) {
        return pro.findCode(name);
    }
    
}
