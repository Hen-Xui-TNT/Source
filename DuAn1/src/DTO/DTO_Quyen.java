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
public class DTO_Quyen {
    
    int MaQuyen;
    String TenQuyen, GhiChu,Ma;

    public DTO_Quyen() {
    }

    public DTO_Quyen(String TenQuyen, String GhiChu, String Ma) {
        this.TenQuyen = TenQuyen;
        this.GhiChu = GhiChu;
        this.Ma = Ma;
    }

    public DTO_Quyen(int MaQuyen, String TenQuyen, String GhiChu, String Ma) {
        this.MaQuyen = MaQuyen;
        this.TenQuyen = TenQuyen;
        this.GhiChu = GhiChu;
        this.Ma = Ma;
    }

    public int getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(int MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String TenQuyen) {
        this.TenQuyen = TenQuyen;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }
    
}

