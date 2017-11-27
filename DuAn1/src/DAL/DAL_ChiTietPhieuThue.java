/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_ChiTietPhieuThue ;
import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_ChiTietPhieuThue {
        public static ResultSet GetAll() {
        String query = "Select * from ChiTietPhieuThue";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
        public static int Them_ChiTietPhieuThue (DTO_ChiTietPhieuThue  item) {
        String query = "set dateformat dmy insert into ChiTietPhieuThue values("+item.getMaPhieuThue()+","+item.getMaSach()+""
                + ","+item.getGiaThue()+","+item.getSoLuong()+","+item.getThanhTien()+",N'"+item.getGhiChu()+"')";
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Xoa_ChiTietPhieuThue (String ChiTietPhieuThue ) {
        String query = "delete from ChiTietPhieuThue  where MaChiTietPhieuThue  = " + ChiTietPhieuThue ;
        return DuAn1.conn.ExcuteNonQuery(query);
    }

    public static int Sua_ChiTietPhieuThue (DTO_ChiTietPhieuThue   item) {
        String query = "set dateformat dmy update ChiTietPhieuThue set MaPhieuThue =" + item.getMaPhieuThue()+ ""
                + ",MaSach=" + item.getMaSach() + ", GiaThue=" + item.getGiaThue()+ ""
                + ", SoLuong='" + item.getSoLuong() + "',ThanhTien=" + item.getThanhTien() + ""
                + ",GhiChu=N'" + item.getGhiChu() + "' "
                + "where MaChiTietPhieuThue  =" + item.getMaChiTietPhieuThue ();
        return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static ResultSet Seach_ChiTietPhieuThue(String seach) {
        String seach1 = "select * from ChiTietPhieuThue where   MaPhieuThue like  '%" + seach + "%'"
                + " or MaSach like '%" + seach + "%' or SoLuong like '%" + seach + "%' "
                + " or GiaThue like '%" + seach + "%' or ThanhTien like '%" + seach + "%'  "
                + "or MaChiTietPhieuThue like '%" + seach + "%' ";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
    }
    public static ResultSet getAllChiTietPhieuThue(String MaSP){
          
        String query = "Select * from Sach where MaSach = '"+ MaSP+"'";
        
         return GUI.DuAn1.conn.ExcuteQuerySelect(query);
        }
}
