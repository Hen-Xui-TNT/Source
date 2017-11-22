/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_ChiTietTheLoai;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_ChiTietTheLoai {
     public static ResultSet GetAll() {
        String query = "Select * from ChiTietTheLoai";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_ChiTietTheLoai(DTO_ChiTietTheLoai item){
     String query ="set dateformat dmy insert into ChiTietTheLoai values("+item.getMaSach()+"," 
             +item.getMaTheLoai()+",N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_ChiTietTheLoai(String MaChiTietTheLoai){
        String query = "Delete ChiTietTheLoai where MaChiTietTheLoai = " + MaChiTietTheLoai;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_ChiTietTheLoai(DTO_ChiTietTheLoai item){
         String query = "update ChiTietTheLoai set "+
               "MaSach  = "+item.getMaSach()+","+     
               "MaTheLoai  = "+item.getMaTheLoai()+","+     
               "GhiChu       = N' "+item.getGhiChu()+"' "+
              "where MaChiTietTheLoai = "+ item.getMaChiTietTheLoai();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static ResultSet DoDLCombobox(String MaSach) {
        String query = "select ChiTietTheLoai.MaChiTietTheLoai,TheLoai.MaTheLoai,TheLoai.TenTheLoai from TheLoai,ChiTietTheLoai "
                + "where ChiTietTheLoai.MaTheLoai = TheLoai.MaTheLoai and ChiTietTheLoai.MaSach = "+ MaSach;
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
     
}
