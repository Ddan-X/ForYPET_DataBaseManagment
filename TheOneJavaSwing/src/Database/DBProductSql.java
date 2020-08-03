/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.product;
import Model.sales;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luod1
 */
public class DBProductSql extends DatabaseConnects implements DBProductInterface {

    @Override
    public boolean insertProduct(product p) {
        String sql = "INSERT into product (ProductCode, name, unit) VALUES (?,?,?)";
        Object[] obj = {p.getProductCode(), p.getName(), p.getUnit()};
        boolean insert = this.executeUpdate(sql, obj);
        return insert;
    }

    @Override
    public boolean deleteProduct(String code) {
        String sql = "DELETE FROM product where ProductCode =?";
        Object[] obj = {code};
        boolean delete = this.executeUpdate(sql, obj);
        return delete;
    }

    @Override
    public boolean updateProduct(product p) {
        String sql = "UPDATE product set id=?,name=?, unit=? where ProductCode =?";
        Object[] obj = {p.getId(), p.getName(), p.getUnit(),
            p.getProductCode()};
        boolean update = this.executeUpdate(sql, obj);
        return update;
    }

    @Override
    public product findOne(String code) {
        return null;
    }

    @Override
    public List<product> getAll() {
        List<product> list = new ArrayList<product>();
        String sql = "select * from product";
        ResultSet rs = this.executeQuery(sql);
        try {
            while (rs.next()) {
                product p = new product();
                p.setId(rs.getInt("id"));
                p.setProductCode(rs.getString("ProductCode"));
                p.setName(rs.getString("name"));
                p.setUnit(rs.getString("unit"));

                list.add(p);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<String> findName() {
        List<String> list = new ArrayList<String>();
        String sql = "select name from product";
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
        String sql = "select ProductCode from product";
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
    public String findName(String code) {
        String sql = "select name from product where ProductCode = ?";
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
        String sql = "select ProductCode from product where name = ?";
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
