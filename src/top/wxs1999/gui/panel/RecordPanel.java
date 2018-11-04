package top.wxs1999.gui.panel;

import javax.swing.*;
import java.awt.*;

public class RecordPanel extends JPanel{
    public JTextField cost = new JTextField();
    JComboBox types = new JComboBox();//下拉选择消费类型
    JLabel l2 = new JLabel("消费金额");
    public static RecordPanel instance = new RecordPanel();
    JLabel jl = new JLabel();
    public RecordPanel(){
        this.setLayout(null);
        jl.setText("用途");
        types.addItem("娱乐");
        types.addItem("餐饮");
        types.addItem("服务");
        types.addItem("购物");
        types.addItem("其它");
        types.setBounds(0, 100, 100, 40);
        l2.setFont(new Font("微软雅黑", Font.BOLD, 23));
        l2.setBounds(255, 0, 100, 100);
        cost.setBounds(255, 120, 300, 40);
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jl.setBounds(0, 0, 100, 100);
        this.add(jl);
        this.add(types);
        this.add(l2);
        this.add(cost);
    }
}
