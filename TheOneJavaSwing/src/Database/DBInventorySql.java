/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Inventory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luod1
 */
public class DBInventorySql extends DatabaseConnects implements DBInventoryInterface {

    @Override
    public boolean insertInventory(Inventory i) {
        String sql = "INSERT into inventory(ProductCode, name,  unit, stock,  recentPurchasePrice,averageCost, storeDate) VALUES (?,?,?,?,?,?,?)";
        Object[] obj = {i.getProductCode(), i.getName(), i.getUnit(), i.getStock(), i.getRecentPurchasePrice(),
            i.getAverageCost(), i.getStoreDate()};
        boolean insert = this.executeUpdate(sql, obj);
        return insert;
    }

    @Override
    public Inventory findOne(String code) {
        Inventory i = new Inventory();
        String sql = "select * from inventory where ProductCode=?";
        Object[] obj = {code};
        ResultSet rs = this.executeQuery(sql, obj);
        try {
            while (rs.next()) {
                i.setId(rs.getInt("id"));
                i.setProductCode(rs.getString("ProductCode"));
                i.setName(rs.getString("name"));
                i.setUnit(rs.getString("unit"));
                i.setStock(rs.getInt("stock"));
                i.setRecentPurchasePrice(rs.getBigDecimal("recentPurchasePrice"));
                i.setAverageCost(rs.getBigDecimal("averageCost"));
                i.setStoreDate(rs.getDate("storeDate"));
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<Inventory> getAll() {
        List<Inventory> list = new ArrayList<Inventory>();
        String sql = "select * from inventory";
        ResultSet rs = this.executeQuery(sql);
        try {
            while (rs.next()) {
                Inventory i = new Inventory();
                i.setId(rs.getInt("id"));
                i.setProductCode(rs.getString("ProductCode"));
                i.setName(rs.getString("name"));
                i.setUnit(rs.getString("unit"));
                i.setStock(rs.getInt("stock"));
                i.setRecentPurchasePrice(rs.getBigDecimal("recentPurchasePrice"));
                i.setAverageCost(rs.getBigDecimal("averageCost"));
                i.setStoreDate(rs.getDate("storeDate"));
                list.add(i);
                
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public boolean updatePurchase(Inventory i) {
        String sql = "UPDATE inventory set id=?,name=?, unit=?, stock=?,  recentPurchasePrice=?,averageCost=?, storeDate=? where ProductCode =?";
        Object[] obj = {i.getId(), i.getName(), i.getUnit(), i.getStock(), i.getRecentPurchasePrice(), i.getAverageCost(), i.getStoreDate(),
            i.getProductCode()};
        boolean update = this.executeUpdate(sql, obj);
        return update;
    }

    @Override
    public List<Inventory> findInventory(String ProductCode) {
        List<Inventory> list = new ArrayList<Inventory>();
        String sql = "select * from inventory where ProductCode=?";
        Object[] obj = {ProductCode};
        ResultSet rs = this.executeQuery(sql, obj);
        try {
            while (rs.next()) {
                Inventory i = new Inventory();
                i.setId(rs.getInt("id"));
                i.setProductCode(rs.getString("ProductCode"));
                i.setName(rs.getString("name"));
                i.setUnit(rs.getString("unit"));
                i.setStock(rs.getInt("stock"));
                i.setRecentPurchasePrice(rs.getBigDecimal("recentPurchasePrice"));
                i.setAverageCost(rs.getBigDecimal("averageCost"));
                i.setStoreDate(rs.getDate("storeDate"));
                list.add(i);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

}
