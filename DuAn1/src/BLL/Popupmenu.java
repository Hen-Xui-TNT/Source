/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_TacGia;
import DAL.DAL_TheLoai;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyNhan
 */
public class Popupmenu {
        public static void DLPopupMenuTacGia(JPopupMenu Ten,ResultSet rs,String ten,String Ma,JTextField Vitrihienthi
    ,JTable Table){
        Ten.removeAll();// set lại số dòng của bảng về 0
        try {
            while(rs.next()){
                JMenuItem MN = new JMenuItem(rs.getString(ten));
                Ten.add(MN);
                MN.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MNactionPerformed(evt);
                    }

                    private void MNactionPerformed(ActionEvent evt) {
                        themTacGia(evt.getActionCommand(),ten,Ma,Table);
                    }
                });
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Ten.show(Vitrihienthi, 0, 25);
    }
    public static void themTacGia(String key,String ten,String ma,JTable Table) {
        DefaultTableModel table = (DefaultTableModel)Table.getModel();
        Object[] item = new Object[20];
        ResultSet rs = DAL_TacGia.timkiemPmn(key);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString(ma);
                item[2] = rs.getString(ten);
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void DLPopupMenuTheLoai(JPopupMenu Ten,ResultSet rs,String ten,String Ma,JTextField Vitrihienthi
    ,JTable Table){
        Ten.removeAll();// set lại số dòng của bảng về 0
        try {
            while(rs.next()){
                JMenuItem MN = new JMenuItem(rs.getString(ten));
                Ten.add(MN);
                MN.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MNactionPerformed(evt);
                    }

                    private void MNactionPerformed(ActionEvent evt) {
                        themTheLoai(evt.getActionCommand(),ten,Ma,Table);
                    }
                });
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Ten.show(Vitrihienthi, 0, 25);
    }
    public static void themTheLoai(String key,String ten,String ma,JTable Table) {
        DefaultTableModel table = (DefaultTableModel)Table.getModel();
        Object[] item = new Object[20];
        ResultSet rs = DAL_TheLoai.timkiemPmn(key);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString(ma);
                item[2] = rs.getString(ten);
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
