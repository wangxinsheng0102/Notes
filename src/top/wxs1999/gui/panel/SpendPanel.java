package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * 消费一览
 */
public class SpendPanel extends JPanel {
    public static SpendPanel instance = new SpendPanel();
    JLabel jl = new JLabel();
    public SpendPanel(){
        jl.setText("消费一览界面");
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }
}
