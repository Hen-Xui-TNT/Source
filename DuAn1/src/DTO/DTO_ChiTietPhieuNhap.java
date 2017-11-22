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

    int MaChiTietPhieuNhap;
    int MaPhieuNhap;
    int MaSach;
    double GiaNhap;
    int SoLuong;
    Double ThanhTien;
    String GhiChu;

    public DTO_ChiTietPhieuNhap() {
    }

    public DTO_ChiTietPhieuNhap(int MaChiTietPhieuNhap, int MaPhieuNhap, int MaSach, double GiaNhap, int SoLuong, Double ThanhTien, String GhiChu) {
        this.MaChiTietPhieuNhap = MaChiTietPhieuNhap;
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.GiaNhap = GiaNhap;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietPhieuNhap(int MaPhieuNhap, int MaSach, double GiaNhap, int SoLuong, Double ThanhTien, String GhiChu) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.GiaNhap = GiaNhap;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
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

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
