/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jxl.Workbook;  
import jxl.write.WritableSheet;  
import jxl.write.WritableWorkbook;  
import jxl.write.WriteException;  
import jxl.write.biff.RowsExceededException; 
import org.apache.poi.hpsf.Date;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;


/**
 *
 * @author luod1
 */
public class ExcelFile {

    public ExcelFile() {
    }

    

    public void exportTable(JTable table, File file) throws IOException {
        try {
            OutputStream out = new FileOutputStream(file);
            TableModel model = table.getModel();
            WritableWorkbook wwb = Workbook.createWorkbook(out);
// 创建字表，并写入数据  
            WritableSheet ws = wwb.createSheet("中文", 0);
// 添加标题  
            for (int i = 0; i < model.getColumnCount(); i++) {
                jxl.write.Label labelN = new jxl.write.Label(i, 0, model.getColumnName(i));
                try {
                    ws.addCell(labelN);
                } catch (RowsExceededException e) {
// TODO Auto-generated catch block  
                    e.printStackTrace();
                } catch (WriteException e) {
// TODO Auto-generated catch block  
                    e.printStackTrace();
                }
            }
// 添加列  
            for (int i = 0; i < model.getColumnCount(); i++) {
                for (int j = 1; j <= model.getRowCount(); j++) {
                    jxl.write.Label labelN = new jxl.write.Label(i, j, model.getValueAt(j - 1, i).toString());
                    try {
                        ws.addCell(labelN);
                    } catch (RowsExceededException e) {
                        e.printStackTrace();
                    } catch (WriteException e) {
                        e.printStackTrace();
                    }
                }
            }
            wwb.write();
            try {
                wwb.close();
            } catch (WriteException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "导入数据前请关闭工作表");
        }
    }

}
