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
public class DTO_ChiTietPhieuThanhLy {

    int MaChiTietPhieuThanhLy;
    int MaPhieuThanhLy;
    int MaSach;
    double GiaThanhLy;
    int SoLuong;
    double ThanhTien;
    String GhiChu;

    public DTO_ChiTietPhieuThanhLy() {
    }

    public DTO_ChiTietPhieuThanhLy(int MaChiTietPhieuThanhLy, int MaPhieuThanhLy, int MaSach, double GiaThanhLy, int SoLuong, double ThanhTien, String GhiChu) {
        this.MaChiTietPhieuThanhLy = MaChiTietPhieuThanhLy;
        this.MaPhieuThanhLy = MaPhieuThanhLy;
        this.MaSach = MaSach;
        this.GiaThanhLy = GiaThanhLy;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietPhieuThanhLy(int MaPhieuThanhLy, int MaSach, double GiaThanhLy, int SoLuong, double ThanhTien, String GhiChu) {
        this.MaPhieuThanhLy = MaPhieuThanhLy;
        this.MaSach = MaSach;
        this.GiaThanhLy = GiaThanhLy;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public int getMaChiTietPhieuThanhLy() {
        return MaChiTietPhieuThanhLy;
    }

    public void setMaChiTietPhieuThanhLy(int MaChiTietPhieuThanhLy) {
        this.MaChiTietPhieuThanhLy = MaChiTietPhieuThanhLy;
    }

    public int getMaPhieuThanhLy() {
        return MaPhieuThanhLy;
    }

    public void setMaPhieuThanhLy(int MaPhieuThanhLy) {
        this.MaPhieuThanhLy = MaPhieuThanhLy;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public double getGiaThanhLy() {
        return GiaThanhLy;
    }

    public void setGiaThanhLy(double GiaThanhLy) {
        this.GiaThanhLy = GiaThanhLy;
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
