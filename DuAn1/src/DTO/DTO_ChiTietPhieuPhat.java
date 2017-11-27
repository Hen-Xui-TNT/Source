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
 * @author Yuuki
 */
public class DTO_ChiTietPhieuPhat {
    int MaChiTietPhieuPhat;
    int MaPhieuPhat;
    int MaSach;
    double LoiPhat;
    double TienPhat;
    int SoLuong;
    double ThanhTien;
    String GhiChu;

    public DTO_ChiTietPhieuPhat() {
    }

    public DTO_ChiTietPhieuPhat(int MaChiTietPhieuPhat, int MaPhieuPhat, int MaSach, double LoiPhat, double TienPhat, int SoLuong, double ThanhTien, String GhiChu) {
        this.MaChiTietPhieuPhat = MaChiTietPhieuPhat;
        this.MaPhieuPhat = MaPhieuPhat;
        this.MaSach = MaSach;
        this.LoiPhat = LoiPhat;
        this.TienPhat = TienPhat;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietPhieuPhat(int MaPhieuPhat, int MaSach, double LoiPhat, double TienPhat, int SoLuong, double ThanhTien, String GhiChu) {
        this.MaPhieuPhat = MaPhieuPhat;
        this.MaSach = MaSach;
        this.LoiPhat = LoiPhat;
        this.TienPhat = TienPhat;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
        this.GhiChu = GhiChu;
    }

    public int getMaChiTietPhieuPhat() {
        return MaChiTietPhieuPhat;
    }

    public void setMaChiTietPhieuPhat(int MaChiTietPhieuPhat) {
        this.MaChiTietPhieuPhat = MaChiTietPhieuPhat;
    }

    public int getMaPhieuPhat() {
        return MaPhieuPhat;
    }

    public void setMaPhieuPhat(int MaPhieuPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public double getLoiPhat() {
        return LoiPhat;
    }

    public void setLoiPhat(double LoiPhat) {
        this.LoiPhat = LoiPhat;
    }

    public double getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(double TienPhat) {
        this.TienPhat = TienPhat;
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
