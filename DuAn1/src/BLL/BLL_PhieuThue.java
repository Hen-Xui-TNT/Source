/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_ChiTietPhieuNhap;
import DAL.DAL_ChiTietPhieuThue;
import DAL.DAL_PhieuNhap;
import DAL.DAL_PhieuThue;
import DAL.DAL_Sach;
import DAL.DateFormatString;
import DTO.DTO_DocGia;
//import DAL.DateFormatString;
import DTO.DTO_PhieuThue;
import GUI.DuAn1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BLL_PhieuThue {
    public static void DuLieuDatabase_Table(JTable Ten_table,ResultSet rs) {
        
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();        
        Object[] item = new Object[9]; // tạo mảng
        table.setRowCount(0); // set lại số dòng của bảng về 0
        
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaPhieuThue");
                item[2] = rs.getString("SoPhieuThue");
                item[3] = rs.getString("MaDocGia");
                item[4] = rs.getString("MaNhanVien"); 
                item[5] = rs.getString("NgayThue");             
                item[6] = rs.getString("NgayTra");   
                item[7] = rs.getString("TongTien");             
                item[8] = rs.getString("GhiChu");   
               
                //them
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_PhieuThue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

       public static boolean Check(String SoPhieuThue,String MaDocGia,String MaNhanVien,String NgayThue,
                                    String NgayTra, String TongTien){
       
   
   if(SoPhieuThue.trim().equals("")){
             ChuyenDoi_ThongBao.ThongBao_Loi(" Số phiếu thuê không được để trống","Thông Báo Lỗi");            
        }
    
   if (SoPhieuThue.trim().length() > 50){
            ChuyenDoi_ThongBao.ThongBao_Loi(" Số phiếu thuê không quá 50 ký tự","Thông Báo Lỗi");                  
            return false;
             }  
   
   
     if(MaDocGia.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Mã độc giả không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                 Integer.parseInt(MaDocGia);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi( "Mã độc giả phải là số","Thông Báo Lỗi");
              return false;
             }
          }   
     if(MaNhanVien.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Mã nhân viên không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                 Integer.parseInt(MaNhanVien);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi( "Mã nhân viên phải là số","Thông Báo Lỗi");
              return false;
             }
          } 
     if(NgayThue.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Ngày thuê không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                   DateFormatString.getDate(NgayThue);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Ngày thuê phải là kiểu date","Thông Báo Lỗi");
              return false;
             }
          }
      if(NgayTra.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Ngày trả không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                   DateFormatString.getDate(NgayTra);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi("Ngày trả phải là kiểu date","Thông Báo Lỗi");
              return false;
             }
          }
     if(TongTien.trim().equals("")){
            ChuyenDoi_ThongBao.ThongBao_Loi("Tổng tiền không được để trống","Thông Báo Lỗi");                  
        }else{
              try{
                  Double.parseDouble(TongTien);
              }
             catch(Exception e){
                     ChuyenDoi_ThongBao.ThongBao_Loi( "Tổng tiền phải là số","Thông Báo Lỗi");
              return false;
             }
          }     
         
        
        
        return true;
    }
           

      
      public static int Them(String SoPhieuThue,String MaDocGia,String MaNhanVien,String NgayThue,
                                    String NgayTra, String TongTien,String GhiChu) {
         
            if (Check( SoPhieuThue,MaDocGia, MaNhanVien, NgayThue,NgayTra,TongTien)){ 
    
            DTO_PhieuThue item = new DTO_PhieuThue(SoPhieuThue, Integer.parseInt(MaDocGia), 
                    Integer.parseInt(MaNhanVien),NgayThue, NgayTra,
                    Double.parseDouble(TongTien),GhiChu);
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_PhieuThue.Them_PhieuThue(item);  
        }
      return -1;
    }            
       public static int Sua(String MaPhieuThue,String SoPhieuThue,String MaDocGia,String MaNhanVien,String NgayThue,
                                    String NgayTra, String TongTien,String GhiChu) {
           
            if(MaPhieuThue.trim().equals("")){
              ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Chưa có Mã phiếu thuê");
              return -1;
         }
        else{
             try{
                 Integer.parseInt(MaPhieuThue);
              }
             catch(Exception e){
                  ChuyenDoi_ThongBao.ThongBao_Loi("Thông Báo Lỗi", "Mã phiếu thuê phải là số");
              return -1;
             }
         }   
         
            if (Check(SoPhieuThue,MaDocGia, MaNhanVien, NgayThue,NgayTra,TongTien)){ 
    
            DTO_PhieuThue item = new DTO_PhieuThue(Integer.parseInt(MaPhieuThue),SoPhieuThue, Integer.parseInt(MaDocGia), 
                    Integer.parseInt(MaNhanVien),NgayThue, NgayTra,
                    Double.parseDouble(TongTien),GhiChu);
            System.out.println("Thêm thành công");
           ChuyenDoi_ThongBao.ThongBao_ThanhCong("Đã thêm thành công !","Thông Báo Thành công");
           
          return DAL_PhieuThue.Sua_PhieuThue(item);  
        }
      return -1;
    }  
       public static int Xoa (ArrayList<String> mangMaLoai){
         int rs =-1;
          for( int i = 0; i <mangMaLoai.size(); i++){
           String maLoai = mangMaLoai.get(i);
                   
           if(0 == mangMaLoai.size()){               
             ChuyenDoi_ThongBao.ThongBao_Loi("Chưa có mã có mã phiếu thuê","Thông Báo Lỗi");
              return rs;
              
           }else{
                try{
                     System.out.println("Xóa thành công");
                      DAL_PhieuThue.Xoa_PhieuThue(maLoai);
                }
                catch(Exception e){
                      ChuyenDoi_ThongBao.ThongBao_ThanhCong("Thông Báo Lỗi", "Xóa không thành công");
                 
                }
            }
        }
     
        return rs;    // Lựa chọn là No       
     }
       
        public static void ThongTinSach(DefaultTableModel tableModel, String seach) 
        {
        Object[] item = new Object[4]; //Tạo 1 mảng Object có 4 phần tử
        tableModel.setRowCount(0);  //Set lại số dòng của bảng về 0
        try {
            //Lấy dữ liệu LoaiSanPham bằng hàm getAll() bên DAL
            ResultSet rs = DAL_Sach.Seach_Sach(seach);
            while (rs.next()) {
                
                item[0] = rs.getString("MaSach");
                item[1] = rs.getString("TenSach");
                item[2] = rs.getString("SoLuongSach");
                item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaSach")); 
              
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn: " + ex.getMessage());
        }
    }
        
        
          public static void ThongTinPhieuThue(DefaultTableModel tableModel, String seach) 
        {
        Object[] item = new Object[9]; //Tạo 1 mảng Object có 9 phần tử
        tableModel.setRowCount(0);  //Set lại số dòng của bảng về 0
        try {
            //Lấy dữ liệu LoaiSanPham bằng hàm getAll() bên DAL
            ResultSet rs = DAL_PhieuThue.Seach_PhieuThue(seach);
            while (rs.next()) {
                item[0] = tableModel.getRowCount() + 1;
                item[1] = rs.getString("MaPhieuThue");
                item[2] = rs.getString("SoPhieuThue");
                item[3] = rs.getString("MaDocGia");
                item[4] = rs.getString("MaNhanVien"); 
                item[5] = rs.getString("NgayThue");             
                item[6] = rs.getString("NgayTra");   
                item[7] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("TongTien"));             
                item[8] = rs.getString("GhiChu");  
               
              
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
     
      public static void FillDataToCBB_DocGia(JComboBox cbb){
        //Lấy danh sách Tên và Mã NCC từ tầng DAL_NCC
        ResultSet rs = DAL.DAL_DocGia.GetAllCombobox();
        BLL_Combobox.FillDataToCombobox(cbb, rs);
    }
      //Xoas dòng trong table
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
        String SoHoaDon = "PT"+ dateCode;
        return SoHoaDon;
    }

    public static String TaoNgayLapHoaDon() {
        Date date = new Date();
        //DateFormat datefm = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dinhDang = sdf.format(date);
        //String xuatngay = datefm.format(date);
        return dinhDang;
    }
//    public static String NgayTraHoaDon() {
//        Date date = new Date();
//        DateFormat df = DateFormat.getDateInstance();
//        String s = df.format(date);
//        return s;
//    }
    
     public static int LayMaHDTuSoHD(String SoHD) {
        int mahoadon = 0;
        ResultSet rs = DAL_PhieuThue.LayMaPhieuThueTuSoPhieuThue(SoHD);
        try {
            while (rs.next()) {
                mahoadon = rs.getInt("MaPhieuThue");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return mahoadon;
    }
      
      public static void  DuLieuDatabase_CTHD( DefaultTableModel table,String MaSach,int SoLuong, String GhiChu){
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

               
            ResultSet rs = DAL_ChiTietPhieuThue.getAllChiTietPhieuThue(MaSach);
            
            Object[] item = new Object[7]; // tạo mảng 
            
            try {
            while(rs.next()){
                    
                     item[0] = table.getRowCount()+1;               
                     item[1] = rs.getString("TenSach");
                     item[2] = rs.getString("MaSach"); 
                        double GiaSach = rs.getDouble("GiaSach") * 0.2;
                        String GiaThue  = ChuyenDoi_ThongBao.TienVietNam(GiaSach);
                     item[3] = GiaThue;
                     item[4] = SoLuong;
                     double  gia = Double.parseDouble(ChuyenDoi_ThongBao.TienTeVeString(GiaThue)),
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
      public static DTO.DTO_DocGia DLCBB(ResultSet rs) {
        DTO_DocGia DG = new DTO_DocGia();
        try {
            while(rs.next()){
                DG.setMaDocGia(rs.getInt("MaDocGia"));
                DG.setTenDocGia(rs.getString("TenDocGia"));
                DG.setDiaChi(rs.getString("DiaChi"));
                DG.setSoDienThoai(rs.getString("SDT"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi Truy Vấn : " + e.getMessage());
        }
        return DG;
    }
}
