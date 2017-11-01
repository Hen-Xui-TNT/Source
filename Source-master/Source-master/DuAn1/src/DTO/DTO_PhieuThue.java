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
    
    int MaPhieuThue, MaDocGia, MaNhanVien;
    String SoPhieuThue, GhiChu;
    Date NgayThue, NgayTra;
    double TongTien;

    public DTO_PhieuThue() {
    }

    public DTO_PhieuThue(int MaPhieuThue, int MaDocGia, int MaNhanVien, String SoPhieuThue, String GhiChu, Date NgayThue,Date NgayTra, double TongTien) {
        this.MaPhieuThue = MaPhieuThue;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.SoPhieuThue = SoPhieuThue;
        this.GhiChu = GhiChu;
        this.NgayThue = NgayThue;
         this.NgayTra = NgayTra;
        this.TongTien = TongTien;
    }

    public int getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(int MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
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

    public String getSoPhieuThue() {
        return SoPhieuThue;
    }

    public void setSoPhieuThue(String SoPhieuThue) {
        this.SoPhieuThue = SoPhieuThue;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Date getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(Date NgayThue) {
        this.NgayThue = NgayThue;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }
    
    
}
