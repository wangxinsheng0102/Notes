package top.wxs1999.gui.frame;

import sun.applet.Main;
import top.wxs1999.gui.panel.LoginPanel;
import top.wxs1999.gui.panel.MainPanel;

import javax.swing.*;

public class MainFrame extends JFrame {

    public static MainFrame instance = new MainFrame();

    private MainFrame(){
        this.setSize(700,400);//设置长高
        this.setTitle("记账本");//设置标题
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);//设置为无法被修改大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认退出方式
    }

}
class Test {
    public static void main(String[] args){
        MainFrame.instance.setVisible(true);
        MainPanel.instance.workingPanel.show(LoginPanel.instance);

    }
}