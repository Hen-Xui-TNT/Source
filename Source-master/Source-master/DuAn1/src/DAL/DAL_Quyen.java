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
import DTO.DTO_Quyen;
import GUI.DuAn1;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class DAL_Quyen {
     public static ResultSet GetAll() {
        String query = "Select * from Quyen";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
     public static ResultSet GetAllCombobox() {
        String query = "select TenQuyen, MaQuyen from Quyen";
        return DuAn1.conn.ExcuteQuerySelect(query);
}
      public static int Them_Quyen(DTO_Quyen item){
    String query = "insert into Quyen values ( N'" +item.getTenQuyen() +"', N'" + item.getGhiChu()+ "')";
    return DuAn1.conn.ExcuteNonQuery(query);
}
 public static int Xoa_Quyen(String MaQuyen){
     String query = "delete from Quyen where MaQuyen = "+ MaQuyen;
     return DuAn1.conn.ExcuteNonQuery(query);
    }
    
    public static int Sua_Quyen(DTO_Quyen item){
    String query = "update Quyen set TenQuyen = N'" +item.getTenQuyen() +"',"
            + " MoTa = N'"+item.getGhiChu()+"' where MaQuyen = "+ item.getMaQuyen();
    return DuAn1.conn.ExcuteNonQuery(query);
    }
}