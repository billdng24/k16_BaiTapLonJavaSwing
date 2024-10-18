package com.hieuthuoc.model;

public class ChiTietHoaDon {
    private int maHoaDon;
    private int maThuoc;
    private Double donGia;
    private float giamGia;
    private int soLuong;
    private String donViTinh;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maHoaDon, int maThuoc, Double donGia, float giamGia, int soLuong, String donViTinh) {
        this.maHoaDon = maHoaDon;
        this.maThuoc = maThuoc;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }
}
