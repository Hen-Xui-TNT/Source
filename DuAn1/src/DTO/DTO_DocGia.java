/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import DTO.*;
import DAL.*;
import GUI.*;
import BLL.*;
import java.util.Date;
/**
 *
 * @author Yuuki
 */
public class DTO_DocGia {
    int MaDocGia;
    String TenDocGia;
    int MaLoaiDocGia;
    int GioiTinh;
    String NgaySinh;
    String SoDienThoai;
    String DiaChi;
    String TrangThai;
    String MoTa;

    public DTO_DocGia(int MaDocGia, String TenDocGia, int MaLoaiDocGia, int GioiTinh, String NgaySinh, String SoDienThoai, String DiaChi, String TrangThai, String MoTa) {
        this.MaDocGia = MaDocGia;
        this.TenDocGia = TenDocGia;
        this.MaLoaiDocGia = MaLoaiDocGia;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.TrangThai = TrangThai;
        this.MoTa = MoTa;
    }

    public DTO_DocGia() {
    }

    public DTO_DocGia(String TenDocGia, int MaLoaiDocGia, int GioiTinh, String NgaySinh, String SoDienThoai, String DiaChi, String TrangThai, String MoTa) {
        this.TenDocGia = TenDocGia;
        this.MaLoaiDocGia = MaLoaiDocGia;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.TrangThai = TrangThai;
        this.MoTa = MoTa;
    }

    public int getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(int MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public String getTenDocGia() {
        return TenDocGia;
    }

    public void setTenDocGia(String TenDocGia) {
        this.TenDocGia = TenDocGia;
    }

    public int getMaLoaiDocGia() {
        return MaLoaiDocGia;
    }

    public void setMaLoaiDocGia(int MaLoaiDocGia) {
        this.MaLoaiDocGia = MaLoaiDocGia;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
    
}
