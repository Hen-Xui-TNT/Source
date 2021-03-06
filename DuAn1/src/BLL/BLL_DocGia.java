/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_DocGia;
import DAL.DAL_DocGia;
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
public class BLL_DocGia {
    
    public static void FillDataToCBB_DocGia(JComboBox cbb){
        //Lấy danh sách Tên và Mã Quyền từ tầng DAL_Quyen
        ResultSet rs = DAL.DAL_DocGia.GetAllCombobox();
        BLL.BLL_Combobox.FillDataToCombobox(cbb, rs);
    }
    
     public static boolean Check(String TenDocGia,String MaLoaiDG,int GioiTinh,
             String NgaySinh,String SDT,String DiaChi,String TrangThai,String MoTa){
       
   if(TenDocGia.trim().equals("")){
             ChuyenDoi_ThongBao.ThongBao_Loi("Tên độc giả không được để trống","Thông Báo Lỗi");            
        }
    
   if (TenDocGia.trim().length() > 50){
            ChuyenDoi_ThongBao.ThongBao_Loi(" Tên độc giả không quá 50 ký tự","Thông Báo Lỗi");                  
            return false;
             }  
           
   
    if(MaLoaiDG.trim().equals("")){
           ChuyenDoi_ThongBao.ThongBao_Loi("Mã loại độc giả không được để trống","Thông Báo Lỗi");                  
        } else{
              try{
                   Integer.parseInt(MaLoaiDG);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Mã loại độc giả phải là kiểu số","Thông Báo Lỗi");
              return false;
             }
    }
          
   if(NgaySinh.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Ngày sinh không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                   DateFormatString.getDate(NgaySinh);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Ngày thuê phải là kiểu date");
              return false;
             }
          }
          
    if(SDT.trim().length() > 11){
           ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Số điện thoại không quá 11 ký tự");
              return false;
         }
    if (!SDT.equals("")) {
            try {
                Integer.parseInt(SDT);
                
            } catch (Exception e) {
                 ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Số điện thoại phải là kiểu số");  
                 return false;
            }

        }
    
    if(DiaChi.trim().equals("")){
             ChuyenDoi_ThongBao.ThongBao_Loi("Địa chỉ không được để trống","Thông Báo Lỗi");            
        }
    
    if(TrangThai.trim().equals("")){
             ChuyenDoi_ThongBao.ThongBao_Loi("Trạng thái mượn sách không được để trống","Thông Báo Lỗi");            
        }
        return true;
    }
    
    public static void DuLieuDatabase_Table(JTable Ten_table,ResultSet rs) {
        
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();        
        Object[] item = new Object[10]; // tạo mảng
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaDocGia");
                item[2] = rs.getString("TenDocGia");
                item[3] = rs.getString("MaLoaiDocGia");
                item[4] = rs.getString("GioiTinh"); 
                item[5] = rs.getString("NgaySinh");             
                item[6] = rs.getString("SDT");   
                item[7] = rs.getString("DiaChi");             
                item[8] = rs.getString("TrangThai");   
                item[9] = rs.getString("MoTa");   
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_DocGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int Them(String TenDocGia,String MaLoaiDG,int GioiTinh,
             String NgaySinh,String SDT,String DiaChi,String TrangThai,String MoTa) {
        
      if (Check(TenDocGia, MaLoaiDG,GioiTinh,NgaySinh, SDT, DiaChi, TrangThai, MoTa)){
          
            DTO_DocGia item = new DTO_DocGia(TenDocGia,Integer.parseInt(MaLoaiDG),GioiTinh,NgaySinh,SDT,DiaChi,TrangThai,MoTa);
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_DocGia.Them_DocGia(item);  
        }
      return -1;
    }         
      /*------------------------------------------------*/  
   
  public static int Sua(String MaDocGia,String TenDocGia,String MaLoaiDG,int GioiTinh,
             String NgaySinh,String SDT,String DiaChi,String TrangThai,String MoTa) {
         
      if(MaDocGia.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã độc giả");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaDocGia);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã độc giả phải là số");
              return -1;
             }
         }   
         
         
     if (Check(TenDocGia, MaLoaiDG,GioiTinh,NgaySinh, SDT, DiaChi, TrangThai, MoTa)){
          
            DTO_DocGia item = new DTO_DocGia(Integer.parseInt(MaDocGia),TenDocGia,Integer.parseInt(MaLoaiDG),GioiTinh,NgaySinh,SDT,DiaChi,TrangThai,MoTa);
            System.out.println("Sửa thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã sửa thành công !","Thông Báo Thành công");
           
          return DAL_DocGia.Update_DocGia(item);  
        }
      return -1;
    }         
    
      /*------------------------------------------------*/    
        
    public static int Xoa (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){               
             ChuyenDoi_ThongBao.ThongBao_Loi("Chưa có mã có mã độc giả","Thông Báo Lỗi");
              return rs;
              
           }else{
                try{
                     System.out.println("Xóa thành công");
                      
                      DAL_DocGia.Delete_DocGia(maLoai);
                }
                catch(Exception e){
                      ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Xóa không thành công");
                 
                }
            }
        }
     
        return rs;    // Lựa chọn là No       
     }
    
     public static DTO_DocGia LayTatCaKDocGiaTheoMaDG(String MaDG){
        DTO_DocGia kh = DAL_DocGia.LayDuLieuDocGiaTheoMaDG(MaDG);
        return kh;
    }
}
