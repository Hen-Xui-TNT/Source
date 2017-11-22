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

    int MaKhuyenMai;
    Date NgayBatDau;
    Date NgayKetThuc;
    double SoTienHoaDon;
    int SoLuong;
    int MaSach;
    Double GiaSach;
    int KhuyenMai;

    public DTO_KhuyenMai() {
    }

    public DTO_KhuyenMai(Date NgayBatDau, Date NgayKetThuc, double SoTienHoaDon, int SoLuong, int MaSach, Double GiaSach, int KhuyenMai) {
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.SoTienHoaDon = SoTienHoaDon;
        this.SoLuong = SoLuong;
        this.MaSach = MaSach;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
    }

    public DTO_KhuyenMai(int MaKhuyenMai, Date NgayBatDau, Date NgayKetThuc, double SoTienHoaDon, int SoLuong, int MaSach, Double GiaSach, int KhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.SoTienHoaDon = SoTienHoaDon;
        this.SoLuong = SoLuong;
        this.MaSach = MaSach;
        this.GiaSach = GiaSach;
        this.KhuyenMai = KhuyenMai;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
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

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public Double getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(Double GiaSach) {
        this.GiaSach = GiaSach;
    }

    public int getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(int KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

    
}
