package listener;

import gloable.gloableStatus;
import sun.applet.Main;
import top.wxs1999.gui.panel.LoginPanel;
import top.wxs1999.gui.panel.MainPanel;
import top.wxs1999.gui.panel.PersonalPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonListener implements ActionListener {
    MainPanel p;
    PersonalPanel pp;
    JButton jb;

    @Override
    public void actionPerformed(ActionEvent e) {
        p = MainPanel.instance;
        pp = PersonalPanel.instance;
        jb = (JButton) e.getSource();
        if (jb == pp.bLoginOut) {
            gloableStatus.isLogin = false;
            gloableStatus.userName = null;
            p.workingPanel.show(LoginPanel.instance);
        }
    }
}