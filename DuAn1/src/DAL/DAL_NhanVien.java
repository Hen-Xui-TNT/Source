/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import GUI.DuAn1;
import DTO.DTO_NhanVien;
import java.sql.ResultSet;
/**
 *
 * @author Yuuki
 */
public class DAL_NhanVien {
    public static ResultSet GetAll() {
        String query = "Select * from NhanVien";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }      
    public static ResultSet GetAllCombobox() {
        String query = "select TenQuyen, MaQuyen from Quyen";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }        
    public static ResultSet GetAllCombobox_TenNV() {
        String query = "select TenNhanVien, MaNhanVien from NhanVien";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
    
    public static int Them_NhanVien(DTO_NhanVien item){
     String query ="set dateformat dmy insert into NhanVien values( N'" +item.getTenNV()+"','"
              +item.getTenDangNhap()+"','"+item.getMatKhau()+"',"
             +item.getMaQuyen()+","+item.getLuong()+",'"+item.getNgaySinh()+"','"
             +item.getNgayLam()+"'," +item.getGioiTinh()+ ",'"+item.getCMND()+"','"
             +item.getSoDienThoai()+"',N'"+item.getDiaChi()+"',N'"+item.getGhiChu()+"')";
     return DuAn1.conn.ExcuteNonQuery(query);
 }
    public static int Delete_NhanVien(String MaNhanVien){
        String query = "Delete NhanVien where MaNhanVien = " + MaNhanVien;
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static int Update_NhanVien(DTO_NhanVien item){
         String query = "set dateformat dmy update NhanVien set "+
               "TenNhanVien  = N'"+item.getTenNV()+"',"+
               "TenDangNhap = '"+item.getTenDangNhap()+"',"+
               "MatKhau   = '"+item.getGioiTinh()+ "',"+
               "MaQuyen    = "+item.getMaQuyen()+","+
               "Luong   = "+item.getLuong()+ ","+
               "NgaySinh    = '"+item.getNgaySinh()+"',"+
               "NgayLam  =  '"+item.getNgayLam()+ "',"+
               "GioiTinh    = "+item.getGioiTinh()+","+
               "CMND   = '"+item.getCMND()+"',"+
               "SoDienThoai    = ' "+item.getSoDienThoai()+"', "+
               "DiaChi   = N' "+item.getDiaChi()+"', "+
               "GhiChu      = N' "+item.getGhiChu()+"' "+
              "where MaNhanVien = "+ item.getMaNV();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   
   public static ResultSet Seach_NhanVien(String seach){
   String seach1 = "select * from NhanVien where   TenNhanVien like  N'%"+seach+"%'  or TenDangNhap like "
           + " N'%"+seach+"%' or MaQuyen like '%"+seach+"%' or NgaySinh like '%"+seach+"%' or NgayLam like '%"
           +seach+"%' or GioiTinh like '%"+seach+"%' or CMND like '%"+seach+"%' or DiaChi like N'%"+seach
           +"%' or Luong like '%"  +seach+"%' or MaNhanVien like '%"+seach+"%' ";
     
   return DuAn1.conn.ExcuteQuerySelect(seach1);
   }
}
