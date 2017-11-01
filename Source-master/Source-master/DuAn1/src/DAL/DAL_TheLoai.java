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
    public static int Them_Quyen(DTO_TheLoai item){
    String query = "insert into Quyen values ( N'" +item.getTenTheLoai()+"', N'" + item.getGhiChu()+ "')";
    return DuAn1.conn.ExcuteNonQuery(query);
}
 public static int Xoa_Quyen(String MaTheLoai){
     String query = "delete from Quyen where MaQuyen = "+ MaTheLoai;
     return DuAn1.conn.ExcuteNonQuery(query);
    }
    
    public static int Sua_Quyen(DTO_TheLoai item){
    String query = "update Quyen set TenQuyen = N'" +item.getTenTheLoai()+"',"
            + " MoTa = N'"+item.getGhiChu()+"' where MaQuyen = "+ item.getMaTheLoai();
    return DuAn1.conn.ExcuteNonQuery(query);
    }
}
