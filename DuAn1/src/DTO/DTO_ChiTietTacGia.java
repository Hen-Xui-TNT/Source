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
    int MaChiTietTacGia,MaSach,MaTheLoai;
    String MoTa;

    public DTO_ChiTietTacGia(int MaChiTietTacGia, int MaSach, int MaTheLoai, String MoTa) {
        this.MaChiTietTacGia = MaChiTietTacGia;
        this.MaSach = MaSach;
        this.MaTheLoai = MaTheLoai;
        this.MoTa = MoTa;
    }

    public DTO_ChiTietTacGia(int MaSach, int MaTheLoai, String MoTa) {
        this.MaSach = MaSach;
        this.MaTheLoai = MaTheLoai;
        this.MoTa = MoTa;
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

    public int getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
}
