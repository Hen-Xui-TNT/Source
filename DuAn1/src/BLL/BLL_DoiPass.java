/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.frm_doimatkhau;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HuyNhan
 */
public class BLL_DoiPass {
    public static void Check(ResultSet rs,String user,String Pass,String newPass,String RePass) {
        
        if (Pass.equals("") || Pass.equals("") || RePass.equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Bạn không được để trống bất kì ô nào", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (!newPass.equals(RePass)) {
            JOptionPane.showMessageDialog(new JFrame(), "Mật khẩu mới không trùng nhau", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }  else try {
            if (rs.next()) {
                int kq = DAL.DAL_NhanVien.Doi_Pass(user, newPass);
                if(kq<0){
                    System.out.println("Lỗi thêm dữ liệu !!!");
                }else if (kq == 0){
                    System.out.println("Không có dòng nào được thêm");
                }else{
                    frm_doimatkhau.frm_DoiPass.dispose();
                    JOptionPane.showMessageDialog(new JFrame(), "Đổi Mật khẩu thành công", "Thông Báo", JOptionPane.NO_OPTION);
                }
            }else{
                JOptionPane.showMessageDialog(new JFrame(), "Tài khoản & Mật khẩu sai", "Thông báo", JOptionPane.WARNING_MESSAGE);
                
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn " + ex.getMessage());
        }
    }
}
