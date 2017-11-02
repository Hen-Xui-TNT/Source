/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_ChiTietPhieuThanhLy;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_ChiTietPhieuThanhLy {
        public static ResultSet GetAll() {
        String query = "Select * from ChiTietPhieuThanhLy";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
         public static int Them_ChiTietPhieuThanhLy(DTO_ChiTietPhieuThanhLy item){
    String query ="insert into ChiTietPhieuThanhLy values("+item.getMaPhieuThanhLy()+","+item.getMaSach()+""
            + ","+item.getGiaThanhLy()+","+item.getSoLuong()+","+item.getThanhTien()+",N'"+item.getGhiChu()+"')";
    return DuAn1.conn.ExcuteNonQuery(query);
}   
    public static int Xoa_ChiTietPhieuThanhLy(String ChiTietPhieuThanhLy){
     String query = "delete from ChiTietPhieuThanhLy  where MaChiTietPhieuThanhLy = "+ ChiTietPhieuThanhLy;
     return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static int Sua_ChiTietPhieuThanhLy(DTO_ChiTietPhieuThanhLy item){
    String query = "update ChiTietPhieuThanhLy set MaPhieuThanhLy ="+item.getMaPhieuThanhLy()+""
            + ",MaSach="+item.getMaSach()+", GiaThanhLy="+item.getGiaThanhLy()+""
            + ", SoLuong='"+item.getSoLuong()+"',ThanhTien="+item.getThanhTien()+""
            + ",GhiChu=N'"+item.getGhiChu()+"' "
            + "where MaChiTietPhieuThanhLy =" +item.getMaChiTietPhieuThanhLy();
    return DuAn1.conn.ExcuteNonQuery(query);
    }
}
