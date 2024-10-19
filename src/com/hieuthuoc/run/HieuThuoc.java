package com.hieuthuoc.run;

import com.hieuthuoc.view.LoginView;

import javax.swing.*;

public class HieuThuoc {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginView();
            }

        });
    }
}
