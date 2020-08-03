/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Purchase;
import java.util.List;

/**
 *
 * @author luod1
 */
public interface DBPurchaseInterface {
    public boolean insertPurchase(Purchase p);
    public boolean deletePurchase(int key);
    public boolean updatePurchase(Purchase p);
    public List<Purchase> findPurchase(String ProductCode);
    public List<Purchase> getAll();
    public boolean activeStatus(int _key);
    public  Purchase getPurchase(String ProductCode);
    public Purchase getPurchaseKey(int key);
}
