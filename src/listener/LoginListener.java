package listener;

import top.wxs1999.gui.panel.LoginPanel;
import top.wxs1999.gui.panel.MainPanel;
import top.wxs1999.gui.panel.RegistPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {
    LoginPanel lp;
    MainPanel p;
    JButton jb;

    @Override
    public void actionPerformed(ActionEvent e) {
        p = MainPanel.instance;
        lp = LoginPanel.instance;
        jb = (JButton) e.getSource();
        if (jb == lp.bRegist) {
            p.workingPanel.show(RegistPanel.instance);
        }
    }
}
