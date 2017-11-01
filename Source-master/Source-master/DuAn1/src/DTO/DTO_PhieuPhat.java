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
public class DTO_PhieuPhat {
    int MaPhieuPhat, MaDocGia, MaNhanVien;
    String SoPhieuPhat, GhiChu;
    double TongTien;
    Date NgayPhat;

    public DTO_PhieuPhat() {
    }

    public DTO_PhieuPhat(int MaPhieuPhat, int MaDocGia, int MaNhanVien, String SoPhieuPhat, double TongTien, Date NgayPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.SoPhieuPhat = SoPhieuPhat;
        this.TongTien = TongTien;
        this.NgayPhat = NgayPhat;
    }

    public int getMaPhieuPhat() {
        return MaPhieuPhat;
    }

    public void setMaPhieuPhat(int MaPhieuPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
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

    public String getSoPhieuPhat() {
        return SoPhieuPhat;
    }

    public void setSoPhieuPhat(String SoPhieuPhat) {
        this.SoPhieuPhat = SoPhieuPhat;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayPhat() {
        return NgayPhat;
    }

    public void setNgayPhat(Date NgayPhat) {
        this.NgayPhat = NgayPhat;
    }
    
    
}
