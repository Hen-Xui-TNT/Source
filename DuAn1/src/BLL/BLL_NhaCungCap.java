/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_NhaCungCap;
import DAL.DAL_NhaCungCap;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Yuuki
 */
public class BLL_NhaCungCap {
     public static boolean Check(String TenNCC,String DiaChi,String SDT,String Gmail,String GhiChu){
       
           
    if(TenNCC.trim().equals("")){
           ChuyenDoi_ThongBao.ThongBao_Loi("Tên nhà cung cấp không được để trống","Thông Báo Lỗi");  
            return false;
        }
    
    if (TenNCC.trim().length() > 100){
            ChuyenDoi_ThongBao.ThongBao_Loi(" Tên nhà cung cấp không quá 100 ký tự","Thông Báo Lỗi");                  
            return false;
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
    
    if(Gmail.trim().equals("")){
             ChuyenDoi_ThongBao.ThongBao_Loi("Gmail không được để trống","Thông Báo Lỗi");            
        }
        if (!Gmail.equals("")) {
            String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern regex = Pattern.compile(emailPattern);
            Matcher matcher = regex.matcher(Gmail);
            if (matcher.find()) {

            } else {
                 ChuyenDoi_ThongBao.ThongBao_Loi("Gmail nhập sai,vui lòng nhập theo cú pháp sau: abc@gmail.com","Thông Báo Lỗi");    
                 return false;
            }
        }
    
        return true;
    }
    
    public static void DuLieuDatabase_Table(JTable Ten_table,ResultSet rs) {
        
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();        
        Object[] item = new Object[7]; // tạo mảng
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaNhaCungCap");
                item[2] = rs.getString("TenNhaCungCap");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getString("SDT"); 
                item[5] = rs.getString("Gmail");
                item[6] = rs.getString("GhiChu");   
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhaCungCap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int Them(String TenNCC,String DiaChi,String SDT,String Gmail,String GhiChu) {
        
         if (Check(  TenNCC, DiaChi, SDT, Gmail, GhiChu)){
          
            DTO_NhaCungCap item = new DTO_NhaCungCap(TenNCC,DiaChi,SDT,Gmail,GhiChu);
            
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_NhaCungCap.Them_NhaCungCap(item);  
        }
      return -1;
    }  

      /*------------------------------------------------*/  
   
     public static int Sua(String MaNCC,String TenNCC,String DiaChi,String SDT,String Gmail,String GhiChu) {
         
      if(MaNCC.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã nhà cung cấp");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaNCC);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã nhà cung cấp phải là số");
              return -1;
             }
         }   
         
       if (Check(  TenNCC, DiaChi, SDT, Gmail, GhiChu)){
          
            DTO_NhaCungCap item = new DTO_NhaCungCap(TenNCC,DiaChi,SDT,Gmail,GhiChu);
            
            System.out.println("Sửa thành công");
           
          return DAL_NhaCungCap.Update_NhaCungCap(item);  
        }
      return -1;
    }         
      /*------------------------------------------------*/          
   
       public static int Xoa (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){               
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có mã nhà cung cấp");
              return rs;
              
           }else{
                try{
                     
                      System.out.println("Xóa thành công");
                      DAL_NhaCungCap.Delete_NhaCungCap(maLoai);
                }
                catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_ThanhCong("Thông Báo Lỗi", "Xóa không thành công");
                 
                }
            }
        }
     
        return rs;    // Lựa chọn là No       
     }
       
       
        public static DTO_NhaCungCap LayTatCaNCCTheoMaNCC(String Ma){
        DTO_NhaCungCap kh = DAL_NhaCungCap.LayDuLieuNCC(Ma);
        return kh;
    }
}