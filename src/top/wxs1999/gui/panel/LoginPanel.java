package top.wxs1999.gui.panel;

import Utool.UItools;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends WorkingPanel {
    public static LoginPanel instance = new LoginPanel();
    public JTextField name = new JTextField();
    public JPasswordField passwordField = new JPasswordField();
    public JLabel user = new JLabel("用户名");
    public JLabel psw = new JLabel("密码");
    public JButton bLogin = new JButton();

    public LoginPanel(){
        this.setLayout(null);

        UItools.setImageIcon(this.bLogin,"login.png","");

        user.setFont(new Font("微软雅黑", Font.BOLD, 23));
        psw.setFont(new Font("微软雅黑", Font.BOLD, 23));
        bLogin.setBounds(300,100,100,60);
        user.setBounds(0,0,90,30);
        name.setBounds(0,50,200,30);
        psw.setBounds(0,100,90,30);
        passwordField.setBounds(0,150,200,30);
        this.add(bLogin);
        this.add(name);
        this.add(user);
        this.add(psw);
        this.add(passwordField);
    }

    public void updateData(){

    }
    public void addListener(){

    }

}
