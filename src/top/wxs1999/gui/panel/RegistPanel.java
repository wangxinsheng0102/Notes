package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

public class RegistPanel extends JPanel {
    JLabel jl1 = new JLabel("账号");
    JLabel jl2 = new JLabel("密码");
    JLabel jl3 = new JLabel("重复密码");
    JTextField userName = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField rePasswordField = new JPasswordField();
    public static RegistPanel instance = new RegistPanel();

    public RegistPanel() {
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl1.setBounds(0, 0, 20, 20);
        this.add(jl1);
    }


}
