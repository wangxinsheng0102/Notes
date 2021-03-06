package top.wxs1999.gui.panel;

import Utool.CenterPanel;
import Utool.DataBaseTools;
import Utool.UItools;
import listener.BarListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.BorderLayout;
/**
 * 主页面
 */
public class MainPanel extends JPanel {
    static {
        UItools.useLNF();
    }
    public JToolBar tb = new JToolBar();
    public JButton bSpend = new JButton();
    public JButton bRecord = new JButton();
    public JButton bCategory = new JButton();
    public JButton bReport = new JButton();
    public JButton bConfig = new JButton();
    public JButton bBackup = new JButton();
    public JButton bRecover = new JButton();
    public JButton bLogin = new JButton();
    public CenterPanel workingPanel;

    public static MainPanel instance = new MainPanel();
    private MainPanel(){
        UItools.setImageIcon(this.bLogin, "login.png", "登录");
        UItools.setImageIcon(this.bSpend, "home.png", "消费一览");
        UItools.setImageIcon(this.bRecord, "record.png", "记一笔");
        UItools.setImageIcon(this.bCategory, "category2.png", "消费分类");
        UItools.setImageIcon(this.bReport, "report.png", "月消费报表");
        UItools.setImageIcon(this.bConfig, "config.png", "删除记录");
        // 把按钮添加到工具栏上
        this.tb.add(this.bLogin);
        this.tb.add(this.bSpend);
        this.tb.add(this.bRecord);
        this.tb.add(this.bCategory);
        this.tb.add(this.bReport);
        this.tb.add(this.bConfig);
        this.tb.setFloatable(false); // 工具栏固定位置
        this.workingPanel = new CenterPanel(0.8D);//设定工作区域
        setLayout(new BorderLayout());
        add(this.tb, BorderLayout.NORTH);
        add(this.workingPanel, BorderLayout.CENTER);
        addListener();
    }

    public void addListener(){
        BarListener listener = new BarListener();
        this.bReport.addActionListener(listener);
        this.bRecord.addActionListener(listener);
        this.bBackup.addActionListener(listener);
        this.bCategory.addActionListener(listener);
        this.bConfig.addActionListener(listener);
        this.bRecover.addActionListener(listener);
        this.bSpend.addActionListener(listener);
        this.bLogin.addActionListener(listener);
    }
}
