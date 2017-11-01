/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_ChiTietPhieuPhat;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_ChiTietPhieuPhat {
     public static ResultSet GetAll() {
        String query = "Select * from ChiTietPhieuPhat";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_ChiTietPhieuPhat(DTO_ChiTietPhieuPhat item){
     String query ="set dateformat dmy insert into ChiTietPhieuPhat values( " +item.getMaPhieuPhat()+","
             +item.getMaSach()+",N'"+item.getLoiPhat()+"',"+item.getTienPhat()+","
             +item.getSoLuong()+"," +item.getThanhTien()+",N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_ChiTietPhieuPhat(String MaChiTietPhieuPhat){
        String query = "Delete ChiTietPhieuPhat where MaChiTietPhieuPhat = " + MaChiTietPhieuPhat;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_ChiTietPhieuPhat(DTO_ChiTietPhieuPhat item){
         String query = "set dateformat dmy update ChiTietPhieuPhat set "+
               "MaPhieuPhat  = "+item.getMaPhieuPhat()+","+
               "MaSach = "+item.getMaSach()+","+
               "LoiPhat   = N'"+item.getLoiPhat()+ "',"+
               "TienPhat  = "+item.getTienPhat()+","+
               "SoLuong   = "+item.getSoLuong()+","+
               "ThanhTien = "+item.getThanhTien()+","+
               "GhiChu    = N' "+item.getGhiChu()+"' "+
              "where MaChiTietPhieuPhat = "+ item.getMaChiTietPhieuPhat();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   
}
