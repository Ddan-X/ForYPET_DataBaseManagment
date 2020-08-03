/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luod1
 */
public class DBOtherExpensesSql extends DatabaseConnects implements DBOtherExpensesInterface{

    @Override
    public List<String> findName() {
        List<String> list = new ArrayList<String>();
        String sql = "select name from sales";
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
        String sql = "select ProductCode from sales";
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
    
}
