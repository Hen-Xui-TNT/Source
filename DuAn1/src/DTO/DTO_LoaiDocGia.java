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
public class DTO_LoaiDocGia {
    int MaLoaiDocGia,UuDai;
    String TenLoai,MoTa;

    public DTO_LoaiDocGia() {
    }

    public DTO_LoaiDocGia(int MaLoaiDocGia, int UuDai, String TenLoai, String MoTa) {
        this.MaLoaiDocGia = MaLoaiDocGia;
        this.UuDai = UuDai;
        this.TenLoai = TenLoai;
        this.MoTa = MoTa;
    }

    public int getMaLoaiDocGia() {
        return MaLoaiDocGia;
    }

    public void setMaLoaiDocGia(int MaLoaiDocGia) {
        this.MaLoaiDocGia = MaLoaiDocGia;
    }

    public int getUuDai() {
        return UuDai;
    }

    public void setUuDai(int UuDai) {
        this.UuDai = UuDai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

   
    
}
