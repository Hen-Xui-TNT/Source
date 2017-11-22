/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_DocGia;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_DocGia {
     public static ResultSet GetAll() {
        String query = "Select * from DocGia";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
     
    public static ResultSet GetAllCombobox() {
        String query = "select TenLoaiDocGia, MaLoaiDocGia from LoaiDocGia";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_DocGia(DTO_DocGia item){
     String query ="set dateformat dmy insert into DocGia values( N'" +item.getTenDocGia()+"',"
             +item.getMaLoaiDocGia()+","+item.getGioiTinh()+",'"+item.getNgaySinh()+"','"
             +item.getSoDienThoai()+"',N'"+item.getDiaChi()+"',N'"+item.getTrangThai()+
             "',N'"+item.getMoTa()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_DocGia(String MaDocGia){
        String query = "Delete DocGia where MaDocGia = " + MaDocGia;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_DocGia(DTO_DocGia item){
         String query = "set dateformat dmy update DocGia set "+
               "TenDocGia  = N'"+item.getTenDocGia()+"',"+
               "MaLoaiDocGia = "+item.getMaLoaiDocGia()+","+
               "GioiTinh   = "+item.getGioiTinh()+ ","+
               "NgaySinh     = '"+item.getNgaySinh()+"',"+
               "SDT     = '"+item.getSoDienThoai()+"',"+
               "DiaChi     = N' "+item.getDiaChi()+"', "+
               "TrangThai   = N' "+item.getTrangThai()+"', "+
               "MoTa      = N' "+item.getMoTa()+"' "+
              "where MaDocGia = "+ item.getMaDocGia();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   
     
}
