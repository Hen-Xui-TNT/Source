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
public class DTO_TacGia {
    int MaTacGia;
    String TenTacGia;
    String ButDanh;
    int GioiTinh;
    String NgaySinh;
    String NoiSinh;
    String GhiChu;

    public DTO_TacGia() {
    }

    public int getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(int MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public String getButDanh() {
        return ButDanh;
    }

    public void setButDanh(String ButDanh) {
        this.ButDanh = ButDanh;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public DTO_TacGia(int MaTacGia, String TenTacGia, String ButDanh, int GioiTinh, String NgaySinh, String NoiSinh, String GhiChu) {
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
        this.ButDanh = ButDanh;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NoiSinh = NoiSinh;
        this.GhiChu = GhiChu;
    }

    public DTO_TacGia(String TenTacGia, String ButDanh, int GioiTinh, String NgaySinh, String NoiSinh, String GhiChu) {
        this.TenTacGia = TenTacGia;
        this.ButDanh = ButDanh;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.NoiSinh = NoiSinh;
        this.GhiChu = GhiChu;
    }
    
    
}
