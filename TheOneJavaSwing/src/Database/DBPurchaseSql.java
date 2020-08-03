/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Purchase;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luod1
 */
public class DBPurchaseSql extends DatabaseConnects implements DBPurchaseInterface {

    @Override
    public boolean insertPurchase(Purchase p) {
        String sql = "INSERT into purchase (ProductCode, name, price, quantity, unit, purchaseDate, factor, totalCost,status) VALUES (?,?,?,?,?,?,?,?,?)";
        Object[] obj = {p.getProductCode(), p.getName(), p.getPrice(), p.getQuantity(), p.getUnit(),
            p.getPurchaseDate(), p.getFactor(), p.getTotalCost(),p.getStatus()};
        boolean insert = this.executeUpdate(sql, obj);
        return insert;
    }

    @Override
    public boolean deletePurchase(int key) {
        String sql = "DELETE FROM purchase where id =?";
        Object[] obj = {key};
        boolean delete = this.executeUpdate(sql, obj);
        return delete;
    }

    @Override
    public boolean updatePurchase(Purchase p) {
        String sql = "UPDATE purchase set ProductCode=?,name=?,price=?,quantity=?, unit=?,purchaseDate=?, factor=?,totalCost=? where id =?";
        Object[] obj = {p.getProductCode(), p.getName(), p.getPrice(), p.getQuantity(), p.getUnit(),
            p.getPurchaseDate(), p.getFactor(), p.getTotalCost(), p.getId()};

        boolean update = this.executeUpdate(sql, obj);
        return update;
    }

    @Override
    public List<Purchase> findPurchase(String ProductCode) {
        List<Purchase> list = new ArrayList<Purchase>();
        String sql = "select * from purchase where ProductCode=?";
        Object[] obj = {ProductCode};
        ResultSet rs = this.executeQuery(sql, obj);
        
        try {
            while (rs.next()) {
                Purchase p = new Purchase();
                p.setId(rs.getInt("id"));
                p.setProductCode(rs.getString("ProductCode"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getBigDecimal("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setUnit(rs.getString("unit"));
                p.setPurchaseDate(rs.getDate("purchaseDate"));
                p.setFactor(rs.getString("factor"));
                p.setTotalCost(rs.getBigDecimal("totalCost"));
                p.setStatus(rs.getString("status"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Purchase> getAll() {
        List<Purchase> list = new ArrayList<Purchase>();
        String sql = "select * from purchase ";
        ResultSet rs = this.executeQuery(sql);
       
        try {
            while (rs.next()) { 
                Purchase p = new Purchase();
                p.setId(rs.getInt("id"));
                p.setProductCode(rs.getString("ProductCode"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getBigDecimal("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setUnit(rs.getString("unit"));
                p.setPurchaseDate(rs.getDate("purchaseDate"));
                p.setFactor(rs.getString("factor"));
                p.setTotalCost(rs.getBigDecimal("totalCost"));
                p.setStatus(rs.getString("status"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean activeStatus(int _key) {
        String status = "Y";
        String sql = "UPDATE purchase set status=? where id=?";
        Object[] obj = {status, _key};
        
        boolean update = this.executeUpdate(sql, obj);
        return update;
    }

    @Override
    public Purchase getPurchase(String ProductCode) {
        Purchase p = new Purchase();
        String sql = "select * from purchase where ProductCode=?";
        Object[] obj = {ProductCode};
        ResultSet rs = this.executeQuery(sql, obj);
        try {
            while (rs.next()) { 
                
                p.setId(rs.getInt("id"));
                p.setProductCode(rs.getString("ProductCode"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getBigDecimal("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setUnit(rs.getString("unit"));
                p.setPurchaseDate(rs.getDate("purchaseDate"));
                p.setFactor(rs.getString("factor"));
                p.setTotalCost(rs.getBigDecimal("totalCost"));
                p.setStatus(rs.getString("status"));
                
            }
            return p;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }

    @Override
    public Purchase getPurchaseKey(int key) {
        Purchase p = new Purchase();
        String sql = "select * from purchase where id = ?";
        Object[] obj = {key};
        ResultSet rs = this.executeQuery(sql, obj);
        try {
            while (rs.next()) { 
                
                p.setId(rs.getInt("id"));
                p.setProductCode(rs.getString("ProductCode"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getBigDecimal("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setUnit(rs.getString("unit"));
                p.setPurchaseDate(rs.getDate("purchaseDate"));
                p.setFactor(rs.getString("factor"));
                p.setTotalCost(rs.getBigDecimal("totalCost"));
                p.setStatus(rs.getString("status"));
                
            }
            return p;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }

}
