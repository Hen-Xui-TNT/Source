/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import DTO.*;
import DAL.*;
import GUI.*;
import BLL.*;
import java.util.Date;

/**
 *
 * @author tamntmpk00821
 */
public class DTO_PhieuNhap {
    int MaPhieuNhap;
    String SoPhieuNhap;
    int MaNhaCungCap;
    int MaNhanVien;
    String NgayNhap;
    double TongTien;
    String GhiChu;

    public DTO_PhieuNhap() {
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getSoPhieuNhap() {
        return SoPhieuNhap;
    }

    public void setSoPhieuNhap(String SoPhieuNhap) {
        this.SoPhieuNhap = SoPhieuNhap;
    }

    public int getMaNhaCungCap() {
        return MaNhaCungCap;
    }

    public void setMaNhaCungCap(int MaNhaCungCap) {
        this.MaNhaCungCap = MaNhaCungCap;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
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

    public DTO_PhieuNhap(String SoPhieuNhap, int MaNhaCungCap, int MaNhanVien, String NgayNhap, double TongTien, String GhiChu) {
        this.SoPhieuNhap = SoPhieuNhap;
        this.MaNhaCungCap = MaNhaCungCap;
        this.MaNhanVien = MaNhanVien;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public DTO_PhieuNhap(int MaPhieuNhap, String SoPhieuNhap, int MaNhaCungCap, int MaNhanVien, String NgayNhap, double TongTien, String GhiChu) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.SoPhieuNhap = SoPhieuNhap;
        this.MaNhaCungCap = MaNhaCungCap;
        this.MaNhanVien = MaNhanVien;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    
    
    
}
