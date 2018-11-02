package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

public class RecoverPanel extends JPanel {
    public  static RecordPanel instance = new RecordPanel();
    JLabel jl = new JLabel();
    public RecoverPanel(){
        jl.setText("恢复页面");
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }

}

