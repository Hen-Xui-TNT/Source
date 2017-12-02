/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
import DAL.*;
import GUI.*;
//mport BLL.*;
import DTO.DTO_PhieuThue;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author tamntmpk00821
 */
public class DAL_PhieuThue {

    public static ResultSet GetAll() {
        String query = "Select * from PhieuThue";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }

    public static int Them_PhieuThue(DTO_PhieuThue item) {
        String query = "set dateformat dmy insert into PhieuThue values('" + item.getSoPhieuThue() + "'," + item.getMaDocGia() + "," + item.getMaNhanVien() + ""
                + ",'" + item.getNgayThue() + "','" + item.getNgayTra() + "'," + item.getTongTien() + ",N'" + item.getGhiChu() + "' )";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_PhieuThue(String PhieuThue) {
        String query = "delete from PhieuThue where MaPhieuThue = " + PhieuThue;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_PhieuThue(DTO_PhieuThue item) {
        String query = "set dateformat dmy update PhieuThue set SoPhieuThue =" + item.getSoPhieuThue() + ""
                + ",MaDocGia=" + item.getMaDocGia() + ", MaNhanVien=" + item.getMaNhanVien() + ""
                + ", NgayThue='" + item.getNgayThue() + "',NgayTra= '" + item.getNgayTra() + "'"
                + ",TongTien=" + item.getTongTien() + ",GhiChu=N'" + item.getGhiChu() + "' "
                + "where MaPhieuThue =" + item.getMaPhieuThue();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    
      public static int Sua_PhieuThue_giahan(DTO_PhieuThue item) {
        String query = "set dateformat dmy update PhieuThue set "
                + "MaNhanVien=" + item.getMaNhanVien() 
                + ", NgayTra= '" + item.getNgayTra() + "'"
                + ",TongTien=" + item.getTongTien() + ""
                + ",GhiChu=N'" + item.getGhiChu() + "' "
                + "where MaPhieuThue =" + item.getMaPhieuThue();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
 
 
    public static ResultSet LayMaPhieuThueTuSoPhieuThue(String SoPhieuThue){
        ResultSet rs;
        String SQL = "select MaPhieuThue from  PhieuThue where SoPhieuThue = '"+SoPhieuThue+"'";
        rs =   DuAn1.conn.ExcuteQuerySelect(SQL);
        return rs;
    }

    public static ResultSet Seach_PhieuThue(String seach) {
        String seach1 = "select * from PhieuThue,NhanVien where PhieuThue.MaNhanVien = NhanVien.MaNhanVien and   SoPhieuThue like  '%" + seach + "%'  or MaDocGia like "
                + " '%" + seach + "%' or NhanVien.MaNhanVien like '%" + seach + "%' or NgayThue like '%" + seach + "%' or NgayTra like '%"
                + seach + "%' or TongTien like '%" + seach + "%'  or MaPhieuThue like '%" + seach + "%' ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
    public static ResultSet get_PhieuThue() {
        String seach1 = "select * from PhieuThue,NhanVien,DocGia where "
                + "PhieuThue.MaNhanVien = NhanVien.MaNhanVien and  PhieuThue.MaDocGia = DocGia.MaDocGia ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
    public static ResultSet GetCTPT_byMaPhieu(String seach) {
        String query = "Select * from ChiTietPhieuThue,PhieuThue " +
    "where ChiTietPhieuThue.MaPhieuThue = PhieuThue.MaPhieuThue and SoPhieuThue = '" + seach +"'";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
    
    public static ResultSet GetCTPT(String seach) {
        String query = "Select * from ChiTietPhieuThue where MaChiTietPhieuThue = " + seach ;
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
    
    public static ResultSet GetNgayTra_CTPT(int seach) {
        String query = "Select TongTien from PhieuThue where MaPhieuThue = " + seach ;
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
    public static ResultSet DLTTHU_TL(String TuNgay,String DenNgay,String TenNV) {
        String SQL = "set dateformat dmy select * from NhanVien,PhieuThue where "
                + "NhanVien.MaNhanVien = PhieuThue.MaNhanVien "
                + "and PhieuThue.NgayThue < '"+DenNgay+"'  "
                + "and PhieuThue.NgayThue > '"+TuNgay+"' "
                + "and TenNhanVien like N'%"+TenNV+"%' "
                + "ORDER BY NgayThue ASC";
        return DuAn1.conn.ExcuteQuerySelect(SQL);
    }
    
    

}
