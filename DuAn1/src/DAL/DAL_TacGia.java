/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_TacGia;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_TacGia {
     public static ResultSet GetAll() {
        String query = "Select * from TacGia";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_TacGia(DTO_TacGia item){
     String query ="set dateformat dmy insert into TacGia values(N'" 
             +item.getTenTacGia()+"',N'" 
             +item.getButDanh()+"',"+item.getGioiTinh()+",'"+item.getNgaySinh()+"',N'"
             +item.getNoiSinh()+"',N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_TacGia(String MaTacGia){
        String query = "Delete TacGia where MaTacGia = " + MaTacGia;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_TacGia(DTO_TacGia item){
         String query = "set dateformat dmy update TacGia set "+
               "TenTacGia  = N'"+item.getTenTacGia()+"',"+
               "ButDanh    = N'"+item.getButDanh()+"',"+
               "GioiTinh   = "+item.getGioiTinh()+ ","+ 
               "NgaySinh   = '"+item.getNgaySinh()+"',"+
               "NoiSinh    = N"+item.getNoiSinh()+"',"+
               "GhiChu     = N'"+item.getGhiChu()+"'"+
              "where MaTacGia = "+ item.getMaTacGia();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static ResultSet timkiemPmn(String key) {
        String query = "Select * from TacGia where TenTacGia like N'%" + key +"%'";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
   
    
}
