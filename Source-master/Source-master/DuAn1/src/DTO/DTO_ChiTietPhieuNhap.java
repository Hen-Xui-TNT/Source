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
public class DTO_ChiTietPhieuNhap {
      int MaChiTietPhieuNhap, MaPhieuNhap, MaSach, SoLuong;
    String GhiChu;
    double GiaNhap, ThanhTien;

    public DTO_ChiTietPhieuNhap() {
    }

    public DTO_ChiTietPhieuNhap(int MaChiTietPhieuNhap, int MaPhieuNhap, int MaSach, int SoLuong, String GhiChu, double GiaNhap, double ThanhTien) {
        this.MaChiTietPhieuNhap = MaChiTietPhieuNhap;
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.GhiChu = GhiChu;
        this.GiaNhap = GiaNhap;
        this.ThanhTien = ThanhTien;
    }

    public int getMaChiTietPhieuNhap() {
        return MaChiTietPhieuNhap;
    }

    public void setMaChiTietPhieuNhap(int MaChiTietPhieuNhap) {
        this.MaChiTietPhieuNhap = MaChiTietPhieuNhap;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    
}
