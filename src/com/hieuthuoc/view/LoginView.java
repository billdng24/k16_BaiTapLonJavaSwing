package com.hieuthuoc.view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoginView extends JFrame {
    public LoginView() {
        // Cài đặt frame
        setTitle("Login");
        setSize(350, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Hiển thị form ở giữa màn hình

        // Tạo panel để chứa các thành phần
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        // Thêm nhãn "Welcome"
        JLabel welcomeLabel = new JLabel("Welcome");
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setBounds(110, 180, 120, 30);
        panel.add(welcomeLabel);

        //Ảnh
        URL imgURL = getClass().getResource("/com/hieuthuoc/image/uneti100.jpg");
            ImageIcon icon = new ImageIcon(imgURL);
            JLabel imageLabel = new JLabel(icon);
            imageLabel.setBounds(100, 20, 160, 175);
            panel.add(imageLabel);


        // Thêm nhãn và trường nhập email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 220, 250, 30);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(50, 250, 250, 30);
        panel.add(emailField);

        // Thêm nhãn và trường nhập mật khẩu
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 300, 250, 30);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 330, 250, 30);
        panel.add(passwordField);

        // Thêm nút "Login"
        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(50, 380, 250, 40);
        loginButton.setBackground(new Color(0, 150, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(loginButton);

//        // Thêm nhãn "Sign Up"
//        JLabel signupLabel = new JLabel("Don't have an account? Sign Up");
//        signupLabel.setBounds(90, 440, 200, 30);
//        signupLabel.setForeground(Color.GRAY);
//        panel.add(signupLabel);

        // Thêm panel vào frame
        add(panel);
        setVisible(true);
    }


}

