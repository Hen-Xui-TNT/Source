/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Huy Nhan
 */
public class DTO_ChiTietTacGia {
    int MaChiTietTacGia,MaSach,MaTacGia;
    String GhiChu;

    public DTO_ChiTietTacGia(int MaChiTietTacGia, int MaSach, int MaTacGia, String GhiChu) {
        this.MaChiTietTacGia = MaChiTietTacGia;
        this.MaSach = MaSach;
        this.MaTacGia = MaTacGia;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietTacGia(int MaSach, int MaTacGia, String GhiChu) {
        this.MaSach = MaSach;
        this.MaTacGia = MaTacGia;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietTacGia() {
    }

    public int getMaChiTietTacGia() {
        return MaChiTietTacGia;
    }

    public void setMaChiTietTacGia(int MaChiTietTacGia) {
        this.MaChiTietTacGia = MaChiTietTacGia;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public int getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(int MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
