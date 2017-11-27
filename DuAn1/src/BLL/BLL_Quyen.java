/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_Quyen;
import DAL.DAL_Quyen;
import GUI.pnl_Quyen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Huy Nhan
 */
public class BLL_Quyen {
    public static boolean check(String Ten,String MoTa) {
        if (Ten.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Quyền !!!", "Lỗi Quyền");
            return false;
        }
        return true;
    }
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[4];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaQuyen");
                item[2] = rs.getString("TenQuyen");
                item[3] = rs.getString("GhiChu");
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(String Ten,String MoTa,String Ma) {
        boolean kiemtra = check(Ten, MoTa);
        if (kiemtra == true) {
            DTO_Quyen Q = new DTO_Quyen(Ten, MoTa, Ma);
            System.out.println("thanh cong");
            DAL_Quyen.Them_Quyen(Q);
        }
    }
    public static void sua(String ID,String Ten,String MoTa,String Ma) {
        boolean kiemtra = check(Ten, MoTa);
        if (ID.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã Quyền !!!", "Lỗi Dữ Liệu");
        }else{
            try {
                Integer.parseInt(ID);
                if (kiemtra == true) {
                    DTO_Quyen Q = new DTO_Quyen(Integer.parseInt(ID), Ten, MoTa, Ma);
                    System.out.println("thanh cong");
                    DAL_Quyen.Sua_Quyen(Q);
                }
            } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
            }
        }
        
    }
    public static void xoa(String ID) {
        if (ID.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mã Quyền !!!", "Lỗi Dữ Liệu");
        }else{
            try {
            DAL_Quyen.Xoa_Quyen(Integer.parseInt(ID));
            System.out.println("thanh cong");
        } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
            }
        }
    }
    public static void DoDL(ResultSet rs) {
        try {
            while(rs.next()){
                String Checkbox = rs.getString("Ma");
                if (Checkbox.substring(8,9).equals("0")) {
                    pnl_Quyen.ckb_khuyenmai.setSelected(true);
                }
                if (Checkbox.substring(1, 2).equals("0")) {
                    pnl_Quyen.ckb_nhacungcap.setSelected(true);
                }
                if (Checkbox.substring(2, 3).equals("0")) {
                    pnl_Quyen.ckb_nhanvien.setSelected(true);
                }
                if (Checkbox.substring(3,4).equals("0")) {
                    pnl_Quyen.ckb_nhapkho.setSelected(true);
                }
                if (Checkbox.substring(4, 5).equals("0")) {
                    pnl_Quyen.ckb_quyen.setSelected(true);
                }
                if (Checkbox.substring(5, 6).equals("0")) {
                    pnl_Quyen.ckb_sach.setSelected(true);
                }
                if (Checkbox.substring(6, 7).equals("0")) {
                    pnl_Quyen.ckb_tacgia.setSelected(true);
                }
                if (Checkbox.substring(7, 8).equals("0")) {
                    pnl_Quyen.ckb_thanhly.setSelected(true);
                }
                if (Checkbox.substring(0, 1).equals("0")) {
                    pnl_Quyen.ckb_theloai.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
