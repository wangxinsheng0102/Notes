package listener;

import top.wxs1999.gui.panel.LoginPanel;
import top.wxs1999.gui.panel.MainPanel;
import top.wxs1999.gui.panel.ReportPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarListener implements ActionListener {
    MainPanel p ;
    LoginPanel lp;
    JButton b;
    @Override
    public void actionPerformed(ActionEvent e){
        p = MainPanel.instance;
        lp = LoginPanel.instance;
        b =(JButton)e.getSource(); //获取点击按钮
        //登录后才能操作
        if(lp.isLogin()){
            if(b == lp.bLogin){
//            p.workingPanel.show();
            }else if(b == p.bReport){
                p.workingPanel.show(ReportPanel.instance);
            }else if(b == p.bSpend){

            }
        }

    }

}
