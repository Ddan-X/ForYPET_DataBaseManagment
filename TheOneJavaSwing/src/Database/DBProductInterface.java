/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.product;
import Model.sales;
import java.util.List;

/**
 *
 * @author luod1
 */
public interface DBProductInterface {

    public boolean insertProduct(product p);

    public boolean deleteProduct(String code);

    public boolean updateProduct(product p);

    public product findOne(String code);

    public List<product> getAll();

    public List<String> findName();
    
    public List<String> findCode();
    
    public String findName(String code);
    
    public String findCode(String name);
}
