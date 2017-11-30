/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_PhieuThanhLy;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_PhieuThanhLy {

    public static ResultSet GetAll() {
        String query = "Select * from PhieuThanhLy";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }

    public static int Them_PhieuThanhLy(DTO_PhieuThanhLy item) {
        String query = "set dateformat dmy insert into PhieuThanhLy values('" + item.getSoPhieu() + "'," + item.getMaNhanVien() + ""
                + ",'" + item.getNgayThanhLy() + "'," + item.getTongTien() + ",N'" + item.getGhiChu() + "')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_PhieuThanhLy(String MaPhieuThanhLy) {
        String query = "delete from PhieuThanhLy where MaPhieuThanhLy = " + MaPhieuThanhLy;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_PhieuThanhLy(DTO_PhieuThanhLy item) {
        String query = "set dateformat dmy update PhieuThanhLy set SoPhieuThanhLy =" + item.getSoPhieu() + ""
                + ",MaNhanVien=" + item.getMaNhanVien() + ",NgayThanhLy='" + item.getNgayThanhLy() + "',"
                + "TongTien=" + item.getTongTien() + ",GhiChu=N'" + item.getGhiChu() + "' "
                + "where MaPhieuThanhLy =" + item.getMaPhieuThanhLy();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static ResultSet LayMaPhieuThanhLyTuSoPhieuThanhLy(String SoPhieuThanhLy){
        ResultSet rs;
        String SQL = "select MaPhieuThanhLy from  PhieuThanhLy where SoPhieuThanhLy = '"+SoPhieuThanhLy+"'";
        rs =   DuAn1.conn.ExcuteQuerySelect(SQL);
        return rs;
    }
    public static ResultSet Seach_PhieuThanhLy(String seach) {
        String seach1 = "select * from PhieuThanhLy where   SoPhieuThanhLy like  '%" + seach + "%'"
                + " or MaNhanVien like '%" + seach + "%' or NgayThanhLy like '%" + seach + "%' "
                + " or TongTien like '%" + seach + "%'  or MaPhieuThanhLy like '%" + seach + "%' ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
}
