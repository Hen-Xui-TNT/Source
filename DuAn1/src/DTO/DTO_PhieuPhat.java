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
    int MaPhieuPhat; 
    String SoPhieuPhat;
    int MaDocGia;
    int MaNhanVien;
    String NgayPhat;
    double TongTien;
    String GhiChu;

    public DTO_PhieuPhat() {
    }

    public DTO_PhieuPhat(int MaPhieuPhat, String SoPhieuPhat, int MaDocGia, int MaNhanVien, String NgayPhat, double TongTien, String GhiChu) {
        this.MaPhieuPhat = MaPhieuPhat;
        this.SoPhieuPhat = SoPhieuPhat;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.NgayPhat = NgayPhat;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public DTO_PhieuPhat(String SoPhieuPhat, int MaDocGia, int MaNhanVien, String NgayPhat, double TongTien, String GhiChu) {
        this.SoPhieuPhat = SoPhieuPhat;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.NgayPhat = NgayPhat;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public int getMaPhieuPhat() {
        return MaPhieuPhat;
    }

    public void setMaPhieuPhat(int MaPhieuPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
    }

    public String getSoPhieuPhat() {
        return SoPhieuPhat;
    }

    public void setSoPhieuPhat(String SoPhieuPhat) {
        this.SoPhieuPhat = SoPhieuPhat;
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

    public String getNgayPhat() {
        return NgayPhat;
    }

    public void setNgayPhat(String NgayPhat) {
        this.NgayPhat = NgayPhat;
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
