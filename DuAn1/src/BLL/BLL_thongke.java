/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_PhieuPhat;
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
public class BLL_thongke {
    public static void DL_Chi(String TenNV,String TuNgay,String DenNgay,JTable table) {
        ResultSet rs = DAL.DAL_PhieuNhap.DLCHI_TL(TuNgay, DenNgay, TenNV);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Nhân Viên","Ngày Lập HD", "Tổng HD"
            }
        ));
        DefaultTableModel Table = (DefaultTableModel)table.getModel();        
        Object[] item = new Object[14]; // tạo mảng
        System.out.println(rs);
        try {
            while(rs.next()){
                item[0] = Table.getRowCount() + 1;
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getString("NgayNhap");
                item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("TongTien"));   
              
                //them
                Table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void DL_Thu(String TenNV,String TuNgay,String DenNgay,JTable table) {
        ResultSet rs1 = DAL_PhieuPhat.DLTTHU_TL(TuNgay, DenNgay, TenNV);
        ResultSet rs2= DAL.DAL_PhieuThue.DLTTHU_TL(TuNgay, DenNgay, TenNV);
        ResultSet rs3 = DAL.DAL_PhieuThanhLy.DLTTHU_TL(TuNgay, DenNgay, TenNV);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Nhân Viên","Ngày Lập HD", "Tổng HD"
            }
        ));
        DefaultTableModel Table = (DefaultTableModel)table.getModel();        
        Object[] item1 = new Object[14]; // tạo mảng
        try {
            while(rs1.next()){
                item1[0] = Table.getRowCount() + 1;
                item1[1] = rs1.getString("TenNhanVien");
                item1[2] = rs1.getString("NgayPhat");
                item1[3] = ChuyenDoi_ThongBao.TienVietNam(rs1.getDouble("TongTien"));   
              
                //them
                Table.addRow(item1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[] item2 = new Object[14]; // tạo mảng
        try {
            while(rs2.next()){
                item2[0] = Table.getRowCount() + 1;
                item2[1] = rs2.getString("TenNhanVien");
                item2[2] = rs2.getString("NgayThue");
                item2[3] = ChuyenDoi_ThongBao.TienVietNam(rs2.getDouble("TongTien"));   
              
                //them
                Table.addRow(item2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[] item3 = new Object[14]; // tạo mảng
        try {
            while(rs3.next()){
                item2[0] = Table.getRowCount() + 1;
                item3[1] = rs3.getString("TenNhanVien");
                item3[2] = rs3.getString("NgayThanhLy");
                item3[3] = ChuyenDoi_ThongBao.TienVietNam(rs3.getDouble("TongTien"));   
              
                //them
                Table.addRow(item3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void DL_Thu_Chi(String TenNV,String TuNgay,String DenNgay,JTable table) {
        ResultSet rs = DAL.DAL_PhieuNhap.DLCHI_TL(TuNgay, DenNgay, TenNV);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "STT","Nhân Viên","Ngày Lập HD","Loại HD", "Tổng HD"
            }
        ));
        DefaultTableModel Table = (DefaultTableModel)table.getModel();        
        Object[] item = new Object[14]; // tạo mảng
        System.out.println(rs);
        try {
            while(rs.next()){
                item[0] = Table.getRowCount() + 1;
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getString("NgayNhap");
                item[3] = "Chi";
                item[4] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("TongTien"));   
              
                //them
                Table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs1 = DAL_PhieuPhat.DLTTHU_TL(TuNgay, DenNgay, TenNV);
        ResultSet rs2= DAL.DAL_PhieuThue.DLTTHU_TL(TuNgay, DenNgay, TenNV);
        ResultSet rs3 = DAL.DAL_PhieuThanhLy.DLTTHU_TL(TuNgay, DenNgay, TenNV);
        Object[] item1 = new Object[14]; // tạo mảng
        try {
            while(rs1.next()){
                item1[0] = Table.getRowCount() + 1;
                item1[1] = rs1.getString("TenNhanVien");
                item1[2] = rs1.getString("NgayPhat");
                item1[3] = "Thu";
                item1[4] = ChuyenDoi_ThongBao.TienVietNam(rs1.getDouble("TongTien"));   
              
                //them
                Table.addRow(item1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[] item2 = new Object[14]; // tạo mảng
        try {
            while(rs2.next()){
                item2[0] = Table.getRowCount() + 1;
                item2[1] = rs2.getString("TenNhanVien");
                item2[2] = rs2.getString("NgayThue");
                item2[3] = "Thu";
                item2[4] = ChuyenDoi_ThongBao.TienVietNam(rs2.getDouble("TongTien"));   
              
                //them
                Table.addRow(item2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[] item3 = new Object[14]; // tạo mảng
        try {
            while(rs3.next()){
                item2[0] = Table.getRowCount() + 1;
                item3[1] = rs3.getString("TenNhanVien");
                item3[2] = rs3.getString("NgayThanhLy");
                item3[3] = "Thu";
                item3[4] = ChuyenDoi_ThongBao.TienVietNam(rs3.getDouble("TongTien"));   
              
                //them
                Table.addRow(item3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
