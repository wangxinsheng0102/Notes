package top.wxs1999.gui.panel;

import Utool.CenterPanel;
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
    public JToolBar tb = new JToolBar();
    public JButton bSpend = new JButton();
    public JButton bRecord = new JButton();
    public JButton bCategory = new JButton();
    public JButton bReport = new JButton();
    public JButton bConfig = new JButton();
    public JButton bBackup = new JButton();
    public JButton bRecover = new JButton();
    public CenterPanel workingPanel;

    public static MainPanel instance = new MainPanel();
    private MainPanel(){
        UItools.setImageIcon(this.bSpend, "home.png", "消费一览");
        UItools.setImageIcon(this.bRecord, "record.png", "记一笔");
        UItools.setImageIcon(this.bCategory, "category2.png", "消费分类");
        UItools.setImageIcon(this.bReport, "report.png", "月消费报表");
        UItools.setImageIcon(this.bConfig, "config.png", "设置");
        UItools.setImageIcon(this.bBackup, "backup.png", "备份");
        UItools.setImageIcon(this.bRecover, "restore.png", "恢复");
        // 把按钮添加到工具栏上
        this.tb.add(this.bSpend);
        this.tb.add(this.bRecord);
        this.tb.add(this.bCategory);
        this.tb.add(this.bReport);
        this.tb.add(this.bConfig);
        this.tb.add(this.bBackup);
        this.tb.add(this.bRecover);
        this.tb.setFloatable(false); // 工具栏固定位置
        this.workingPanel = new CenterPanel(0.8D);

        setLayout(new BorderLayout());
        add(this.tb, BorderLayout.NORTH);
        add(this.workingPanel, BorderLayout.CENTER);

        addListener();
    }
    public String myPath(String path){
        return "/home/wangxinsheng/记事本/pic/"+path+".png/";
    }
    public void addListener(){
        BarListener listener = new BarListener();
        this.bReport.addActionListener(listener);
    }

}
