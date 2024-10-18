package com.hieuthuoc.model;

import java.util.Date;

public class Thuoc {
    private int maThuoc;
    private String soDangKy;
    private String nhomThuoc;
    private String phanLoai;
    private String hoatChat;
    private String hamLuong;
    private String tieuChuan;
    private int maNCC;
    private Date ngaySanXuat;
    private Date hanSuDung;
    private String donViTinh;
    private Double giaNhap;
    private Double donGia;
    private int soLuongNhap;
    private boolean trangThai;

    public Thuoc() {
    }

    public Thuoc(int maThuoc, String soDangKy, String nhomThuoc, String phanLoai, String hoatChat, String hamLuong, String tieuChuan, int maNCC, Date ngaySanXuat, Date hanSuDung, String donViTinh, Double giaNhap, Double donGia, int soLuongNhap, boolean trangThai) {
        this.maThuoc = maThuoc;
        this.soDangKy = soDangKy;
        this.nhomThuoc = nhomThuoc;
        this.phanLoai = phanLoai;
        this.hoatChat = hoatChat;
        this.hamLuong = hamLuong;
        this.tieuChuan = tieuChuan;
        this.maNCC = maNCC;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.donGia = donGia;
        this.soLuongNhap = soLuongNhap;
        this.trangThai = trangThai;
    }

    public int getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getSoDangKy() {
        return soDangKy;
    }

    public void setSoDangKy(String soDangKy) {
        this.soDangKy = soDangKy;
    }

    public String getNhomThuoc() {
        return nhomThuoc;
    }

    public void setNhomThuoc(String nhomThuoc) {
        this.nhomThuoc = nhomThuoc;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }

    public String getHoatChat() {
        return hoatChat;
    }

    public void setHoatChat(String hoatChat) {
        this.hoatChat = hoatChat;
    }

    public String getHamLuong() {
        return hamLuong;
    }

    public void setHamLuong(String hamLuong) {
        this.hamLuong = hamLuong;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
