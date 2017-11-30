/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_KhuyenMai;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_KhuyenMai {

    public static ResultSet GetAll() {
        String query = "Select * from KhuyenMai";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }

    public static int Them_KhuyenMai(DTO_KhuyenMai item) {
        String query = "set dateformat dmy insert into KhuyenMai values('" + item.getNgayBatDau() + "','" + item.getNgayKetThuc()
                + "'," + item.getSoTienHoaDon() + "," + item.getSoLuong() + ""
                + "," + item.getMaSach() + "," + item.getGiaSach() + "," + item.getKhuyenMai() + ")";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_KhuyenMai(String MaKhuyenMai) {
        String query = "Delete KhuyenMai where MaKhuyenMai = " + MaKhuyenMai;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_KhuyenMai(DTO_KhuyenMai item) {
        String query = "set dateformat dmy update KhuyenMai set "
                + "NgayBatDau= '" + item.getNgayBatDau() + "',"
                + "NgayKetThuc  = '" + item.getNgayKetThuc() + "',"
                + "SoTienHoaDon  = " + item.getSoTienHoaDon() + ","
                + "SoLuong      = " + item.getSoLuong() + ","
                + "MaSach      = " + item.getMaSach() + ", "
                + "GiaSach     = ' " + item.getGiaSach() + "', "
                + "KhuyenMai     = ' " + item.getKhuyenMai() + "' "
                + "where MaKhuyenMai = " + item.getMaKhuyenMai();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static ResultSet Seach_KhuyenMai(String seach) {
        String seach1 = "select * from KhuyenMai where   MaKhuyenMai like  '%" + seach + "%'"
                + " or MaSach like '%" + seach + "%' or SoLuong like '%" + seach + "%' "
                + " or KhuyenMai like '%" + seach + "%' or GiaSach like '%" + seach + "%'  or SoTienHoaDon like '%" + seach + "%' ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    } 
   public static ResultSet CBB_KhuyenMai(String seach) {
        String seach1 = "select * from KhuyenMai where   MaKhuyenMai = " + seach ;
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
   public static ResultSet Seach_MaSach(String seach) {
        String seach1 = "select * from KhuyenMai where MaSach = " + seach;
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
   public static ResultSet Seach_MaKM(String seach) {
        String seach1 = "select * from KhuyenMai where MaKhuyenMai = " + seach;
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
   public static ResultSet GetKMTienHD() {
        String query = "Select * from KhuyenMai where SoTienHoaDon like N'%%'";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
   public static int SetKMTienHD(DTO_KhuyenMai item) {
        String query = "set dateformat dmy insert into KhuyenMai(NgayBatDau,NgayKetThuc,SoTienHoaDon,GiaSach,KhuyenMai) values('"+item.getNgayBatDau()
                +"','"+item.getNgayKetThuc()+"',"+item.getSoTienHoaDon()+","+item.getGiaSach()+",N'"+item.getKhuyenMai()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static ResultSet GetKMSLSach() {
        String query = "Select * from KhuyenMai where SoLuong like N'%%'";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
    public static int SetKMSLSach(DTO_KhuyenMai item) {
        String query = "set dateformat dmy insert into KhuyenMai(NgayBatDau,NgayKetThuc,SoLuong,GiaSach,KhuyenMai) values('"+item.getNgayBatDau()
                +"','"+item.getNgayKetThuc()+"',"+item.getSoLuong()+","+item.getGiaSach()+",N'"+item.getKhuyenMai()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static ResultSet GetKMDongGia() {
        String query = "Select * from KhuyenMai where DongofGiam = 1";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
   public static int SetKMDongGia(DTO_KhuyenMai item) {
        String query = "set dateformat dmy insert into KhuyenMai(NgayBatDau,NgayKetThuc,MaSach,GiaSach,DongofGiam,KhuyenMai) values('"+item.getNgayBatDau()
                +"','"+item.getNgayKetThuc()+"',"+item.getMaSach()+","+item.getGiaSach()+",1,N'"+item.getKhuyenMai()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static ResultSet GetKMCuon() {
        String query = "Select * from KhuyenMai where DongofGiam = 0";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
   public static int SetKMCuon(DTO_KhuyenMai item) {
        String query = "set dateformat dmy insert into KhuyenMai(NgayBatDau,NgayKetThuc,MaSach,GiaSach,DongofGiam,KhuyenMai) values('"+item.getNgayBatDau()
                +"','"+item.getNgayKetThuc()+"',"+item.getMaSach()+","+item.getGiaSach()+",0,N'"+item.getKhuyenMai()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }
   public static ResultSet GetKMVoucher() {
        String query = "Select * from KhuyenMai where Voucher like '%%'";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
   public static int SetKMVoucher(DTO_KhuyenMai item) {
        String query = "set dateformat dmy insert into KhuyenMai(NgayBatDau,NgayKetThuc,Voucher,GiaSach,KhuyenMai) values('"+item.getNgayBatDau()
                +"','"+item.getNgayKetThuc()+"',"+item.getVoucher()+","+item.getGiaSach()+",N'"+item.getKhuyenMai()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }
}
