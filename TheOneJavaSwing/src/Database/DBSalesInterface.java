/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import Model.sales;
import java.util.List;

/**
 *
 * @author luod1
 */
public interface DBSalesInterface {
    public boolean addSales(sales s);
    public boolean deleteSales(int key);
     public boolean updateSales(sales s);
     public sales findOne(String code);
    public List<sales> getAll();
    public List<sales> findSales(String ProductCode);
    public List<String> findName();
     public List<String> findCode();
      public String findName(String code);
    
    public String findCode(String name);
    public List<sales> findMonth(int month);
}
