package top.wxs1999.gui.panel;


import DAO.SpendDAO;
import entity.Spend;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * 删除数据类
 *
 * @author wangx
 */
public class deleteDataPanel extends WorkingPanel {
    public static deleteDataPanel instance = new deleteDataPanel();
    JLabel jl = new JLabel();

    public deleteDataPanel() {
        this.setLayout(null);
        ArrayList<Spend> sList = new ArrayList<Spend>();
        ArrayList<JLabel> listLabel = new ArrayList<JLabel>();
        sList = SpendDAO.spendReader();
        String text = null;
        for (Spend e : sList) {
            listLabel.add(new JLabel("类型: " + e.getType() + ",   消费金额：" + e.getCost()));
        }
        Font font = new Font("微软雅黑", Font.PLAIN, 18);
        int x = 0, y = 0;
        for (JLabel e : listLabel) {
            e.setFont(font);
            e.setBounds(x, y, 700, 18);
            y += 23;
            this.add(e);
        }
    }

    @Override
    public void updateUI() {
        super.updateUI();
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {

    }
}
