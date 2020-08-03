/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Inventory;
import Model.sales;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luod1
 */
public class DBSalesSql extends DatabaseConnects implements DBSalesInterface {

    @Override
    public boolean addSales(sales s) {
        String sql = "INSERT into sales (ProductCode, name,  salePrice, quantity, totalsales,Date,pofits) VALUES (?,?,?,?,?,?,?)";
        Object[] obj = {s.getProductCode(), s.getName(), s.getSalePrice(), s.getQuantity(),
            s.getTotalsales(), s.getDate(), s.getPofits()};
        boolean insert = this.executeUpdate(sql, obj);
        return insert;
    }

    @Override
    public boolean deleteSales(int key) {
        String sql = "DELETE FROM sales where id =?";
        Object[] obj = {key};
        boolean delete = this.executeUpdate(sql, obj);
        return delete;
    }

    @Override
    public boolean updateSales(sales s) {
        String sql = "UPDATE sales set id=?,name=?, salePrice=?, quantity=?, totalsales=?,Date=?, pofits=? where ProductCode =?";
        Object[] obj = {s.getId(), s.getName(), s.getSalePrice(), s.getQuantity(),
            s.getTotalsales(), s.getDate(), s.getPofits()};
        boolean update = this.executeUpdate(sql, obj);
        return update;
    }

    @Override
    public sales findOne(String code) {
        sales s = new sales();
        String sql = "select * from sales where ProductCode=?";
        Object[] obj = {code};
        ResultSet rs = this.executeQuery(sql, obj);
        try {
            while (rs.next()) {
                s.setId(rs.getInt("id"));
                s.setProductCode(rs.getString("ProductCode"));
                s.setName(rs.getString("name"));
                s.setSalePrice(rs.getBigDecimal("salePrice"));
                s.setQuantity(rs.getInt("quantity"));
                s.setTotalsales(rs.getBigDecimal("totalsales"));
                s.setDate(rs.getDate("Date"));
                s.setPofits(rs.getBigDecimal("pofits"));
            }
            return s;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<sales> getAll() {
        List<sales> list = new ArrayList<sales>();
        String sql = "select * from sales";
        ResultSet rs = this.executeQuery(sql);
        try {
            while (rs.next()) {
                sales s = new sales();
                s.setId(rs.getInt("id"));
                s.setProductCode(rs.getString("ProductCode"));
                s.setName(rs.getString("name"));
                s.setSalePrice(rs.getBigDecimal("salePrice"));
                s.setQuantity(rs.getInt("quantity"));
                s.setTotalsales(rs.getBigDecimal("totalsales"));
                s.setDate(rs.getDate("Date"));
                s.setPofits(rs.getBigDecimal("pofits"));
                list.add(s);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<sales> findSales(String ProductCode) {
        return null;
    }

    @Override
    public List<String> findName() {
        List<String> list = new ArrayList<String>();
        String sql = "select name from inventory";
        ResultSet rs = this.executeQuery(sql);
        try {
            while (rs.next()) {
                String n = rs.getString("name");

                list.add(n);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<String> findCode() {
        List<String> list = new ArrayList<String>();
        String sql = "select ProductCode from inventory";
        ResultSet rs = this.executeQuery(sql);
        try {
            while (rs.next()) {
                String code = rs.getString("ProductCode");

                list.add(code);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<sales> findMonth(int month) {
        List<sales> list = new ArrayList<sales>();
        String sql = "SELECT * FROM sales where month(Date)= ?;";
        Object[] obj = {month};
        ResultSet rs = this.executeQuery(sql, obj);
        try {
            while (rs.next()) {
                sales s = new sales();
                s.setId(rs.getInt("id"));
                s.setProductCode(rs.getString("ProductCode"));
                s.setName(rs.getString("name"));
                s.setSalePrice(rs.getBigDecimal("salePrice"));
                s.setQuantity(rs.getInt("quantity"));
                s.setTotalsales(rs.getBigDecimal("totalsales"));
                s.setDate(rs.getDate("Date"));
                s.setPofits(rs.getBigDecimal("pofits"));
                list.add(s);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public String findName(String code) {
        String sql = "select name from inventory where ProductCode = ?";
        Object[] obj = {code};
        ResultSet rs = this.executeQuery(sql, obj);
        String name = null;
        try {
            while (rs.next()) {
                name = rs.getString("name");
            }
            return name;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public String findCode(String name) {
        String sql = "select ProductCode from inventory where name = ?";
        Object[] obj = {name};
        ResultSet rs = this.executeQuery(sql, obj);
        String Code = null;
        try {
            while (rs.next()) {
                Code = rs.getString("ProductCode");
            }
            return Code;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }
}
