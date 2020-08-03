/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import Database.DBPurchaseInterface;
import Database.DBPurchaseSql;
import Model.Purchase;
import java.util.List;

/**
 *
 * @author luod1
 */
public class PurchaseApapter implements DBPurchaseInterface {

    DBPurchaseInterface pur = new DBPurchaseSql();
    
    @Override
    public boolean insertPurchase(Purchase p) {
        return pur.insertPurchase(p);
    }

    @Override
    public boolean deletePurchase(int key) {
        return pur.deletePurchase(key);
    }

    @Override
    public boolean updatePurchase(Purchase p) {
       return pur.updatePurchase(p);
    }

    @Override
    public List<Purchase> findPurchase(String ProductCode) {
       return pur.findPurchase(ProductCode);
    }

    @Override
    public List<Purchase> getAll() {
        return pur.getAll();
    }

    @Override
    public boolean activeStatus(int _key) {
        return pur.activeStatus(_key);
    }

    @Override
    public Purchase getPurchase(String ProductCode) {
        return pur.getPurchase( ProductCode);
    }

    @Override
    public Purchase getPurchaseKey(int key) {
        return pur.getPurchaseKey(key);
    }

}
