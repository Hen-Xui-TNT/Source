/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_TheLoai;
import DTO.DTO_TheLoai;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BLL_TheLoai {
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
}
