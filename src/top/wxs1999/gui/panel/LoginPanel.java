package top.wxs1999.gui.panel;

import Utool.UItools;
import listener.LoginListener;

import javax.swing.*;
import java.awt.*;

/**
 * 登录页面
 */
public class LoginPanel extends JPanel {
    public static LoginPanel instance = new LoginPanel();
    public JTextField name = new JTextField();
    public JPasswordField passwordField = new JPasswordField();
    public JLabel user = new JLabel("用户名");
    public JLabel psw = new JLabel("密码");
    public JButton bLogin = new JButton();
    public JButton bRegist = new JButton();
    public LoginPanel(){
        this.setLayout(null);
        Font font = new Font("微软雅黑", Font.BOLD, 23);
        user.setFont(font);
        psw.setFont(font);
        bRegist.setText("注册");
        bLogin.setText("登录");

        bRegist.setBounds(300, 100, 100, 60);
        bLogin.setBounds(150, 100, 100, 60);
        user.setBounds(100, 0, 90, 30);
        name.setBounds(200, 0, 200, 30);
        psw.setBounds(100, 50, 90, 30);
        passwordField.setBounds(200, 50, 200, 30);
        this.add(bLogin);
        this.add(name);
        this.add(user);
        this.add(psw);
        this.add(passwordField);
        this.add(bRegist);
        addListener();
    }
    public void addListener(){
        LoginListener listener = new LoginListener();
        this.bRegist.addActionListener(listener);
        this.bLogin.addActionListener(listener);
    }
    public boolean isLogin(){
        return true;
    }

}
