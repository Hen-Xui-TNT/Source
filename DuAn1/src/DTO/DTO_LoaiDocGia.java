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
    int MaDocGia,UuDai;
    String TenLoai,MoTa;

    public DTO_LoaiDocGia(int MaDocGia, int UuDai, String TenLoai, String MoTa) {
        this.MaDocGia = MaDocGia;
        this.UuDai = UuDai;
        this.TenLoai = TenLoai;
        this.MoTa = MoTa;
    }

    public DTO_LoaiDocGia(int UuDai, String TenLoai, String MoTa) {
        this.UuDai = UuDai;
        this.TenLoai = TenLoai;
        this.MoTa = MoTa;
    }

    public DTO_LoaiDocGia() {
    }

    public int getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(int MaDocGia) {
        this.MaDocGia = MaDocGia;
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
