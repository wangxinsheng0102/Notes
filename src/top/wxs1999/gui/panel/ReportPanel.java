package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * 月报表
 */
public class ReportPanel extends JPanel {
    public static ReportPanel instance = new ReportPanel();
    JLabel jl = new JLabel();
    public ReportPanel(){
        jl.setText("月消费报表页面");
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }

}

