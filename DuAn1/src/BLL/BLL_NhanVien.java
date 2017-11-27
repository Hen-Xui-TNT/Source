/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_NhanVien;
import DAL.DAL_NhanVien;
import DAL.DateFormatString;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import BLL.*;
/**
 *
 * @author Yuuki
 */
public class BLL_NhanVien{
    
    public static void FillDataToCBB_NhanVien(JComboBox cbb){
        //Lấy danh sách Tên và Mã Quyền từ tầng DAL_Quyen
        ResultSet rs = DAL.DAL_NhanVien.GetAllCombobox();
        BLL.BLL_Combobox.FillDataToCombobox(cbb, rs);
    }
    
   public static boolean Check(String TenNhanVien,String TenDN,String MatKhau,
             String MaQuyen,String Luong,String NgaySinh,String NgayLam,int GioiTinh,
             String CMND,String SDT,String DiaChi,String GhiChu){
       
//   if(TenNhanVien.trim().equals("")){
//             ChuyenDoi_ThongBao.ThongBao_Loi("Tên độc giả không được để trống","Thông Báo Lỗi");            
//        }
//    
//   if (TenNhanVien.trim().length() > 50){
//            ChuyenDoi_ThongBao.ThongBao_Loi(" Tên độc giả không quá 50 ký tự","Thông Báo Lỗi");                  
//            return false;
//             }  
//           
//   
//    if(MaLoaiNV.trim().equals("")){
//           ChuyenDoi_ThongBao.ThongBao_Loi("Mã loại độc giả không được để trống","Thông Báo Lỗi");                  
//        } else{
//              try{
//                   Integer.parseInt(MaLoaiNV);
//              }
//             catch(Exception e){
//                     ChuyenDoi_ThongBao.ThongBao_Loi("Mã loại độc giả phải là kiểu số","Thông Báo Lỗi");
//              return false;
//             }
//    }
//          
   if(NgaySinh.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Ngày sinh không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                   DateFormatString.getDate(NgaySinh);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Ngày sinh phải là kiểu date");
              return false;
             }
          }
   
    if(NgayLam.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Ngày sinh không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                   DateFormatString.getDate(NgayLam);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Ngày sinh phải là kiểu date");
              return false;
             }
          }
//          
//    if(SDT.trim().length() > 11){
//           ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Số điện thoại không quá 11 ký tự");
//              return false;
//         }
//    if (!SDT.equals("")) {
//            try {
//                Integer.parseInt(SDT);
//                
//            } catch (Exception e) {
//                 ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Số điện thoại phải là kiểu số");  
//                 return false;
//            }
//
//        }
//    
//    if(DiaChi.trim().equals("")){
//             ChuyenDoi_ThongBao.ThongBao_Loi("Địa chỉ không được để trống","Thông Báo Lỗi");            
//        }
//    
//    if(TrangThai.trim().equals("")){
//             ChuyenDoi_ThongBao.ThongBao_Loi("Trạng thái mượn sách không được để trống","Thông Báo Lỗi");            
//        }
        return true;
    }
    
    public static void DuLieuDatabase_Table(JTable Ten_table,ResultSet rs) {
        
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();        
        Object[] item = new Object[14]; // tạo mảng
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenDangNhap");
                item[4] = rs.getString("MatKhau"); 
                item[5] = rs.getString("MaQuyen");             
                item[6] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("Luong"));   
                item[7] = rs.getString("NgaySinh");             
                item[8] = rs.getString("NgayLam");   
                item[9] = rs.getString("GioiTinh");
                item[10] = rs.getString("CMND");             
                item[11] = rs.getString("SoDienThoai");   
                item[12] = rs.getString("DiaChi");             
                item[13] = rs.getString("GhiChu");   
              
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int Them(String TenNhanVien,String TenDN,String MatKhau,
             String MaQuyen,String Luong,String NgaySinh,String NgayLam,int GioiTinh,
             String CMND,String SDT,String DiaChi,String GhiChu) {
        
      if (Check( TenNhanVien, TenDN, MatKhau,
              MaQuyen, Luong, NgaySinh, NgayLam, GioiTinh,
              CMND, SDT, DiaChi, GhiChu)){
          
            DTO_NhanVien item = new DTO_NhanVien(TenNhanVien, TenDN, MatKhau,
              Integer.parseInt(MaQuyen), Double.parseDouble(Luong), NgaySinh, NgayLam, GioiTinh,
              CMND, SDT, DiaChi, GhiChu);
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_NhanVien.Them_NhanVien(item);  
        }
      return -1;
    }         
      /*------------------------------------------------*/  
   
  public static int Sua(String MaNhanVien,String TenNhanVien,String TenDN,String MatKhau,
             String MaQuyen,String Luong,String NgaySinh,String NgayLam,int GioiTinh,
             String CMND,String SDT,String DiaChi,String GhiChu) {
         
      if(MaNhanVien.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã nhân viên");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaNhanVien);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã độc giả phải là số");
              return -1;
             }
         }   
         
         
      if (Check( TenNhanVien, TenDN, MatKhau,MaQuyen, Luong, NgaySinh, NgayLam, GioiTinh,
              CMND, SDT, DiaChi, GhiChu)){
          
            DTO_NhanVien item = new DTO_NhanVien(Integer.parseInt(MaNhanVien),TenNhanVien, TenDN, MatKhau,
              Integer.parseInt(MaQuyen), Double.parseDouble(Luong), NgaySinh, NgayLam, GioiTinh,
              CMND, SDT, DiaChi, GhiChu);
            System.out.println("Sửa thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã sửa thành công !","Thông Báo Thành công");
           
          return DAL_NhanVien.Update_NhanVien(item);  
        }
      return -1;
    }         
    
      /*------------------------------------------------*/    
        
    public static int Xoa (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){               
             ChuyenDoi_ThongBao.ThongBao_Loi("Chưa có mã có mã nhân viên","Thông Báo Lỗi");
              return rs;
              
           }else{
                try{
                     System.out.println("Xóa thành công");
                      DAL_NhanVien.Delete_NhanVien(maLoai);
                }
                catch(Exception e){
                      ChuyenDoi_ThongBao.ThongBao_ThanhCong("Thông Báo Lỗi", "Xóa không thành công");
                 
                }
            }
        }
     
        return rs;    // Lựa chọn là No       
     }
}
