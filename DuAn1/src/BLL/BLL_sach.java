/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_Sach;
import DTO.DTO_Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyNhan
 */
public class BLL_sach {

    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[20];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaSach");
                item[2] = rs.getString("TenSach");
                item[3] = rs.getString("SoLuongSach");
                item[4] = rs.getString("TinhTrangSach");
                item[5] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaSach"));
                item[6] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaNhap"));
                item[7] = rs.getString("NhaXuatBan");
                item[8] = rs.getString("MoTa");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static boolean check(String Ten,String SoLuong,String tinhtrang,
             String GiaSach,String GiaNhap,String nhaxuatban,String MoTa) {
        if (Ten.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Sách !!!", "Lỗi Dữ liệu");
            return false;
        }else if (SoLuong.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Số Lượng !!!", "Lỗi Dữ liệu");
            return false;
        }else if (tinhtrang.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tình Trạng !!!", "Lỗi Dữ liệu");
            return false;
        }else if (GiaSach.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Giá Sách !!!", "Lỗi Dữ liệu");
            return false;
        }else if (GiaNhap.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Giá Nhập !!!", "Lỗi Dữ liệu");
            return false;
        }else if (nhaxuatban.equals("")) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Tên Nhà Xuất Bản !!!", "Lỗi Dữ liệu");
            return false;
//        }else if (MoTa.equals("")) {
//            ChuyenDoi_ThongBao.ThongBao_Loi("Chưa Nhập Mô Tả !!!", "Lỗi Dữ liệu");
//            return false;
        }else if (MoTa.length() > 249) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng ký tự bạn nhập quá 250 !!!", "Lỗi Dữ liệu");
            return false;
        }else if (Ten.length() > 249) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng ký tự bạn nhập quá 250 !!!", "Lỗi Dữ liệu");
            return false;
        }else if (nhaxuatban.length() > 249) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng ký tự bạn nhập quá 250 !!!", "Lỗi Dữ liệu");
            return false;
        }else if (tinhtrang.length() > 249) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng ký tự bạn nhập quá 250 !!!", "Lỗi Dữ liệu");
            return false;
        }else {
            try {
                Integer.parseInt(SoLuong);
            } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("Số lượng phải là số.Yêu cầu nhập lại. Lỗi : " +e.getMessage(), "Lỗi Dữ liệu");
                return false;
            }
            try {
                   Double.parseDouble(GiaNhap); 
            }catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("Giá phải là số.Yêu cầu nhập lại. Lỗi :" +e.getMessage(), "Lỗi Dữ liệu");
                return false;
            }   
            try {
                Double.parseDouble(GiaSach);
            } catch (NumberFormatException e) {
                ChuyenDoi_ThongBao.ThongBao_Loi("Giá phải là số.Yêu cầu nhập lại. Lỗi : " +e.getMessage(), "Lỗi Dữ liệu");
                return false;
            }
            return true;
        }
    }
    public static void sua(String ID,String Ten,String SoLuong,String tinhtrang,String GiaSach,String GiaNhap,String nhaxuatban,String MoTa) {
        String gianhap = ChuyenDoi_ThongBao.TienTeVeString(GiaNhap);
        String giasach = ChuyenDoi_ThongBao.TienTeVeString(GiaSach);
        boolean kiemtra = check(Ten, SoLuong, tinhtrang, giasach, gianhap, nhaxuatban, MoTa);
        try {
            Integer.parseInt(ID);
            if (kiemtra == true) {
                DTO_Sach item = new DTO_Sach(Integer.parseInt(ID), Integer.parseInt(SoLuong), Double.parseDouble(giasach)
                        , Double.parseDouble(gianhap), Ten, tinhtrang, nhaxuatban, MoTa);
                System.out.println("thanh cong");
                DAL_Sach.Sua_Sach(item);
            }
        } catch (NumberFormatException e) {
            ChuyenDoi_ThongBao.ThongBao_Loi("ID Phải Là Số !!!" + e.getMessage(), "Lỗi Chuyển Đổi Dữ Liệu");
        }
        
        
    }
    public static void them(String Ten,String SoLuong,String tinhtrang,String GiaSach,String GiaNhap,String nhaxuatban,String MoTa) {

        boolean kiemtra = check(Ten, SoLuong, tinhtrang, GiaSach, GiaNhap, nhaxuatban, MoTa);
        if (kiemtra == true) {
            DTO_Sach item = new DTO_Sach(Integer.parseInt(SoLuong), Double.parseDouble(GiaSach)
                    , Double.parseDouble(GiaNhap), Ten, tinhtrang, nhaxuatban, MoTa);
            System.out.println("thanh cong");
            DAL_Sach.Them_Sach(item);
        }
          
    }
    public static int LayIPSach() {
        ResultSet rs = DAL.DAL_Sach.Get_IP();
        System.out.println(rs);
        int IP = 0;
        try {
            while(rs.next()){
                IP = rs.getInt("MaSach");
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi Truy Vấn : " +ex.getMessage());
        }
        return  IP;
    }
}
