/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_ChiTietTacGia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyNhan
 */
public class BLL_ChiTietTacGia {
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[20];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaTacGia");
                item[2] = rs.getString("TenTacGia");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void ThemRow(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaTacGia");
                item[2] = rs.getString("TenTacGia");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(int masach,String matacgia) {
        //update thông tin của tác giả
            DTO.DTO_ChiTietTacGia item = new DTO_ChiTietTacGia(masach, Integer.parseInt(matacgia), "");
            DAL.DAL_ChiTietTacGia.Them_ChiTietTacGia(item);
    }
}
