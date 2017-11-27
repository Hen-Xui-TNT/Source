/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_Sach;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_Sach {

    public static ResultSet GetAll() {
        String query = "Select * from Sach";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }

    public static int Them_Sach(DTO_Sach item) {
        String query = "insert into Sach values(N'" + item.getTenSach() + "'," + item.getSoLuong() + ",N'" + item.getTinhTrangSach()
                + "'," + item.getGiaSach() + "," + item.getGiaNhap() + ",N'" + item.getNhaXuatBan() + "',N'" + item.getMoTa() + "')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_Sach(String MaSach) {
        String query = "Delete Sach where MaSach = " + MaSach;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_Sach(DTO_Sach item) {
        String query = "set dateformat dmy update Sach set "
                + "Tensach= N'" + item.getTenSach() + "',"
                + "SoLuongSach      = " + item.getSoLuong() + ","
                + "TinhTrangSach  = N'" + item.getTinhTrangSach() + "',"
                + "GiaSach      = " + item.getGiaSach() + ","
                + "GiaNhap      = " + item.getGiaNhap() + ", "
                + "NhaXuatBan      = N'" + item.getNhaXuatBan() + "',"
                + "MoTa     = N'" + item.getMoTa() + "' "
                + "where MaSach = " + item.getMaSach();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static ResultSet Seach_Sach(String seach) {
        String seach1 = "select * from Sach where   MaSach like  '%" + seach + "%'"
                + " or TenSach like N'%" + seach + "%' or SoLuongSach like '%" + seach + "%' or TinhTrangSach like N'%" + seach + "%' "
                + " or GiaNhap like '%" + seach + "%'  or GiaSach like '%" + seach + "%' or NhaXuatBan like N'%" + seach + "%'  or MoTa like N'%" + seach + "%' ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
    public static ResultSet lay_Sach(String seach) {
        String seach1 = "select * from Sach where   MaSach =  " + seach;
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
    public static ResultSet Get_IP() {
        String query = "SELECT Top 1 MaSach FROM Sach ORDER BY MaSach DESC"; 
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
}
