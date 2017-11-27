/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_TacGia;
import DAL.DAL_TacGia;
import DAL.DateFormatString;
import GUI.frm_thongtinsach;
import static GUI.frm_thongtinsach.Pmn_tacgia;
import static GUI.frm_thongtinsach.txt_timkiemtacgia;
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
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
/**
 *
 * @author Yuuki
 */
public class BLL_TacGia {
     public static boolean Check(String TenTacGia,String ButDanh,int GioiTinh,
             String NgaySinh,String NoiSinh,String GhiChu){
       
   if((TenTacGia.trim().equals(""))&& ButDanh.trim().equals("")){
             ChuyenDoi_ThongBao.ThongBao_Loi("Bạn phải nhập ít nhất tên tác giả hoặc bút danh","Thông Báo Lỗi");            
        }
    
   if (TenTacGia.trim().length() > 50){
            ChuyenDoi_ThongBao.ThongBao_Loi(" Tên tác giả không quá 50 ký tự","Thông Báo Lỗi");                  
            return false;
             }  
       
   if (ButDanh.trim().length() > 50){
            ChuyenDoi_ThongBao.ThongBao_Loi(" Bút danh không quá 50 ký tự","Thông Báo Lỗi");                  
            return false;
             }  
           
         
   if(NgaySinh.trim().equals("")){
                              
        }else{
              try{
                   DateFormatString.getDate(NgaySinh);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Ngày sinh phải là kiểu date");
              return false;
             }
          }
       
        return true;
    }
    
    public static void DuLieuDatabase_Table(JTable Ten_table,ResultSet rs) {
        
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();        
        Object[] item = new Object[8]; // tạo mảng
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaTacGia");
                item[2] = rs.getString("TenTacGia");
                item[3] = rs.getString("ButDanh");
                item[4] = rs.getString("GioiTinh"); 
                item[5] = rs.getString("NgaySinh");             
                item[6] = rs.getString("NoiSinh");   
                item[7] = rs.getString("GhiChu");             
               
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_TacGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int Them(String TenTacGia,String ButDanh,int GioiTinh,
             String NgaySinh,String NoiSinh,String GhiChu) {
        
      if (Check( TenTacGia, ButDanh, GioiTinh,NgaySinh, NoiSinh, GhiChu)){
          
            DTO_TacGia item = new DTO_TacGia(TenTacGia,ButDanh,GioiTinh,NgaySinh,NoiSinh,GhiChu);
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_TacGia.Them_TacGia(item);  
        }
      return -1;
    }         
      /*------------------------------------------------*/  
   
  public static int Sua(String MaTacGia,String TenTacGia,String ButDanh,int GioiTinh,
             String NgaySinh,String NoiSinh,String GhiChu) {
         
      if(MaTacGia.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã tác giả");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaTacGia);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã tác giả phải là số");
              return -1;
             }
         }   
         
         
     if (Check(TenTacGia, ButDanh, GioiTinh,NgaySinh, NoiSinh, GhiChu)){
          
            DTO_TacGia item = new DTO_TacGia(Integer.parseInt(MaTacGia),TenTacGia, ButDanh, GioiTinh,NgaySinh, NoiSinh, GhiChu);
            System.out.println("Sửa thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã sửa thành công !","Thông Báo Thành công");
           
          return DAL_TacGia.Update_TacGia(item);  
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
                      DAL_TacGia.Delete_TacGia(maLoai);
                }
                catch(Exception e){
                      ChuyenDoi_ThongBao.ThongBao_ThanhCong("Thông Báo Lỗi", "Xóa không thành công");
                 
                }
            }
        }
     
        return rs;    // Lựa chọn là No       
     }
    
    public static void DLPopupMenu(JPopupMenu Ten,ResultSet rs){
        Ten.removeAll();// set lại số dòng của bảng về 0
        try {
            while(rs.next()){
                JMenuItem MN = new JMenuItem(rs.getString("TenTacGia"));
                Ten.add(MN);
                MN.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MNactionPerformed(evt);
                    }

                    private void MNactionPerformed(ActionEvent evt) {
                        them(evt.getActionCommand());
                    }
                });
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Ten.show(txt_timkiemtacgia, 0, 25);
    }
    public static void them(String key) {
        DefaultTableModel table = (DefaultTableModel)frm_thongtinsach.tbl_tacgia.getModel();
       ResultSet rs = DAL_TacGia.timkiemPmn(key);
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaTacGia");
                item[2] = rs.getString("TenTacGia");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
