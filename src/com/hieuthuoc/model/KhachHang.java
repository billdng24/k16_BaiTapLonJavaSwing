package com.hieuthuoc.model;

import java.util.Date;

public class KhachHang {
    private int maKhachHang;
    private String ten;
    private String ho;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String cmnd;
    private String soDienThoai;
    private String maDiaChi;

    public KhachHang() {
    }

    public KhachHang(int maKhachHang, String ten, String ho, Date ngaySinh, boolean gioiTinh, String cmnd, String soDienThoai, String maDiaChi) {
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.maDiaChi = maDiaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(String maDiaChi) {
        this.maDiaChi = maDiaChi;
    }
}
