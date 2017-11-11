/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_PhieuPhat;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_PhieuPhat {
        public static ResultSet GetAll() {
        String query = "Select * from PhieuPhat";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
        public static int Them_PhieuPhat(DTO_PhieuPhat item){
    String query ="set dateformat dmy insert into PhieuPhat values('"+item.getSoPhieuPhat()+"',"+item.getMaDocGia()+""
            + ","+item.getMaNhanVien()+",'"+item.getNgayPhat()+"',"+item.getTongTien()+",N'"+item.getGhiChu()+"' )";
    return DuAn1.conn.ExcuteNonQuery(query);
}   
    public static int Xoa_PhieuPhat(String PhieuPhat){
     String query = "delete from PhieuPhat where MaPhieuPhat = "+ PhieuPhat;
     return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static int Sua_PhieuPhat(DTO_PhieuPhat item){
    String query = "set dateformat dmy update PhieuPhat set SoPhieuPhat ="+item.getSoPhieuPhat()+""
            + ",MaDocGia="+item.getMaDocGia()+", MaNhanVien="+item.getMaNhanVien()+""
            + ", NgayPhat='"+item.getNgayPhat()+"',TongTien="+item.getTongTien()+""
            + ",GhiChu=N'"+item.getGhiChu()+"' "
            + "where MaPhieuPhat =" +item.getMaPhieuPhat();
    return DuAn1.conn.ExcuteNonQuery(query);
    }
     public static ResultSet Seach_PhieuPhat(String seach) {
        String seach1 = "select * from PhieuPhat where   SoPhieuPhat like  '%" + seach + "%'  or MaDocGia like "
                + " '%" + seach + "%' or MaNhanVien like '%" + seach + "%' or NgayPhat like '%" + seach + "%' "
                + " or TongTien like '%" + seach + "%'  or MaPhieuPhat like '%" + seach + "%' ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
     public static ResultSet LayMaPhieuPhatTuSoPhieuPhat(String SoPhieuPhat){
        ResultSet rs;
        String SQL = "select MaPhieuPhat from  PhieuPhat where SoPhieuPhat = '"+SoPhieuPhat+"'";
        rs =   DuAn1.conn.ExcuteQuerySelect(SQL);
        return rs;
    }
}
