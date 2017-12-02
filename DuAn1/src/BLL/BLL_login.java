/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_MyCombobox;
import GUI.frm_login;
import static GUI.frm_login.Pass;
import static GUI.frm_login.user;
import GUI.frm_main;
import GUI.pnl_Quyen;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HuyNhan
 */
public class BLL_login {
    public static boolean Check(ResultSet rs) {
        if (frm_login.user.equals("Tài Khoản")) {
            frm_login.lbl_loiuser.setText("Chưa nhập Tài Khoản");
            return false;
        }else if (frm_login.Pass.equals("Mật khẩu")) {
            frm_login.lbl_loiPass.setText("Chưa nhập Mật Khẩu");
            return false;
        }else{
        try {
            if(rs.next()){
                frm_login.Quyen = rs.getString("TenQuyen");
                frm_login.ipquyen = rs.getString("MaQuyen");
                frm_login.ipuser = rs.getString("MaNhanVien");
                frm_main.lbl_ttmaytru.setText(frm_login.server);
                frm_main.lbl_ttquyenhan.setText(frm_login.Quyen);
                frm_main.lbl_ttnguoisudung.setText(frm_login.user);
                PhanQuyen(DAL.DAL_Quyen.Seach_Quyen(rs.getString("MaQuyen")));
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(new JFrame(), "Đăng nhập thất bại", "Thông báo đăng nhập", JOptionPane.WARNING_MESSAGE);
                return false;
    }
    
//    public static void timkiem(JComboBox TenCBBTheLoai,JComboBox TenCBBTacGia,JTable Table,ResultSet rs){
//        DefaultTableModel table = (DefaultTableModel)Table.getModel();
//        Object[] item = new Object[20];
//        table.setRowCount(0);
//        try {
//            while(rs.next()){
//                DTO.DTO_MyCombobox Item;
//                item[0] = table.getRowCount() + 1;
//                item[1] = rs.getString("TenSach");
//                item[2] = rs.getString("NhaXuatBan");
//                JComboBox cbb = new javax.swing.JComboBox<>();
//                ResultSet srtacgia = DAL.DAL_ChiTietTacGia.DoDLCombobox(rs.getString("MaSach"));
//                DefaultComboBoxModel Combobox = new DefaultComboBoxModel();
//                try {
//                    while (srtacgia.next()) {
//                        Item = new DTO_MyCombobox(rs.getString("TenTacGia"), rs.getString("MaTacGia"));
//                        Combobox.addElement(Item);
//                        cbb.setModel(Combobox);
//                    }
//                } catch (SQLException ex) {
//                    System.out.println(ex.toString());
//                }
//                Table.getRowHeight(0);
//                Table.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(cbb));
//                item[4] = cbb.getSelectedObjects();
//                
//                BLL_Combobox.LayDuLieuCombobox(DAL.DAL_ChiTietTheLoai.DoDLCombobox(rs.getString("MaSach")), TenCBBTheLoai
//                        , "TenTheLoai", "MaTheLoai");
//                item[3] = new DefaultCellEditor(TenCBBTheLoai);
//                item[5] = rs.getString("MoTa");
//                table.addRow(item);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
        
    }
    public static String quyenKhuyenMai,quyenNhaCungCap,quyenNhapKho,quyenQuyen,quyenSach,quyenTacGia,quyenThanhLy,quyenTheloai,quyenNhanVien;
    public static void PhanQuyen(ResultSet rs) {
        try {
            while(rs.next()){
                String Checkbox = rs.getString("Ma");
                    quyenTheloai = Checkbox.substring(0, 1);
                    quyenNhaCungCap = Checkbox.substring(1, 2);
                    quyenNhanVien = Checkbox.substring(2, 3);
                    quyenNhapKho = Checkbox.substring(3,4);
                    quyenQuyen = Checkbox.substring(4, 5);
                    quyenSach = Checkbox.substring(5, 6);
                    quyenTacGia = Checkbox.substring(6, 7);
                    quyenThanhLy = Checkbox.substring(7, 8);
                    quyenKhuyenMai = Checkbox.substring(8,9);
                    
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
