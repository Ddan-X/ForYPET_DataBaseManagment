/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Inventory;

import java.util.List;

/**
 *
 * @author luod1
 */
public interface DBInventoryInterface {
    
    public boolean insertInventory(Inventory i);
    public boolean updatePurchase(Inventory i);
    public Inventory findOne(String code);
    public List<Inventory> getAll();
    public List<Inventory> findInventory(String ProductCode);
   
}
