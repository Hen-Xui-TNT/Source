/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_KhuyenMai;
import static GUI.pnl_khuyenmai.tbl_km;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import BLL.ChuyenDoi_ThongBao.*;
import java.text.ParseException;
import javax.swing.table.DefaultTableColumnModel;
/**
 *
 * @author Yuuki
 */
public class BLL_KhuyenMai {
   
    public static DTO.DTO_KhuyenMai DLCBB(ResultSet rs) {
        DTO_KhuyenMai KM = new DTO_KhuyenMai();
        try {
            while(rs.next()){
                KM.setMaKhuyenMai(rs.getInt("MaKhuyenMai"));
                KM.setKhuyenMai(rs.getString("KhuyenMai"));
                KM.setNgayBatDau(rs.getString("NgayBatDau"));
                KM.setNgayKetThuc(rs.getString("NgayKetThuc"));
                KM.setGiaSach(rs.getDouble("GiaSach"));
                KM.setMaSach(rs.getInt("MaSach"));
                KM.setSoLuong(rs.getInt("SoLuong"));
                KM.setSoTienHoaDon(rs.getDouble("SoTienHoaDon"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi Truy Vấn : " + e.getMessage());
        }
        return KM;
    }
    public static void SettableKMTienHD(JTable table,ResultSet rs) {
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Mã Khuyến Mãi","Tên khuyến Mãi", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Số Tiền Hóa Đơn","Giảm Giá"
            }
        ));
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaKhuyenMai");
                item[2] = rs.getString("KhuyenMai");
                item[3] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                item[4] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                item[5] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("SoTienHoaDon"));
                String giamgia = String.valueOf(rs.getDouble("GiaSach")*100) + "%";
                item[6] = giamgia;
                tb.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void insertKMKMTienHD(String batdau, String ketthuc,String Gia,String KM,String TT) throws ParseException{
        
        DTO_KhuyenMai data = new DTO_KhuyenMai(batdau, ketthuc, Double.parseDouble(TT), Double.parseDouble(Gia) * 0.01, KM);
        DAL.DAL_KhuyenMai.SetKMTienHD(data);
        
    }
    public static void SettableKMSLSach(JTable table,ResultSet rs) {
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Mã Khuyến Mãi","Tên khuyến Mãi", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Số Lượng","Giảm Giá"
            }
        ));
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaKhuyenMai");
                item[2] = rs.getString("KhuyenMai");
                item[3] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                item[4] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                item[5] = rs.getInt("SoLuong");
                String giamgia = String.valueOf(rs.getDouble("GiaSach")*100) + "%";
                item[6] = giamgia;
                tb.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void insertKMKMSLSach(String batdau, String ketthuc,String Gia,String KM,String TT) throws ParseException{
        
        DTO_KhuyenMai data = new DTO_KhuyenMai(batdau, ketthuc, Double.parseDouble(TT), Double.parseDouble(Gia)*0.01, KM);
        DAL.DAL_KhuyenMai.SetKMSLSach(data);
        
    }
    public static void SettableKMDongGia(JTable table,ResultSet rs) {
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Mã Khuyến Mãi","Tên khuyến Mãi", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Mã Sách","Giá Sách"
            }
        ));
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaKhuyenMai");
                item[2] = rs.getString("KhuyenMai");
                item[3] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                item[4] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                item[5] = rs.getDouble("MaSach");
                item[6] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaSach"));
                tb.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void insertKMDongGia(String batdau, String ketthuc,String Gia,String KM,int MaSach) throws ParseException{
        
        DTO_KhuyenMai data = new DTO_KhuyenMai(batdau, ketthuc, MaSach, Double.parseDouble(Gia), KM);
        DAL.DAL_KhuyenMai.SetKMDongGia(data);
        
    }
    
     public static void SettableKMVoucher(JTable table,ResultSet rs) {
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Mã Khuyến Mãi","Tên khuyến Mãi", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Mã Voucher","Giảm Giá"
            }
        ));
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaKhuyenMai");
                item[2] = rs.getString("KhuyenMai");
                item[3] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                item[4] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                item[5] = rs.getString("Voucher");
                String giamgia = String.valueOf(rs.getDouble("GiaSach")*100) + "%";
                item[6] = giamgia;
                tb.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public static void insertKMVoucher(String batdau, String ketthuc,String Gia,String KM,String TT) throws ParseException{
        
        DTO_KhuyenMai data = new DTO_KhuyenMai(batdau, ketthuc, Double.parseDouble(Gia)*0.01, KM, TT);
        DAL.DAL_KhuyenMai.SetKMVoucher(data);
        
    }
      public static void SettableKMCuon(JTable table,ResultSet rs) {
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Mã Khuyến Mãi","Tên khuyến Mãi", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Mã Sách","Giảm Giá"
            }
        ));
        DefaultTableModel tb = (DefaultTableModel)table.getModel();
        Object[] item = new Object[20];
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaKhuyenMai");
                item[2] = rs.getString("KhuyenMai");
                item[3] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                item[4] = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                item[5] = rs.getDouble("MaSach");
                String giamgia = String.valueOf(rs.getDouble("GiaSach")*100) + "%";
                item[6] = giamgia;
                tb.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public static void insertKMCuon(String batdau, String ketthuc,String Gia,String KM,int MaSach) throws ParseException{
        
        DTO_KhuyenMai data = new DTO_KhuyenMai(batdau, ketthuc, MaSach, Double.parseDouble(Gia) * 0.01, KM);
        DAL.DAL_KhuyenMai.SetKMCuon(data);
        
    }
      public static void ThongTinSach(DefaultTableModel tableModel, ResultSet rs) 
        {
        Object[] item = new Object[4]; //Tạo 1 mảng Object có 4 phần tử
        tableModel.setRowCount(0);  //Set lại số dòng của bảng về 0
        try {
            //Lấy dữ liệu LoaiSanPham bằng hàm getAll() bên DAL
            while (rs.next()) {
                
                item[0] = rs.getString("MaSach");
                item[1] = rs.getString("TenSach"); 
              
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn: " + ex.getMessage());
        }
    }
      public static boolean checksach(String MaSach,DefaultTableModel table) {
        
            for (int i = 0; i < table.getRowCount(); i++) {
                String MaS_CTHD = table.getValueAt(i, 0).toString();
                if (MaSach.equals(MaS_CTHD)) {
                    System.out.println("Đã có");
                    return true;//nếu sách đã có trong chi tiết Chi Tiết
                    
                }
            }
            return false;
    }
   public static void ThemVaoCTHD(JTable tableCTHD,String MaS, String TenSach){
        Object[] item = new Object[10];//Tạo mảng
        DefaultTableModel table = (DefaultTableModel)tableCTHD.getModel();
        item[0] = MaS;
        item[1] = TenSach;
        table.addRow(item);
        
    }
   public static void XoaVaoCTHD(JTable tableCTHD,int vitri){
        Object[] item = new Object[10];//Tạo mảng
        DefaultTableModel table = (DefaultTableModel)tableCTHD.getModel();
        table.removeRow(vitri);
        
    }
    
      
}
