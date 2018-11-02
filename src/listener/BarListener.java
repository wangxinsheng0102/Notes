package listener;

import top.wxs1999.gui.panel.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarListener implements ActionListener {
    MainPanel p ;
    JButton jb;
    LoginPanel lp;
    @Override
    public void actionPerformed(ActionEvent e){

       p = MainPanel.instance;
       jb = (JButton)e.getSource();
        if(jb == p.bReport){
            p.workingPanel.show(ReportPanel.instance);
        }
        if(jb == p.bBackup){
            p.workingPanel.show(BackupPanel.instance);
        }
        if(jb == p.bCategory){
            p.workingPanel.show(CategoryPanel.instance);
        }
        if(jb == p.bConfig){
            p.workingPanel.show(ConfigPanel.instance);
        }
        if(jb == p.bRecord){
            p.workingPanel.show(RecordPanel.instance);
        }
        if(jb == p.bRecover){
            p.workingPanel.show(RecoverPanel.instance);
        }
        if(jb == p.bSpend){
            p.workingPanel.show(SpendPanel.instance);
        }
        if(jb == p.bLogin){
            p.workingPanel.show(LoginPanel.instance);
        }
    }

}
