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
}
