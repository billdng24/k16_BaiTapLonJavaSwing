package com.hieuthuoc.run;

import com.hieuthuoc.view.LoginView;
import com.hieuthuoc.view.QuanLyThuoc;
import com.hieuthuoc.view.ThongTinCaNhan;

import javax.swing.*;

public class HieuThuoc {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLyThuoc().setVisible(true);
            }

        });
    }
}
