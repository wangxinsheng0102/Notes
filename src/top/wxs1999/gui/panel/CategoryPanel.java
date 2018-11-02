package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends JPanel {
    public static ConfigPanel instance = new ConfigPanel();
    JLabel jl = new JLabel();
    public CategoryPanel(){
        jl.setText("目录页面");
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }

}
