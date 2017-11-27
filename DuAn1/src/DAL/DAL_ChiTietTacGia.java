/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_ChiTietTacGia;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_ChiTietTacGia {
     public static ResultSet GetAll() {
        String query = "Select * from ChiTietTacGia";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_ChiTietTacGia(DTO_ChiTietTacGia item){
     String query ="set dateformat dmy insert into ChiTietTacGia values("+item.getMaSach()+"," 
             +item.getMaTacGia()+",N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_ChiTietTacGia(String MaSach){
        String query = "Delete ChiTietTacGia where MaSach =  " + MaSach;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_ChiTietTacGia(DTO_ChiTietTacGia item){
         String query = "update ChiTietTacGia set "+
               "MaSach  = "+item.getMaSach()+","+     
               "MaTacGia  = "+item.getMaTacGia()+","+     
               "GhiChu       = N' "+item.getGhiChu()+"' "+
              "where MaChiTietTacGia = "+ item.getMaChiTietTacGia();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static ResultSet DoDLCombobox(String MaSach) {
        String query = "select ChiTietTacGia.MaChiTietTacGia,TacGia.TenTacGia,TacGia.MaTacGia from TacGia,ChiTietTacGia "
                + "where ChiTietTacGia.MaTacGia = TacGia.MaTacGia and ChiTietTacGia.MaSach = "+ MaSach;
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
     
}
