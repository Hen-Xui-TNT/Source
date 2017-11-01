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
public class DTO_NhaCungCap {
    int MaNhaCungCap;
    String TenNhaCungCap;
    String DiaChi;
    String SoDienThoai;
    String Gmail;
    String GhiChu;

    public DTO_NhaCungCap() {
    }

    public int getMaNhaCungCap() {
        return MaNhaCungCap;
    }

    public void setMaNhaCungCap(int MaNhaCungCap) {
        this.MaNhaCungCap = MaNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return TenNhaCungCap;
    }

    public void setTenNhaCungCap(String TenNhaCungCap) {
        this.TenNhaCungCap = TenNhaCungCap;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public DTO_NhaCungCap(String TenNhaCungCap, String DiaChi, String SoDienThoai, String Gmail, String GhiChu) {
        this.TenNhaCungCap = TenNhaCungCap;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.Gmail = Gmail;
        this.GhiChu = GhiChu;
    }

    public DTO_NhaCungCap(int MaNhaCungCap, String TenNhaCungCap, String DiaChi, String SoDienThoai, String Gmail, String GhiChu) {
        this.MaNhaCungCap = MaNhaCungCap;
        this.TenNhaCungCap = TenNhaCungCap;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.Gmail = Gmail;
        this.GhiChu = GhiChu;
    }
    
    
}
