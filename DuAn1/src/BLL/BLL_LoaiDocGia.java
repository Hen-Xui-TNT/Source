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
 * @author MinhTam
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
                item[4] = rs.getString("MoTa");
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_LoaiDocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
     /*------------------------------------------------*/  
    public static int Them(String TenLoaiDG,String UuDai,String MoTa) {
      if (check(TenLoaiDG,UuDai)){
          
            DTO_LoaiDocGia item = new DTO_LoaiDocGia(Integer.parseInt(UuDai),TenLoaiDG, MoTa);
            
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_LoaiDocGia.Them_LoaiDocGia(item);  
        }
      return -1;
    }     
    
      public static int Sua(String MaLoaiDG,String TenLoaiDG,String UuDai,String MoTa) {
      
           if(MaLoaiDG.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã loại độc giả");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaLoaiDG);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã loại độc giả phải là số");
              return -1;
             }
         } 
          
          if (check(TenLoaiDG,UuDai)){
          
            DTO_LoaiDocGia item = new DTO_LoaiDocGia(Integer.parseInt(MaLoaiDG), Integer.parseInt(UuDai),TenLoaiDG,MoTa);
            
            System.out.println("sửa thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã sửa thành công !","Thông Báo Thành công");
           
          return DAL_LoaiDocGia.Sua_LoaiDocGia(item);  
        }
      return -1;
    }   
      
        public static void xoa(String ID) {
        if (ID.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã loại độc giả !!!", "Lỗi Dữ Liệu");
        }else{
            try {
            DAL_LoaiDocGia.Xoa_LoaiDocGia(ID);
            System.out.println("thanh cong");
        } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
            }
        }
    }
        
        
    
}
