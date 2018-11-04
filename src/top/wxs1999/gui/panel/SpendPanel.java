package top.wxs1999.gui.panel;

import DAO.SpendDAO;
import entity.Spend;

import javax.swing.*;
import java.awt.*;

/**
 * 消费一览
 */
public class SpendPanel extends JPanel {
    public static SpendPanel instance = new SpendPanel();
    JLabel jl = new JLabel();
    public SpendPanel(){
        Spend sp = SpendDAO.spendReader();
        if (sp != null) {
            jl.setText(sp.getType() + " " + sp.getCost());
        } else {
            jl.setText("无数据");
        }

        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }
}
