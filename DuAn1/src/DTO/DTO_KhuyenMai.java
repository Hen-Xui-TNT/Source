/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


/**
 *
 * @author Administrator
 */
public class DTO_KhuyenMai {

    int MaKhuyenMai;
    String NgayBatDau;
    String NgayKetThuc;
    double SoTienHoaDon;
    int SoLuong;
    int MaSach;
    Double GiaSach;
    String KhuyenMai,voucher;
    
    public DTO_KhuyenMai() {
    }

    public DTO_KhuyenMai(double SoTienHoaDon, Double GiaSach, String KhuyenMai) {
        this.SoTienHoaDon = SoTienHoaDon;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
    }

    public DTO_KhuyenMai(int SoLuong, Double GiaSach, String KhuyenMai) {
        this.SoLuong = SoLuong;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
    }

    public DTO_KhuyenMai(int MaKhuyenMai, String NgayBatDau, String NgayKetThuc, double SoTienHoaDon, int SoLuong, int MaSach, Double GiaSach, String KhuyenMai, String voucher) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.SoTienHoaDon = SoTienHoaDon;
        this.SoLuong = SoLuong;
        this.MaSach = MaSach;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
        this.voucher = voucher;
    }

    public DTO_KhuyenMai(String NgayBatDau, String NgayKetThuc, double SoTienHoaDon, int SoLuong, int MaSach, Double GiaSach, String KhuyenMai, String voucher) {
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.SoTienHoaDon = SoTienHoaDon;
        this.SoLuong = SoLuong;
        this.MaSach = MaSach;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
        this.voucher = voucher;
    }

    

    public DTO_KhuyenMai(String NgayBatDau, String NgayKetThuc, int MaSach, Double GiaSach, String KhuyenMai) {
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.MaSach = MaSach;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
    }

    public DTO_KhuyenMai(String NgayBatDau, String NgayKetThuc, double SoTienHoaDon, Double GiaSach, String KhuyenMai) {
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.SoTienHoaDon = SoTienHoaDon;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
    }

    public DTO_KhuyenMai(String NgayBatDau, String NgayKetThuc, Double GiaSach, String KhuyenMai, String voucher) {
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
        this.voucher = voucher;
    }

    
    
    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
    
    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public double getSoTienHoaDon() {
        return SoTienHoaDon;
    }

    public void setSoTienHoaDon(double SoTienHoaDon) {
        this.SoTienHoaDon = SoTienHoaDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public Double getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(Double GiaSach) {
        this.GiaSach = GiaSach;
    }

    public String getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(String KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }


    
}
