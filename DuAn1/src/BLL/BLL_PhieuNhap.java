/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import BLL.ChuyenDoi_ThongBao;
import DTO.DTO_ChiTietPhieuNhap;
import DAL.DAL_ChiTietPhieuNhap;
import DTO.DTO_PhieuNhap;
import DAL.DAL_PhieuNhap;
import DAL.DAL_Sach;
import BLL.*;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Yuuki
 */
public class BLL_PhieuNhap {
    
     
    
     public static void ThongTinSach(DefaultTableModel tableModel, String seach) {
        Object[] item = new Object[4]; //Tạo 1 mảng Object có 4 phần tử
        tableModel.setRowCount(0);  //Set lại số dòng của bảng về 0
        try {
            //Lấy dữ liệu LoaiSanPham bằng hàm getAll() bên DAL
            ResultSet rs = DAL_Sach.Seach_Sach_Phieu(seach);
            while (rs.next()) {
                
                item[0] = rs.getString("MaSach");
                item[1] = rs.getString("TenSach");
                item[2] = rs.getString("SoLuongSach");
                item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaNhap")); 
                
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn: " + ex.getMessage());
        }
    }
     
      public static void FillDataToCBB_NhanVien(JComboBox cbb) {
        
        ResultSet rs = DAL.DAL_NhanVien.GetAllCombobox_TenNV();
        BLL_Combobox.FillDataToCombobox( cbb,rs);
        
      }
      
      
      public static void FillDataToCBB_NCC(JComboBox cbb){
        //Lấy danh sách Tên và Mã NCC từ tầng DAL_NCC
        ResultSet rs = DAL.DAL_NhaCungCap.GetAllCombobox();
        BLL_Combobox.FillDataToCombobox(cbb, rs);
    }
      
         public static void RemoveRowInTable(JTable tblTam, int viTriDong) {
        DefaultTableModel tableModel = (DefaultTableModel) tblTam.getModel();

        tableModel.removeRow(viTriDong);
    }
      
      
      public static int CheckTonTai(DefaultTableModel tableCTHD,String maSP) {
        for (int i = 0; i < tableCTHD.getRowCount(); i++) {
            String maSP_CTDH = tableCTHD.getValueAt(i, 2).toString();
            if (maSP_CTDH.equals(maSP)) {
                return 1;
            }
        }
        return -1;
    }
      public static String TinhTongTien(JTable tblCTHD, int chiSoCotThanhTien) {
        double tongTien = 0;

        for (int i = 0; i < tblCTHD.getRowCount(); i++) {
                        
            tongTien += Double.parseDouble( ChuyenDoi_ThongBao.TienTeVeString(
                    tblCTHD.getValueAt(i, chiSoCotThanhTien).toString()));
            
        }
        String  a = ChuyenDoi_ThongBao.TienVietNam(tongTien);
        return a;
    }
      
      public static String TaoSoHoaDon() {
        Date CurrentDate = new Date();

        String dateCode = new SimpleDateFormat("ddMMyyhhmmss").format(CurrentDate);
        String SoHoaDon = "PN"+ dateCode;
        return SoHoaDon;
    }

    public static String TaoNgayLapHoaDon() {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String s = df.format(date);
        return s;
    }
    
     public static int LayMaHDTuSoHD(String SoHD) {
        int mahoadon = 0;
        ResultSet rs = DAL_PhieuNhap.LayMaPhieuNhapTuSoPhieuNhap(SoHD);
        try {
            while (rs.next()) {
                mahoadon = rs.getInt("MaPhieuNhap");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return mahoadon;
    }
      
      public static void  DuLieuDatabase_CTHD( DefaultTableModel table,String MaSach,String GiaNhap,int SoLuong, String GhiChu){
        int check = CheckTonTai(table, MaSach);
        if (check == 1) {
            for(int i = 0; i < table.getRowCount(); i++){
                String maTrongList = table.getValueAt(i, 2).toString();
                if(maTrongList.equals(MaSach)){
                    //Lấy số lượng cũ ở trong table
                    int soLuongTrongList = Integer.parseInt(table.getValueAt(i, 4).toString());

                    //Lấy giá bán trong Table
                    double GiaBan = Double.parseDouble(ChuyenDoi_ThongBao.TienTeVeString(table.getValueAt(i, 3).toString()));

                    table.setValueAt( (soLuongTrongList + SoLuong), i, 4);
                    table.setValueAt( String.format( ChuyenDoi_ThongBao.TienVietNam((soLuongTrongList + SoLuong) 
                         * GiaBan )) , i, 5);
                }
            }
        }else{

               
            ResultSet rs = DAL_ChiTietPhieuNhap.getAllChiTietPhieuNhap(MaSach);
            
            Object[] item = new Object[9]; // tạo mảng 
            
            try {
            while(rs.next()){
                    
                     item[0] = table.getRowCount()+1;               
                     item[1] = rs.getString("TenSach");
                     item[2] = rs.getString("MaSach"); 
                     item[3] = ChuyenDoi_ThongBao.TienVietNam(Double.parseDouble(GiaNhap));
                     item[4] = SoLuong;
                     double  gia = Double.parseDouble(GiaNhap),
                             ThanhTien = SoLuong *gia;                
                     item[5] = ChuyenDoi_ThongBao.TienVietNam(ThanhTien);                    
                     item[6] = GhiChu;
                     
                     table.addRow(item);

                }
                } catch (SQLException ex) {
                    System.out.println("lỗi truy vấn: " + ex.getMessage());
                }
    }
  }
      
}
