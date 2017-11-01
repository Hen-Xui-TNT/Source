/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_ChiTietPhieuNhap;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_ChiTietPhieuNhap {

    public static ResultSet GetAll() {
        String query = "Select * from ChiTietPhieuNhap";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }

    public static int Them_ChiTietPhieuNhap(DTO_ChiTietPhieuNhap item) {
        String query = "insert into ChiTietPhieuNhap values("+item.getMaPhieuNhap()+","+item.getMaSach()+","
                + ""+item.getGiaNhap()+","+item.getSoLuong()+","+item.getThanhTien()+",N'"+item.getGhiChu()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_ChiTietPhieuNhap(String ChiTietPhieuNhap) {
        String query = "delete from ChiTietPhieuNhap  where MaChiTietPhieuNhap = " + ChiTietPhieuNhap;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_ChiTietPhieuNhap(DTO_ChiTietPhieuNhap item) {
        String query = "update ChiTietPhieuNhap set MaPhieuNhap =" + item.getMaPhieuNhap()+ ""
                + ",MaSach=" + item.getMaSach() + ", GiaNhap=" + item.getGiaNhap()+ ""
                + ", SoLuong='" + item.getSoLuong() + "',ThanhTien=" + item.getThanhTien() + ""
                + ",GhiChu=N'" + item.getGhiChu() + "' "
                + "where MaChiTietPhieuNhap =" + item.getMaChiTietPhieuNhap();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
}
