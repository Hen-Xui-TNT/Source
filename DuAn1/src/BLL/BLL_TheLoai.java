/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static BLL.BLL_TacGia.them;
import DAL.DAL_TacGia;
import DAL.DAL_TheLoai;
import GUI.frm_thongtinsach;
import static GUI.frm_thongtinsach.txt_timkiemtacgia;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyNhan
 */
public class BLL_TheLoai {
    public static void DLPopupMenu(JPopupMenu Ten,ResultSet rs){
        Ten.removeAll();// set lại số dòng của bảng về 0
        try {
            while(rs.next()){
                JMenuItem MN = new JMenuItem(rs.getString("TenTheLoai"));
                Ten.add(MN);
                MN.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MNactionPerformed(evt);
                    }

                    private void MNactionPerformed(ActionEvent evt) {
                        them(evt.getActionCommand());
                    }
                });
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Ten.show(frm_thongtinsach.txt_timkiemtheloai, 0, 25);
    }
    public static void them(String key) {
        DefaultTableModel table = (DefaultTableModel)frm_thongtinsach.tbl_theloai.getModel();
       ResultSet rs = DAL_TheLoai.timkiemPmn(key);
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaTheLoai");
                item[2] = rs.getString("TenTheLoai");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
