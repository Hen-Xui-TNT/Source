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
public class DTO_ChiTietTheLoai {
    int MaChiTietTheLoai;
    int MaSach;
    int MaTheLoai;
    String GhiChu;

    public DTO_ChiTietTheLoai() {
    }

    public DTO_ChiTietTheLoai(int MaChiTietTheLoai, int MaSach, int MaTheLoai, String GhiChu) {
        this.MaChiTietTheLoai = MaChiTietTheLoai;
        this.MaSach = MaSach;
        this.MaTheLoai = MaTheLoai;
        this.GhiChu = GhiChu;
    }

    public DTO_ChiTietTheLoai(int MaSach, int MaTheLoai, String GhiChu) {
        this.MaSach = MaSach;
        this.MaTheLoai = MaTheLoai;
        this.GhiChu = GhiChu;
    }

    public int getMaChiTietTheLoai() {
        return MaChiTietTheLoai;
    }

    public void setMaChiTietTheLoai(int MaChiTietTheLoai) {
        this.MaChiTietTheLoai = MaChiTietTheLoai;
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

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
