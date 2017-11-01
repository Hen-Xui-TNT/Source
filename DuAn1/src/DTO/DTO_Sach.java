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
public class DTO_Sach {
    int MaSach,SoLuong;
    Double GiaSach,GiaNhap;
    String TenSach,TinhTrangSach,NhaXuatBan,MoTa;

    public DTO_Sach() {
    }

    public DTO_Sach(int SoLuong, Double GiaSach, Double GiaNhap, String TenSach, String TinhTrangSach, String NhaXuatBan, String MoTa) {
        this.SoLuong = SoLuong;
        this.GiaSach = GiaSach;
        this.GiaNhap = GiaNhap;
        this.TenSach = TenSach;
        this.TinhTrangSach = TinhTrangSach;
        this.NhaXuatBan = NhaXuatBan;
        this.MoTa = MoTa;
    }

    public DTO_Sach(int MaSach, int SoLuong, Double GiaSach, Double GiaNhap, String TenSach, String TinhTrangSach, String NhaXuatBan, String MoTa) {
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.GiaSach = GiaSach;
        this.GiaNhap = GiaNhap;
        this.TenSach = TenSach;
        this.TinhTrangSach = TinhTrangSach;
        this.NhaXuatBan = NhaXuatBan;
        this.MoTa = MoTa;
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

    public Double getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(Double GiaSach) {
        this.GiaSach = GiaSach;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTinhTrangSach() {
        return TinhTrangSach;
    }

    public void setTinhTrangSach(String TinhTrangSach) {
        this.TinhTrangSach = TinhTrangSach;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
}
