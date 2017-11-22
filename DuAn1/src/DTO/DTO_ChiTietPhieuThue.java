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
public class DTO_ChiTietPhieuThue {
    int MaChiTietPhieuThue; 
    int MaPhieuThue; 
    int MaSach; 
    double GiaThue;
    int SoLuong;
    double ThanhTien;
    String GhiChu;

    public DTO_ChiTietPhieuThue() {
    }

    public DTO_ChiTietPhieuThue(int MaChiTietPhieuThue, int MaPhieuThue, int MaSach, double GiaThue, int SoLuong, double ThanhTien, String GhiChu) {
        this.MaChiTietPhieuThue = MaChiTietPhieuThue;
        this.MaPhieuThue = MaPhieuThue;
        this.MaSach = MaSach;
        this.GiaThue = GiaThue;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietPhieuThue(int MaPhieuThue, int MaSach, double GiaThue, int SoLuong, double ThanhTien, String GhiChu) {
        this.MaPhieuThue = MaPhieuThue;
        this.MaSach = MaSach;
        this.GiaThue = GiaThue;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public int getMaChiTietPhieuThue() {
        return MaChiTietPhieuThue;
    }

    public void setMaChiTietPhieuThue(int MaChiTietPhieuThue) {
        this.MaChiTietPhieuThue = MaChiTietPhieuThue;
    }

    public int getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(int MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public double getGiaThue() {
        return GiaThue;
    }

    public void setGiaThue(double GiaThue) {
        this.GiaThue = GiaThue;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
    
}
