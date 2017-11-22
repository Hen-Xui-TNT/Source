/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_NhaCungCap;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_NhaCungCap {
     public static ResultSet GetAll() {
        String query = "Select * from NhaCungCap";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_NhaCungCap(DTO_NhaCungCap item){
     String query ="set dateformat dmy insert into NhaCungCap values( N'"+item.getTenNhaCungCap()+"',N'"
             +item.getDiaChi()+"','"+item.getSoDienThoai()+"',N'"+item.getGmail()+",N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_NhaCungCap(String MaNhaCungCap){
        String query = "Delete NhaCungCap where MaNhaCungCap = " + MaNhaCungCap;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_NhaCungCap(DTO_NhaCungCap item){
         String query = "set dateformat dmy update NhaCungCap set "+
               "TenNhaCungCap= N'"+item.getTenNhaCungCap()+"',"+
               "DiaChi       = N'"+item.getDiaChi()+"',"+
               "SDT  = '"+item.getSoDienThoai()+ "',"+
               "Gmail        = N'"+item.getGmail()+"',"+
               "GhiChu       = N' "+item.getGhiChu()+"' "+
              "where MaNhaCungCap = "+ item.getMaNhaCungCap();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   
     
}
