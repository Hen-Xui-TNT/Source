/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Huy Nhan
 */
public class DTO_PhieuThanhLy {
    int MaPhieuThanhLy;
    String SoPhieu;
    int MaNhanVien;
    Date NgayThanhLy;
    Double TongTien;
    String GhiChu;

    public DTO_PhieuThanhLy() {
    }

    public DTO_PhieuThanhLy(int MaPhieuThanhLy, String SoPhieu, int MaNhanVien, Date NgayThanhLy, Double TongTien, String GhiChu) {
        this.MaPhieuThanhLy = MaPhieuThanhLy;
        this.SoPhieu = SoPhieu;
        this.MaNhanVien = MaNhanVien;
        this.NgayThanhLy = NgayThanhLy;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public DTO_PhieuThanhLy(String SoPhieu, int MaNhanVien, Date NgayThanhLy, Double TongTien, String GhiChu) {
        this.SoPhieu = SoPhieu;
        this.MaNhanVien = MaNhanVien;
        this.NgayThanhLy = NgayThanhLy;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public int getMaPhieuThanhLy() {
        return MaPhieuThanhLy;
    }

    public void setMaPhieuThanhLy(int MaPhieuThanhLy) {
        this.MaPhieuThanhLy = MaPhieuThanhLy;
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.SoPhieu = SoPhieu;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayThanhLy() {
        return NgayThanhLy;
    }

    public void setNgayThanhLy(Date NgayThanhLy) {
        this.NgayThanhLy = NgayThanhLy;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
