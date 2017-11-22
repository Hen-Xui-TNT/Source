/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_LoaiDocGia;
import DTO.DTO_LoaiDocGia;
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
public class BLL_LoaiDocGia {

    public static boolean check(String TenLoai, String UuDai) {
        if (TenLoai.trim().equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Tên loại độc giả không được để trống", "Thông Báo Lỗi");
        }

        if (TenLoai.trim().length() > 50) {
            ChuyenDoi_ThongBao.ThongBao_Loi(" Tên loại độc giả không quá 50 ký tự", "Thông Báo Lỗi");
            return false;
        }
        if (UuDai.trim().equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Ưu đãi loại độc giả không được để trống", "Thông Báo Lỗi");
        } else {
            try {
                Integer.parseInt(UuDai);
            } catch (Exception e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("Ưu đãi loại độc giả phải là kiểu số", "Thông Báo Lỗi");
                return false;

            }

        }
        return true;
    }
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[5];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaLoaiDocGia");
                item[2] = rs.getString("TenLoaiDocGia");
                item[3] = rs.getString("UuDai");
                item[4] = rs.getString("GhiChu");
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
        
    
}
