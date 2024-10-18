package com.hieuthuoc.model;

import java.util.Date;

public class NhanVien {
    private int maNhanVien;
    private String caLamViec;
    private String ten;
    private String ho;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String cmnd;
    private String soDienThoai;
    private int maDiaChi;
    private int maTaiKhoan;
    private String loaiNhanVien;
    private boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(int maNhanVien, String caLamViec, String ten, String ho, Date ngaySinh, boolean gioiTinh, String cmnd, String soDienThoai, int maDiaChi, int maTaiKhoan, String loaiNhanVien, boolean trangThai) {
        this.maNhanVien = maNhanVien;
        this.caLamViec = caLamViec;
        this.ten = ten;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.maDiaChi = maDiaChi;
        this.maTaiKhoan = maTaiKhoan;
        this.loaiNhanVien = loaiNhanVien;
        this.trangThai = trangThai;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(String caLamViec) {
        this.caLamViec = caLamViec;
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

    public int getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(int maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public int getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
