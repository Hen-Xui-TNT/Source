/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_Sach;
import DAL.DAL_TacGia;
import DTO.DTO_DocGia;
import DTO.DTO_KhuyenMai;
import GUI.frm_thongtinsach;
import static GUI.frm_thongtinsach.txt_timkiemtacgia;
import GUI.pnl_KMHoaDon;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
/**
 *
 * @author HuyNhan
 */
public class BLL_phieuthanhly {
    public static int MaHD(String SoHD){
        ResultSet rs = DAL.DAL_PhieuThanhLy.LayMaPhieuThanhLyTuSoPhieuThanhLy(SoHD);
        try {
            while(rs.next()){
                int madh = rs.getShort("MaPhieuThanhLy");
                return madh; 
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_phieuthanhly.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
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
                item[2] = rs.getString("SoLuongSach");
                item[3] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaSach")); 
              
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi truy vấn: " + ex.getMessage());
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
    public static int CheckS(String MaSach,String MaKM,JTable table_CTHD) {
        DefaultTableModel table = (DefaultTableModel)table_CTHD.getModel();
        if (!MaKM.equals("")) {
            for (int i = 0; i < table.getRowCount(); i++) {
            String MaS_CTHD = table.getValueAt(i, 1).toString();
            String MaKM_CTHD =table.getValueAt(i, 7).toString();
            if (MaSach.equals(MaS_CTHD) || MaKM.equals(MaKM_CTHD)) {
                return 0;//nếu sách đã có trong chi tiết Chi Tiết
            }
            }
        }else{
            for (int i = 0; i < table.getRowCount(); i++) {
            String MaS_CTHD = table.getValueAt(i, 1).toString();
            String MaKM_CTHD =table.getValueAt(i, 7).toString();
            if (MaSach.equals(MaS_CTHD)) {
                return 0;//nếu sách đã có trong chi tiết Chi Tiết
            }
            }
        }
        
        return -1;//Sách chưa có trong Chi Tiet
    }
    public static void themVaoCTHD_SL(JTable tableCTDH,int sl,int ViTriCotSL,int ViTriCotTHanhTien,String MaSach) {
        DefaultTableModel table = (DefaultTableModel)tableCTDH.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            String TenSp = table.getValueAt(i, 1).toString();
            if (TenSp.equals(MaSach)) {
                //Sửa lại Sl
                int slcthd = Integer.parseInt(table.getValueAt(i, ViTriCotSL).toString());
                int tongsl = sl + slcthd;
                table.setValueAt(tongsl, i, ViTriCotSL);
                //Sửa lại thành tiền
                double thanhtien = tongsl * Double.parseDouble(ChuyenDoi_ThongBao.TienTeVeString(table.getValueAt(i, ViTriCotTHanhTien).toString()));
                table.setValueAt(ChuyenDoi_ThongBao.TienVietNam(thanhtien), i, ViTriCotTHanhTien);
                
            }
        }
    }
    
    public static void ThemVaoCTHD(JTable tableCTHD,String MaS,int SoLuong, String GhiChu,String KhuyenMai, String IPKhuyenMai){
        //truy vấn dữ liệu sang databa
        ResultSet rs = DAL.DAL_Sach.Seach_Sach_thanhly(MaS);
        Object[] item = new Object[10];//Tạo mảng
        DefaultTableModel table = (DefaultTableModel)tableCTHD.getModel();
        double ThanhTien,giasach = 0,giaKM = 0;
        int LoaiKM = -1;
        if (!IPKhuyenMai.equals("")) {
            ResultSet rsKM = DAL.DAL_KhuyenMai.Seach_MaKM(IPKhuyenMai);

                try {
                while(rsKM.next()){
                    giaKM = rsKM.getDouble("GiaSach");
                    LoaiKM = rsKM.getInt("DongofGiam");
                }
            } catch (SQLException ex) {
                System.out.println("lỗi truy vấn: " + ex.getMessage());
            }
        }
        try {
            while(rs.next()){
                if (LoaiKM == 0) {
                    giasach = rs.getDouble("GiaSach") - (rs.getDouble("GiaSach") * giaKM);
                    ThanhTien = SoLuong * giasach;
                } else if (LoaiKM == 1) {
                    giasach = giaKM;
                    ThanhTien = SoLuong * giaKM;
                } else{
                    giasach = rs.getDouble("GiaSach");
                    ThanhTien = SoLuong* Double.parseDouble(rs.getString("GiaSach"));
                }
                item[0] = tableCTHD.getRowCount() +1;
                item[1] = rs.getString("MaSach");
                item[2] = rs.getString("TenSach");
                item[3] = ChuyenDoi_ThongBao.TienVietNam(giasach);
                item[4] = SoLuong;
                item[5] = ChuyenDoi_ThongBao.TienVietNam(ThanhTien);
                //item[5] = ChuyenDoi_ThongBao.TienVietNam(ThanhTien);
                item[6] = GhiChu;
                //trả dữ liệu về table
                item[7] = IPKhuyenMai;
                item[8] = KhuyenMai;
                table.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi truy vấn: " + ex.getMessage());
        }
    }
    
    public static boolean checkDate(ResultSet rs){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String ngayhientai,ngaybatdau = null,ngayketthuc = null;
        Date date1 = null ,date2 = null, date3= null;
        ngayhientai = ChuyenDoi_ThongBao.TaoNgayLapHoaDon();
        
        try {
            while(rs.next()){
                ngaybatdau = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                
                ngayketthuc = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                
            }
        } catch (SQLException e) {
            System.out.println("Lỗi Truy Vấn : " + e.getMessage());
        }
        try{
            date1 = sdf.parse(ngayhientai);
            date2 = sdf.parse(ngaybatdau);
            date3 = sdf.parse(ngayketthuc);
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        if (date1.after(date3) || date1.before(date2)) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Khuyến mãi chưa có hiệu lực hoặc hết hạn", "Lỗi khuyến mãi");
            return false;
        } else {
            return true;
        }
    }
    public static void SetDLKM(String MaKM, String TenKM,DefaultTableModel table){
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, 8).equals("Không Có Khuyến Mãi")) {
                table.setValueAt(MaKM, 7, i);
                table.setValueAt(TenKM, 8, i);
            }
        }
    }
    
    public static void checkKM(ResultSet rs,double TongTienHD,double TongSach){
        double Tien = 0,SL = 0;
        int bodem = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String ngayhientai,ngaybatdau = null,ngayketthuc = null;
        Date date1 = null ,date2 = null, date3= null;
        ngayhientai = ChuyenDoi_ThongBao.TaoNgayLapHoaDon();
        ArrayList<DTO.DTO_KhuyenMai> arrTien = new ArrayList<>();
        ArrayList<DTO.DTO_KhuyenMai> arrSL = new ArrayList<>();
        try {
            while(rs.next()){
                
                ngaybatdau = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayBatDau"));
                
                ngayketthuc = ChuyenDoi_ThongBao.formatDate(rs.getDate("NgayKetThuc"));
                try{
                date1 = sdf.parse(ngayhientai);
                date2 = sdf.parse(ngaybatdau);
                date3 = sdf.parse(ngayketthuc);
            }catch(ParseException ex){
                ex.printStackTrace();
            }
            if (date1.after(date3) || date1.before(date2)) {
            } else {
                if (rs.getString("SoTienHoaDon") != null) {
                    DTO.DTO_KhuyenMai arr = new DTO_KhuyenMai(rs.getDouble("SoTienHoaDon"),rs.getDouble("GiaSach"), rs.getString("KhuyenMai"));
                    arrTien.add(arr);
                } 
                if (rs.getString("SoLuong") != null) {
                    DTO.DTO_KhuyenMai arr = new DTO_KhuyenMai(rs.getInt("SoLuong"),rs.getDouble("GiaSach"), rs.getString("KhuyenMai"));
                    arrSL.add(arr);
                }
                }
            bodem = 1 + bodem;
        }
            } catch (SQLException e) {
                System.out.println("Lỗi Truy Vấn : " + e.getMessage());
            }

        Collections.sort(arrSL, slhd);
        for (int i = 0; i < arrSL.size(); i++) {
            
            if (arrSL.get(i) != null) {
                DTO_KhuyenMai dto = arrSL.get(i);
                if (SL < dto.getSoLuong() & TongSach < dto.getSoLuong()) {
                    SL = dto.getSoLuong();
                } else {
                    pnl_KMHoaDon.txt_KMSoLuong.setText(dto.getKhuyenMai());
                    KMSLuong = dto.getGiaSach();
                    Tenkmsl = dto.getKhuyenMai();
                }
            }
        }
        Collections.sort(arrTien, tienhd);
        for (int i = 0; i < arrTien.size(); i++) {
            if (arrTien.get(i) != null) {
                System.out.println(i);
                DTO_KhuyenMai dto = arrTien.get(i);
                if (Tien < dto.getSoTienHoaDon() & TongTienHD < dto.getSoTienHoaDon()) {
                    Tien = dto.getSoTienHoaDon();
                } else {
                    pnl_KMHoaDon.txt_KMTien.setText(dto.getKhuyenMai());
                    KMSTien = dto.getGiaSach();
                    Tenkmtien = dto.getKhuyenMai();                
                            }
            }
        }
        
    }
    public static double KMSLuong,KMSTien,KMVoucher;
    public static String Tenkmsl,Tenkmtien,TenkmVoucher;
    public static Comparator<DTO_KhuyenMai> tienhd = new Comparator<DTO_KhuyenMai>() {
        @Override
        public int compare(DTO_KhuyenMai s2, DTO_KhuyenMai s1) {
            if(s1.getSoTienHoaDon()== s2.getSoTienHoaDon()) {
                String s1Name = s1.getKhuyenMai().toLowerCase();
                String s2Name = s2.getKhuyenMai().toLowerCase();
                return s2Name.compareTo(s1Name);
            }else{
                return (int) (s2.getSoTienHoaDon()- s1.getSoTienHoaDon());
            }
        }
    };
    
    public static Comparator<DTO_KhuyenMai> slhd = new Comparator<DTO_KhuyenMai>() {
        @Override
        public int compare(DTO_KhuyenMai s2, DTO_KhuyenMai s1) {
            if(s1.getSoLuong()== s2.getSoLuong()) {
                String s1Name = s1.getKhuyenMai().toLowerCase();
                String s2Name = s2.getKhuyenMai().toLowerCase();
                return s2Name.compareTo(s1Name);
            }else{
                return (int) (s2.getSoLuong()- s1.getSoLuong());
            }
        }
    };
    
    public static void TimKiemVoucher(JPopupMenu Ten,ResultSet rs){

        Ten.removeAll();// set lại số dòng của bảng về 0
        Ten.setVisible(false);
        try {
            while(rs.next()){
                JMenuItem MN = new JMenuItem(rs.getString("Voucher"));
                Ten.add(MN);
                MN.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MNactionPerformed(evt);
                    }

                    private void MNactionPerformed(ActionEvent evt) {
                        them(evt.getActionCommand());
                    }
                });
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        Ten.show(pnl_KMHoaDon.txt_KmVoucher, 0, 55);
        pnl_KMHoaDon.txt_KmVoucher.requestFocus();
    }
    public static void them(String key) {
        ResultSet rs = DAL.DAL_KhuyenMai.SeachVoucher(key);
        try {
            while(rs.next()){
                pnl_KMHoaDon.txt_KmVoucher.setText(rs.getString("Voucher"));
                TenkmVoucher = rs.getString("KhuyenMai");
                KMVoucher = rs.getShort("GiaSach");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_phieuthanhly.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void themHD(DTO.DTO_PhieuThanhLy dto){
        DAL.DAL_PhieuThanhLy.Them_PhieuThanhLy(dto);
    }
    public static void themCTHD(DTO.DTO_ChiTietPhieuThanhLy dto) {
        DAL.DAL_ChiTietPhieuThanhLy.Them_ChiTietPhieuThanhLy(dto);
    }
}
