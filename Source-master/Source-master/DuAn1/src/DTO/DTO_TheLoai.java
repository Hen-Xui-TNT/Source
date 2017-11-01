/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class DTO_TheLoai {
    
    int MaTheLoai;
    String TenTheLoai, GhiChu;

    public DTO_TheLoai() {
    }

    public DTO_TheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public DTO_TheLoai(int MaTheLoai, String TenTheLoai, String GhiChu) {
        this.MaTheLoai = MaTheLoai;
        this.TenTheLoai = TenTheLoai;
        this.GhiChu = GhiChu;
    }

    public int getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
