/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_LoaiDocGia;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_LoaiDocGia {

    public static ResultSet GetAll() {
        String query = "Select * from LoaiDocGia";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }

    public static int Them_LoaiDocGia(DTO_LoaiDocGia item) {
        String query = "insert into LoaiDocGia values(N'" + item.getTenLoai() + "'," + item.getUuDai() + ", N'" + item.getMoTa() + "')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_LoaiDocGia(String MaLoaiDocGia) {
        String query = "Delete LoaiDocGia where MaLoaiDocGia = " + MaLoaiDocGia;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_LoaiDocGia(DTO_LoaiDocGia item) {
        String query = "update LoaiDocGia set "
                + "TenLoaiDocGia= N'" + item.getTenLoai() + "',"
                + "UuDai    = " + item.getUuDai() + ","
                + "TinhTrangSach  = N'" + item.getMoTa() + "' "
                + "where MaLoaiDocGia = " + item.getMaLoaiDocGia();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
     public static ResultSet Seach_LoaiDocGia(String seach) {
        String seach1 = "select * from LoaiDocGia where   TenLoaiDocGia like  N'%" + seach + "%'"
                + " or UuDai like N'%" + seach + "%' or TinhTrangSach like N'%" + seach + "%'"
                + " or MaLoaiDocGia like N'%" + seach + "%'";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
     }
}
