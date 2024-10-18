package com.hieuthuoc.model;

import java.util.Date;

public class HoaDon {
    private int maHoaDon;
    private Date ngayLap;
    private Double tongTien;
    private int maNhanVien;
    private int maKhachHang;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, Date ngayLap, Double tongTien, int maNhanVien, int maKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}
