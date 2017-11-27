/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import GUI.DuAn1;
import java.sql.ResultSet;

/**
 *
 * @author HuyNhan
 */
public class DAL_login {
     public static ResultSet GetALL(String user, String pass) {
        String query = "select * from NhanVien,Quyen where NhanVien.MaQuyen= Quyen.MaQuyen and NhanVien.TenDangNhap = N'"+user+"' and NhanVien.MatKhau = N'"+pass+"'";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
//     public static ResultSet timkiem(String tensach,String tacgia,String theloai,String nhaxuatban,String mota){
//        String query = "select * from Sach,ChiTietTacGia,TacGia,TheLoai,ChiTietTheLoai "
//                 + "where Sach.MaSach = ChiTietTacGia.MaSach "
//                 + "and Sach.MaSach = ChiTietTheLoai.MaSach "
//                 + "and TacGia.MaTacGia = ChiTietTacGia.MaTacGia "
//                 + "and TheLoai.MaTheLoai = ChiTietTheLoai.MaTheLoai "
//                 + "and Sach.TenSach like N'%"+tensach+"%' "
//                 + "and TheLoai.TenTheLoai like '%"+theloai+"%' "
//                 + "and Sach.MoTa like N'%"+mota+"%' "
//                 + "and TacGia.TenTacGia like N'%"+tacgia+"%' "
//                 + "and Sach.NhaXuatBan like N'%"+nhaxuatban+"%'";
//        return DuAn1.conn.ExcuteQuerySelect(query);
//     }
}
