/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_MyCombobox;
import DTO.MyCombobox;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Huy Nhan
 */
public class BLL_Combobox {
    public static void LayDuLieuCombobox(ResultSet rs, JComboBox TenCBB, String TenCotHienThi, String TenCotMa) {
        DefaultComboBoxModel Combobox = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                DTO.DTO_MyCombobox item = new DTO_MyCombobox(rs.getString(TenCotHienThi), rs.getString(TenCotMa));
                Combobox.addElement(item);
                TenCBB.setModel(Combobox);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
   public static void setSelectedCombobox(JComboBox cbb, String tenloai) {
        //Vòng lặp lấy tất cả item trong combobox
        for (int i = 0; i < cbb.getItemCount(); i++) {
            //Lấy từng giá Element trong combobox và gán vào 1 biến Object
            Object obj = cbb.getItemAt(i);
            //Nếu obj khác null
            if (obj != null) {
                //Ép kiểu obj về kiểu DisplayValueModel nhưng mình đã định nghĩa
                MyCombobox m = (MyCombobox) obj;
                //Nếu nội dung bằng với text của obj thì chọn lại combobox
                if (m.Value.equals(tenloai)) {
                    cbb.setSelectedItem(m);   //chọn lại combobox theo Element
                }
            }
        }
    }
    
    public static String getSelectedItemID(JComboBox cbb) {
        String result;
        Object[] obj = cbb.getSelectedObjects();
        DTO_MyCombobox item = (DTO_MyCombobox) obj[0];
        result = item.Value.toString();
        return result;
    }
    
     public static void FillDataToCombobox(JComboBox cbb,ResultSet rs){
        try {
            DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
            while(rs.next()){
                MyCombobox item = new MyCombobox(
                        rs.getString(1),  //Giá trị hiển thị (Text)
                        rs.getString(2)); //Giá trị thao tác với CSDL (value - thường là mã) 
                cbbModel.addElement(item);
            }
            cbb.setModel(cbbModel);
        } catch (SQLException ex) {
            System.out.println("Lỗi xảy ra: " + ex.getMessage());
        }
    }
}
