package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * 用户个人信息页面
 */
public class PersonalPanel extends JPanel implements Runnable {
    public JLabel userName = new JLabel();
    public JLabel dateTime = new JLabel();
    private String name = null;
    private String date = null;
    public static PersonalPanel instance = new PersonalPanel();

    public PersonalPanel() {

    }

    @Override
    public void run() {
        this.setLayout(null);
        Font font = new Font("微软雅黑", Font.BOLD, 28);
        userName.setText("用户名:" + name);
        dateTime.setText("登陆时间:" + date);
        userName.setBounds(100, 0, 3000, 100);
        dateTime.setBounds(100, 150, 3000, 100);
        this.add(userName);
        this.add(dateTime);
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
