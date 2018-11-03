package top.wxs1999.gui.panel;

import listener.RegistListener;

import javax.swing.*;
import java.awt.*;

public class RegistPanel extends JPanel {
    JLabel jl1 = new JLabel("账号");
    JLabel jl2 = new JLabel("密码");
    JLabel jl3 = new JLabel("重复密码");
    public JTextField userName = new JTextField();
    public JPasswordField passwordField = new JPasswordField();
    public JPasswordField rePasswordField = new JPasswordField();
    public static RegistPanel instance = new RegistPanel();
    public JButton regist = new JButton();
    public RegistPanel() {
        this.setLayout(null);
        regist.setText("注册");
        Font font = new Font("微软雅黑", Font.BOLD, 18);
        jl1.setFont(font);
        jl2.setFont(font);
        jl3.setFont(font);
        regist.setFont(font);
        jl1.setBounds(0, 0, 50, 50);
        userName.setBounds(0, 60, 300, 20);
        jl2.setBounds(0, 70, 50, 50);
        passwordField.setBounds(0, 130, 300, 20);
        jl3.setBounds(0, 150, 100, 50);
        rePasswordField.setBounds(0, 200, 300, 20);
        regist.setBounds(320, 40, 100, 50);
        this.add(passwordField);
        this.add(rePasswordField);
        this.add(userName);
        this.add(jl1);
        this.add(jl2);
        this.add(jl3);
        this.add(regist);
        addListener();
    }

    public void addListener() {
        RegistListener listener = new RegistListener();
        this.regist.addActionListener(listener);
    }
}
