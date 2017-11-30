/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_PhieuThue;
import GUI.DuAn1;
import GUI.pnl_CT_TraSach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuuki
 */
public class BLL_TraSach {
      public static void ThongTin_ChiTietPhieuThue(DefaultTableModel table,String seach) {
         Object[] item = new Object[7]; //Tạo 1 mảng Object có 7 phần tử
         table.setRowCount(0);  //Set lại số dòng của bảng về 0
        try {
            //Lấy dữ liệu LoaiSanPham bằng hàm getAll() bên DAL
            
            ResultSet rs = DAL_PhieuThue.GetCTPT_byMaPhieu(seach);
         
            while (rs.next()) {
                     item[0] = rs.getString("MaChiTietPhieuThue");     
                     item[1] = rs.getString("MaPhieuThue");   
                     item[2] = rs.getString("MaSach");                    
                     item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaThue")); 
                     item[4] = rs.getString("SoLuong");                               
                     item[5] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("ThanhTien")); 
                     item[6] = rs.getString("GhiChu");
              
                                          
                     table.addRow(item);
                  
            }
             
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn: " + ex.getMessage());
        }
    }
      
         public static void ChiTietPhieuThue_CapNhat(DefaultTableModel table, int SL,String SoPhieuThue,String GhiChu) {
        
             ResultSet rs = DAL_PhieuThue.GetCTPT(SoPhieuThue);
             Object[] item = new Object[7]; //Tạo 1 mảng Object có 7 phần tử
            
        try {
          
            while (rs.next()) {
                     item[0] = rs.getString("MaChiTietPhieuThue");     
                     item[1] = rs.getString("MaPhieuThue"); 
                     item[2] = rs.getString("MaSach");                     
                     item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaThue")); 
                     item[4] = SL;                             
                     item[5] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("ThanhTien")); 
                     item[6] = GhiChu;
                     
                     table.addRow(item);
         }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn: " + ex.getMessage());
        }
    }
         
         
   
}
