/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class DTO_PhieuThue {
    
    int MaPhieuThue;
    String SoPhieuThue;
     int MaDocGia;
     int MaNhanVien;
    String NgayThue; 
    String NgayTra;
    double TongTien;
    String GhiChu;

    public DTO_PhieuThue() {
    }

    public DTO_PhieuThue(int MaPhieuThue, String SoPhieuThue, int MaDocGia, int MaNhanVien, String NgayThue, String NgayTra, double TongTien, String GhiChu) {
        this.MaPhieuThue = MaPhieuThue;
        this.SoPhieuThue = SoPhieuThue;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.NgayThue = NgayThue;
        this.NgayTra = NgayTra;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public DTO_PhieuThue(String SoPhieuThue, int MaDocGia, int MaNhanVien, String NgayThue, String NgayTra, double TongTien, String GhiChu) {
        this.SoPhieuThue = SoPhieuThue;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.NgayThue = NgayThue;
        this.NgayTra = NgayTra;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public int getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(int MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public String getSoPhieuThue() {
        return SoPhieuThue;
    }

    public void setSoPhieuThue(String SoPhieuThue) {
        this.SoPhieuThue = SoPhieuThue;
    }

    public int getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(int MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(String NgayThue) {
        this.NgayThue = NgayThue;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
