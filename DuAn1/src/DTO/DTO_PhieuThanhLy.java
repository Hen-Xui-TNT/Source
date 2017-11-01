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
    int MaPhieuThanhLy,MaNhanVien;
    Double TongTien;
    Date NgayThanhLy;
    String SoPhieu,GhiChu;

    public DTO_PhieuThanhLy(int MaPhieuThanhLy, int MaNhanVien, Double TongTien, Date NgayThanhLy, String SoPhieu, String GhiChu) {
        this.MaPhieuThanhLy = MaPhieuThanhLy;
        this.MaNhanVien = MaNhanVien;
        this.TongTien = TongTien;
        this.NgayThanhLy = NgayThanhLy;
        this.SoPhieu = SoPhieu;
        this.GhiChu = GhiChu;
    }

    public DTO_PhieuThanhLy(int MaNhanVien, Double TongTien, Date NgayThanhLy, String SoPhieu, String GhiChu) {
        this.MaNhanVien = MaNhanVien;
        this.TongTien = TongTien;
        this.NgayThanhLy = NgayThanhLy;
        this.SoPhieu = SoPhieu;
        this.GhiChu = GhiChu;
    }

    public DTO_PhieuThanhLy() {
    }
    
    public int getMaPhieuThanhLy() {
        return MaPhieuThanhLy;
    }

    public void setMaPhieuThanhLy(int MaPhieuThanhLy) {
        this.MaPhieuThanhLy = MaPhieuThanhLy;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayThanhLy() {
        return NgayThanhLy;
    }

    public void setNgayThanhLy(Date NgayThanhLy) {
        this.NgayThanhLy = NgayThanhLy;
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.SoPhieu = SoPhieu;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
