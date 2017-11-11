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
public class DTO_KhuyenMai {
     int MaKhuyenMai, MaSach, SoLuong, KhuyenMai;
    Date NgayBatDau, NgayKetThuc;
    double SoTienHoaDon,GiaSach;

    public DTO_KhuyenMai() {
    }

    public DTO_KhuyenMai(int MaKhuyenMai, int MaSach, int SoLuong, int KhuyenMai, Date NgayBatDau, Date NgayKetThuc, double SoTienHoaDon, double GiaSach) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.KhuyenMai = KhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.SoTienHoaDon = SoTienHoaDon;
        this.GiaSach = GiaSach;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
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

    public int getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(int KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public double getSoTienHoaDon() {
        return SoTienHoaDon;
    }

    public void setSoTienHoaDon(double SoTienHoaDon) {
        this.SoTienHoaDon = SoTienHoaDon;
    }

    public double getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(double GiaSach) {
        this.GiaSach = GiaSach;
    }
    
    
}

