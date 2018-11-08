package top.wxs1999.gui.panel;

import listener.ChangeListener;

import javax.swing.*;
import java.awt.*;

public class ChangeNewPSWPanel extends WorkingPanel {
    public static ChangeNewPSWPanel instance = new ChangeNewPSWPanel();
    public JPasswordField name = new JPasswordField();
    public JPasswordField passwordField = new JPasswordField();
    public JLabel user = new JLabel("旧密码");
    public JLabel psw = new JLabel("新密码");
    public JButton Change = new JButton();

    public ChangeNewPSWPanel() {
        this.setLayout(null);
        Font font = new Font("微软雅黑", Font.BOLD, 23);
        user.setFont(font);
        psw.setFont(font);
        Change.setText("修改密码");
        Change.setBounds(200, 100, 100, 60);
        user.setBounds(100, 0, 90, 30);
        name.setBounds(200, 0, 200, 30);
        psw.setBounds(100, 50, 90, 30);
        passwordField.setBounds(200, 50, 200, 30);
        this.add(Change);
        this.add(name);
        this.add(user);
        this.add(psw);
        this.add(passwordField);
        addListener();
    }

    @Override
    public void updateUI() {
        super.updateUI();
    }

    @Override
    public void updateData() {
        this.passwordField.setText(null);
        this.name.setText(null);
    }

    @Override
    public void addListener() {
        ChangeListener listener = new ChangeListener();
        this.Change.addActionListener(listener);
    }
}
