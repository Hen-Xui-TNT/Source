/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import DAL.*;
import GUI.*;
//import BLL.*;
import DTO.DTO_TheLoai;
import GUI.DuAn1;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class DAL_TheLoai {
     public static ResultSet GetAll() {
        String query = "Select * from TheLoai";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
   public static ResultSet GetAllCombobox() {
        String query = "select TenTheLoai, MaTheLoai from TheLoai";
        return DuAn1.conn.ExcuteQuerySelect(query);
}  
    public static int Them_TheLoai(DTO_TheLoai item){
    String query = "insert into TheLoai values ( N'" +item.getTenTheLoai()+"', N'" + item.getGhiChu()+ "')";
    return DuAn1.conn.ExcuteNonQuery(query);
}
 public static int Xoa_TheLoai(String MaTheLoai){
     String query = "delete from TheLoai where MaTheLoai = "+ MaTheLoai;
     return DuAn1.conn.ExcuteNonQuery(query);
    }
    
    public static int Sua_TheLoai(DTO_TheLoai item){
    String query = "update TheLoai set TenTheLoai = N'" +item.getTenTheLoai()+"',"
            + " GhiChu = N'"+item.getGhiChu()+"' where MaTheLoai = "+ item.getMaTheLoai();
    return DuAn1.conn.ExcuteNonQuery(query);
    }
    public static ResultSet Seach_TheLoai(String seach) {
        String seach1 = "select * from TheLoai where   TenTheLoai like  N'%" + seach + "%'"
                + " or MaTheLoai like '%" + seach + "%'";
        return DuAn1.conn.ExcuteQuerySelect(seach1);
     }
}
