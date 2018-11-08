package top.wxs1999.gui.panel;

import Utool.UItools;
import listener.PersonListener;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * 用户个人信息页面
 */
public class PersonalPanel extends WorkingPanel {
    public JLabel userName = new JLabel();
    public JLabel dateTime = new JLabel();
    public JButton bLoginOut = new JButton();
    public JLabel la = new JLabel();
    public JButton bCahnge = new JButton();
    private String name = null;
    private String date = null;
    public static PersonalPanel instance = new PersonalPanel();

    public PersonalPanel() {
        this.setLayout(null);
        Font font = new Font("微软雅黑", Font.BOLD, 18);
        userName.setText("用户名:" + name);
        userName.setFont(font);
        bLoginOut.setText("退出登陆");
        bCahnge.setText("修改密码");
        bCahnge.setBounds(150, 100, 100, 20);
        bLoginOut.setBackground(Color.darkGray);
        bLoginOut.setBounds(0, 100, 100, 20);
        dateTime.setText("登陆时间:" + date);
        dateTime.setFont(font);
        userName.setBounds(0, 0, 300, 100);
        dateTime.setBounds(0, 30, 3000, 100);
        this.add(userName);
        this.add(dateTime);
        this.add(bLoginOut);
        this.add(bCahnge);
        addListener();
    }

    @Override
    public void updateUI() {
        super.updateUI();
    }

    @Override
    public void updateData() {
        userName.setText("用户名:" + name);
        dateTime.setText("登陆时间:" + date);
    }

    @Override
    public void addListener() {
        PersonListener listener = new PersonListener();
        bLoginOut.addActionListener(listener);
        bCahnge.addActionListener(listener);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
