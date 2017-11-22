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
import DAL.DAL_TheLoai;
import DTO.DTO_TheLoai;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
<<<<<<< HEAD
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
                        themDL(evt.getActionCommand());
                    }
                });
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Ten.show(frm_thongtinsach.txt_timkiemtheloai, 0, 25);
    }
    public static void themDL(String key) {
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
    
    
    public static boolean check(String TenLoai,String MoTa) {
    if (TenLoai.trim().equals("")) {
        ChuyenDoi_ThongBao.ThongBao_Loi("Tên thể loại không được để trống", "Thông Báo Lỗi");
    }

    if (TenLoai.trim().length() > 50) {
        ChuyenDoi_ThongBao.ThongBao_Loi(" Tên thể loại không quá 50 ký tự", "Thông Báo Lỗi");
        return false;
    }
    return true;
    }
    
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[4];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaTheLoai");
                item[2] = rs.getString("TenTheLoai");
                item[3] = rs.getString("GhiChu");
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(String Ten,String MoTa) {
        boolean kiemtra = check(Ten, MoTa);
        if (kiemtra == true) {
            DTO_TheLoai TL = new DTO_TheLoai(0,Ten, MoTa);
            System.out.println("thanh cong");
            DAL_TheLoai.Them_TheLoai(TL);
        }
    }
    public static void sua(String ID,String Ten,String MoTa) {
        boolean kiemtra = check(Ten, MoTa);
        if (ID.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã thể loại !!!", "Lỗi Dữ Liệu");
        }else{
            try {
                Integer.parseInt(ID);
                if (kiemtra == true) {
                    DTO_TheLoai TL = new DTO_TheLoai(Integer.parseInt(ID), Ten, MoTa);
                    System.out.println("thanh cong");
                    DAL_TheLoai.Sua_TheLoai(TL);
                }
            } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
            }
        }
    }
    }
        
        
    
//    public static void xoa(String ID) {
//        if (ID.equals("")) {
//            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã thể loại !!!", "Lỗi Dữ Liệu");
//        }else{
//            try {
//            DAL_TheLoai.Xoa_TheLoai(Integer.parseInt(ID));
//            System.out.println("thanh cong");
//        } catch (NumberFormatException e) {
//                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
//            }
//        }
//    }
