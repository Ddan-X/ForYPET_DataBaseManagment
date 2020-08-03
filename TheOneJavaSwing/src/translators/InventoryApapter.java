/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import Database.DBInventoryInterface;
import Database.DBInventorySql;
import Model.Inventory;
import java.util.List;

/**
 *
 * @author luod1
 */
public class InventoryApapter implements DBInventoryInterface{

    DBInventoryInterface inter = new DBInventorySql();
    
    @Override
    public boolean insertInventory(Inventory i) {
       return inter.insertInventory(i);
    }

    @Override
    public Inventory findOne(String code) {
       return inter.findOne(code);
    }

    @Override
    public List<Inventory> getAll() {
        return inter.getAll();
    }

    @Override
    public boolean updatePurchase(Inventory i) {
       return inter.updatePurchase(i);
    }

    @Override
    public List<Inventory> findInventory(String ProductCode) {
        return inter.findInventory(ProductCode);
    }
    
}
