/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import Database.DBOtherExpensesInterface;
import Database.DBOtherExpensesSql;
import java.util.List;

/**
 *
 * @author luod1
 */
public class OtherExpensesApapter implements DBOtherExpensesInterface{

    DBOtherExpensesInterface other = new DBOtherExpensesSql();
    @Override
    public List<String> findName() {
        return other.findName();
    }

    @Override
    public List<String> findCode() {
        return other.findCode();
    }
    
}
