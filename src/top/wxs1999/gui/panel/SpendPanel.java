package top.wxs1999.gui.panel;
import DAO.SpendDAO;
import entity.Spend;
import gloable.gloableStatus;

import javax.swing.*;
import java.awt.*;
/**
 * 消费一览
 */
public class SpendPanel extends WorkingPanel {
    private double sum = 0;
    public static SpendPanel instance = new SpendPanel();
    JLabel jl = new JLabel();
    public SpendPanel(){
        sum = SpendDAO.spendReader();
        if (sum != 0) {
            jl.setText("总计消费" + sum);
        } else {
            jl.setText("无数据");
        }
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0,0,300,300);
        this.add(jl);
    }

    @Override
    public void updateData() {
        double sum = SpendDAO.spendReader();
        if (sum != 0) {
            jl.setText("总计消费" + sum);
        } else {
            jl.setText("无数据");
        }
        addListener();
    }

    @Override
    public void addListener() {

    }


}
