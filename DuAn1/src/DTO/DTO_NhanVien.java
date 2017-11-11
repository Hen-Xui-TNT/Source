/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;



/**
 *
 * @author Asus
 */
public class DTO_NhanVien {
    int MaNV;
    String TenNV;
    String TenDangNhap;
    String MatKhau;
    int MaQuyen;
    Double Luong;
    String NgaySinh;
    String NgayLam;
    int GioiTinh;
    String CMND;
    String DiaChi;
    String SoDienThoai;
    String GhiChu;

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public Double getLuong() {
        return Luong;
    }

    public void setLuong(Double Luong) {
        this.Luong = Luong;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgayLam() {
        return NgayLam;
    }

    public void setNgayLam(String NgayLam) {
        this.NgayLam = NgayLam;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public DTO_NhanVien(int MaNV, String TenNV, String TenDangNhap, String MatKhau, int MaQuyen, Double Luong, String NgaySinh, String NgayLam, int GioiTinh, String CMND, String DiaChi, String SoDienThoai, String GhiChu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.MaQuyen = MaQuyen;
        this.Luong = Luong;
        this.NgaySinh = NgaySinh;
        this.NgayLam = NgayLam;
        this.GioiTinh = GioiTinh;
        this.CMND = CMND;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public DTO_NhanVien(String TenNV, String TenDangNhap, String MatKhau, int MaQuyen, Double Luong, String NgaySinh, String NgayLam, int GioiTinh, String CMND, String DiaChi, String SoDienThoai, String GhiChu) {
        this.TenNV = TenNV;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.MaQuyen = MaQuyen;
        this.Luong = Luong;
        this.NgaySinh = NgaySinh;
        this.NgayLam = NgayLam;
        this.GioiTinh = GioiTinh;
        this.CMND = CMND;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.GhiChu = GhiChu;
    }

    public DTO_NhanVien() {
    }

   
}
