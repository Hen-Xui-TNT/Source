/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.Frame;
import java.awt.TextField;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Huy Nhan
 */
public class ChuyenDoi_ThongBao {
    public static void ThongBao_Loi (String NoiDung, String TieuDe){
        JOptionPane.showMessageDialog(new Frame(), NoiDung, TieuDe,0);
    }
    public static void ThongBao_ThanhCong (String NoiDung, String TieuDe){
        JOptionPane.showMessageDialog(new Frame(), NoiDung, TieuDe, JOptionPane.NO_OPTION);
    }
    public static String TienVietNam(double chuoi) {
        String chuyenDoi = "";
        //chuyển đổi sang tiền tệ việt nam
        Locale lc_vn = new Locale("vi", "VN");
        //khai báo chuyển đổi từ double sang tiền tệ
        NumberFormat nf_cur_vn = NumberFormat.getCurrencyInstance(lc_vn);
        //format chuỗi nhập vào thành tiền tệ
        chuyenDoi = nf_cur_vn.format(chuoi);
        //trả về tiền tệ (Việt Nam)
        return chuyenDoi;
    }
    public static String TienTeVeString(String chuoi) {
        String ChuyenDoi = chuoi;
        if (chuoi != null) {
            ChuyenDoi = chuoi.substring(0, chuoi.indexOf(' '))//trả về giá trị từ đầu đên đấu cách đầu tiên trong tiền tệ
                    .replace('.', ' ')//thay thế đấu chấm trong tiền tệ thành đấu cách
                    .replaceAll("\\s+", "");//loại bỏ tất cẩ các khoảng trống trong chuỗi
        }
        //trả về giá trị sau khi chuyển đổi
        return ChuyenDoi;
    }
<<<<<<< HEAD
    public static String TienDu(String tien, String Tongtien) {// tính tiền dư
=======
      public static String TienDu(String tien, String Tongtien) {
>>>>>>> 8fa8cecb98a0ac21f7aa75dffe0bbdc4215f970a
        double tiendu = 0;
        try {
            double tiennhan = Double.parseDouble(tien);
            tiendu = tiennhan - Double.parseDouble(ChuyenDoi_ThongBao.TienTeVeString(Tongtien));
        } catch (NumberFormatException e) {
            System.out.println(e);
            ChuyenDoi_ThongBao.ThongBao_Loi( "Tiền Phải Là Số !!!","Thông Báo Lỗi");
        }
        String trave = ChuyenDoi_ThongBao.TienVietNam(tiendu);
        return trave;
    }
<<<<<<< HEAD
    public static String TinhTongTien(JTable tableCTHD,int cotthanhtien) {// tính tổng tiền
        double tongtien = 0;
        for (int i = 0; i < tableCTHD.getRowCount(); i++) {
            tongtien += Double.parseDouble(ChuyenDoi_ThongBao.
                    TienTeVeString(tableCTHD.
                            getValueAt(i, cotthanhtien).toString()));
        }
        String rt = ChuyenDoi_ThongBao.TienVietNam(tongtien);
        return rt;
    }
    public static String TaoSoHoaDon() {// tạo tự động số hóa đơn
        Date CurrentDate = new Date();

        String dateCode = new SimpleDateFormat("ddMMyyhhmmss").format(CurrentDate);
        String SoHoaDon = "PT"+ dateCode;
        return SoHoaDon;
    }

    public static String TaoNgayLapHoaDon() {// xét lại ngày trong hóa đơn
        Date date = new Date();
        //DateFormat datefm = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dinhDang = sdf.format(date);
        //String xuatngay = datefm.format(date);
        return dinhDang;
    }
    public static String formatDate(Date date) {// xét lại ngày trong hóa đơn
        //DateFormat datefm = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dinhDang = sdf.format(date);
        //String xuatngay = datefm.format(date);
        return dinhDang;
    }
    public static Date SetDate(String Ngay) throws ParseException {// xét lại ngày trong hóa đơn
        Date date = new Date();
        //DateFormat datefm = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dinhDang = sdf.parse(Ngay);
        //String xuatngay = datefm.format(date);
        return dinhDang;
    }

    
    
   
    
=======
>>>>>>> 8fa8cecb98a0ac21f7aa75dffe0bbdc4215f970a
}
