/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import GUI.DuAn1;
import DTO.DTO_PhieuNhap;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_PhieuNhap {
     public static ResultSet GetAll() {
        String query = "Select * from PhieuNhap";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
 public static int Them_PhieuNhap(DTO_PhieuNhap item){
     String query ="set dateformat dmy insert into PhieuNhap values( '" +item.getSoPhieuNhap()+"',"
             +item.getMaNhaCungCap()+","+item.getMaNhanVien()+",'"+item.getNgayNhap()+"',"
             +item.getTongTien()+",N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
   public static int Delete_PhieuNhap(String MaPhieuNhap){
        String query = "Delete PhieuNhap where MaPhieuNhap = " + MaPhieuNhap;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static int Update_PhieuNhap(DTO_PhieuNhap item){
         String query = "set dateformat dmy update PhieuNhap set "+
               "SoPhieuNhap  = '"+item.getSoPhieuNhap()+"',"+
               "MaNhaCungCap = "+item.getMaNhaCungCap()+","+
               "MaNhanVien   = "+item.getMaNhanVien()+ ","+
               "NgayNhap     = '"+item.getNgayNhap()+"',"+
               "TongTien     = "+item.getTongTien()+","+
               "GhiChu       = N' "+item.getGhiChu()+"' "+
              "where MaPhieuNhap = "+ item.getMaPhieuNhap();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   
      public static ResultSet LayMaPhieuNhapTuSoPhieuNhap(String SoPhieuNhap){
        ResultSet rs;
        String SQL = "select MaPhieuNhap from  PhieuNhap where SoPhieuNhap = '"+SoPhieuNhap+"'";
        rs =   DuAn1.conn.ExcuteQuerySelect(SQL);
        return rs;
    }
      
     public static ResultSet DLCHI_TL(String TuNgay,String DenNgay,String TenNV) {
        String SQL = "set dateformat dmy select * from NhanVien,PhieuNhap where "
                + "NhanVien.MaNhanVien = PhieuNhap.MaNhanVien "
                + "and PhieuNhap.NgayNhap < '"+DenNgay+"'  "
                + "and PhieuNhap.NgayNhap > '"+TuNgay+"' "
                + "and TenNhanVien like N'%"+TenNV+"%' "
                + "ORDER BY NgayNhap ASC";
        return DuAn1.conn.ExcuteQuerySelect(SQL);
    } 
      
}
