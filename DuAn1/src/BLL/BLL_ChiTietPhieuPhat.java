/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_ChiTietPhieuPhat;
import DAL.DAL_ChiTietPhieuPhat;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Yuuki
 */
 public class BLL_ChiTietPhieuPhat {
     public static boolean Check(String MaPhieuPhat,String MaSach,String LoiPhat,
             String TienPhat,String SoLuong,String ThanhTien,String GhiChu){
       
    if(MaPhieuPhat.trim().equals("")){
           ChuyenDoi_ThongBao.ThongBao_Loi("Mã phiếu phạt không được để trống","Thông Báo Lỗi");                  
        } else{
              try{
                   Integer.parseInt(MaPhieuPhat);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Mã phiếu phạt phải là kiểu số","Thông Báo Lỗi");
              return false;
             }
              
    }       
    if(MaSach.trim().equals("")){
           ChuyenDoi_ThongBao.ThongBao_Loi("Mã sách không được để trống","Thông Báo Lỗi");                  
        } else{
              try{
                   Integer.parseInt(MaSach);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Mã sách phải là kiểu số","Thông Báo Lỗi");
              return false;
             }
    }
          
    if (LoiPhat.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Lỗi phạt không được để trống !!!", "Thông Báo Lỗi");
            return false;
        }    
    
    if(TienPhat.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi( "Tiền phạt không được để trống !!! ","Thông Báo Lỗi");
              return false;
         }
        else{
             try{
                 Double.parseDouble(TienPhat);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi( "Tiền phạt thuê phải là số","Thông Báo Lỗi");
              return false;
             }
         }
        
    if(SoLuong.trim().equals("")){
           ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng không được để trống","Thông Báo Lỗi");                  
        } else{
              try{
                   Integer.parseInt(SoLuong);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng phải là kiểu số","Thông Báo Lỗi");
              return false;
             } 
              
    }
    
    if(ThanhTien.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi( "Thành tiền không được để trống !!! ","Thông Báo Lỗi");
              return false;
         }
        else{
             try{
                 Double.parseDouble(ThanhTien);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi( "Thành tiền thuê phải là số","Thông Báo Lỗi");
              return false;
             }
         }
    
        return true;
    }
    
    public static void DuLieuDatabase_Table(JTable Ten_table,ResultSet rs) {
        
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();        
        Object[] item = new Object[9]; // tạo mảng
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaChiTietPhieuPhat");
                item[2] = rs.getString("MaPhieuPhat");
                item[3] = rs.getString("MaSach");
                item[4] = rs.getString("LoiPhat"); 
                item[5] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("TienPhat"));             
                item[6] = rs.getString("SoLuong");   
                item[7] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("ThanhTien"));             
                item[8] = rs.getString("GhiChu");   
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_ChiTietPhieuPhat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int Them(String MaPhieuPhat,String MaSach,String LoiPhat,
             String TienPhat,String SoLuong,String ThanhTien,String GhiChu) {
      if (Check( MaPhieuPhat, MaSach, LoiPhat,TienPhat, SoLuong, ThanhTien, GhiChu)){
          
            DTO_ChiTietPhieuPhat item = new DTO_ChiTietPhieuPhat(Integer.parseInt(MaPhieuPhat), Integer.parseInt(MaSach),LoiPhat,
                    Double.parseDouble(TienPhat), Integer.parseInt(SoLuong),Double.parseDouble(ThanhTien), GhiChu );
            
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_ChiTietPhieuPhat.Them_ChiTietPhieuPhat(item);  
        }
      return -1;
    }         
      /*------------------------------------------------*/  
   
     public static int Sua(String MaCTPP,String MaPhieuPhat,String MaSach,String LoiPhat,
             String TienPhat,String SoLuong,String ThanhTien,String GhiChu) {
         
      if(MaCTPP.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã chi tiết phiếu phạt");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaCTPP);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã chi tiết phiếu phạt phải là số");
              return -1;
             }
         }   
         
         
      if (Check( MaPhieuPhat, MaSach, LoiPhat,TienPhat, SoLuong, ThanhTien, GhiChu)){
          
            DTO_ChiTietPhieuPhat item = new DTO_ChiTietPhieuPhat(Integer.parseInt(MaCTPP),Integer.parseInt(MaPhieuPhat), Integer.parseInt(MaSach),LoiPhat,
                    Double.parseDouble(TienPhat), Integer.parseInt(SoLuong),Double.parseDouble(ThanhTien), GhiChu );
            
            System.out.println("Sửa thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã sửa thành công !","Thông Báo Thành công");
           
          return DAL_ChiTietPhieuPhat.Update_ChiTietPhieuPhat(item);  
        }
      return -1;
    }         
      /*------------------------------------------------*/    
        
    public static int Xoa_CTPT (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){               
             ChuyenDoi_ThongBao.ThongBao_Loi("Chưa có mã chi tiết phiếu phạt","Thông Báo Lỗi");
              return rs;
              
           }else{
                try{
                     System.out.println("Xóa thành công");
                      DAL_ChiTietPhieuPhat.Delete_ChiTietPhieuPhat(maLoai);
                }
                catch(Exception e){
                      ChuyenDoi_ThongBao.ThongBao_ThanhCong("Thông Báo Lỗi", "Xóa không thành công");
                 
                }
            }
        }
     
        return rs;    // Lựa chọn là No       
     }
}
