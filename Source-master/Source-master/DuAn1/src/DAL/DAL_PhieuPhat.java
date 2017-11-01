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
    String query ="insert into PhieuPhat values('"+item.getSoPhieuPhat()+"',"+item.getMaDocGia()+""
            + ","+item.getMaNhanVien()+",'"+item.getNgayPhat()+"',"+item.getTongTien()+",N'"+item.getGhiChu()+"' )";
    return DuAn1.conn.ExcuteNonQuery(query);
}   
    public static int Xoa_PhieuPhat(String PhieuPhat){
     String query = "delete from PhieuPhat where MaPhieuPhat = "+ PhieuPhat;
     return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static int Sua_PhieuPhat(DTO_PhieuPhat item){
    String query = "update PhieuPhat set SoPhieuPhat ="+item.getSoPhieuPhat()+""
            + ",MaDocGia="+item.getMaDocGia()+", MaNhanVien="+item.getMaNhanVien()+""
            + ", NgayPhat='"+item.getNgayPhat()+"',TongTien="+item.getTongTien()+""
            + ",GhiChu=N'"+item.getGhiChu()+"' "
            + "where MaPhieuPhat =" +item.getMaPhieuPhat();
    return DuAn1.conn.ExcuteNonQuery(query);
    }
}
