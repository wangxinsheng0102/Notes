package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

public class BackupPanel extends JPanel {
   public static BackupPanel instance = new BackupPanel();
   JLabel jl = new JLabel();
    public BackupPanel(){
        jl.setText("备份页面");
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }
}
