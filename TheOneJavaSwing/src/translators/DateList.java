/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import Model.Inventory;
import Model.Purchase;
import Model.product;
import Model.sales;
import java.util.List;

/**
 *
 * @author luod1
 */
public class DateList {
    
    public static Object[][] listToArray(List<Purchase> p) {
        Object[][] data = new Object[p.size()][];
        int size = p.size();
        for (int i = 0; i < size; i++) {
            Purchase s = p.get(i);
            Object[] info = new Object[]{s.getId(),s.getProductCode(), s.getName(), s.getPrice(), s.getQuantity(), s.getUnit(),
            s.getPurchaseDate(),s.getFactor(), s.getTotalCost(),s.getStatus()};
            data[i] = info;
        }
        return data;
    }
     public static Object[][] listToArrayInventory(List<Inventory> inven) {
         Object[][] data = new Object[inven.size()][];
        int size = inven.size();
        for (int i = 0; i < size; i++) {
            Inventory s = inven.get(i);
            Object[] info = new Object[]{s.getId(),s.getProductCode(), s.getName(), s.getUnit(),s.getStock(),
            s.getRecentPurchasePrice(),s.getAverageCost(),s.getStoreDate()};
            data[i] = info;
           
        }
        return data;
         
     }
    
     public static Object[][] listToArraySales(List<sales> sale) {
         Object[][] data = new Object[sale.size()][];
        int size = sale.size();
        for (int i = 0; i < size; i++) {
            sales s = sale.get(i);
            Object[] info = new Object[]{s.getId(),s.getProductCode(), s.getName(), s.getSalePrice(),
                s.getQuantity(),s.getTotalsales(),s.getDate(),s.getPofits()
            };
            data[i] = info;
           
        }
        return data;
         
     }
     
     public static Object[][] listToArrayProduct(List<product> pro) {
         Object[][] data = new Object[pro.size()][];
        int size = pro.size();
        for (int i = 0; i < size; i++) {
            product p = pro.get(i);
            Object[] info = new Object[]{p.getId(),p.getProductCode(),p.getName(), p.getUnit()
            };
            data[i] = info;
           
        }
        return data;
         
     }
}
