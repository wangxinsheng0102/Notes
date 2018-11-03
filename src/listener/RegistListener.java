package listener;

import DAO.RegistDao;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;
import entity.Login;
import sun.applet.Main;
import top.wxs1999.gui.panel.LoginPanel;
import top.wxs1999.gui.panel.MainPanel;
import top.wxs1999.gui.panel.RegistPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistListener implements ActionListener {
    MainPanel p;
    RegistPanel rp;
    LoginPanel lp;
    JButton jb;

    @Override
    public void actionPerformed(ActionEvent e) {
        p = MainPanel.instance;
        rp = RegistPanel.instance;
        lp = LoginPanel.instance;
        jb = (JButton) e.getSource();
        String userName;
        String passWord;
        String rePassword;
        if (jb == rp.regist) {
            userName = rp.userName.getText();
            passWord = new String(rp.passwordField.getPassword());
            rePassword = new String(rp.rePasswordField.getPassword());
            if (passWord.equals(rePassword)) {
                Login regist = new Login(userName, passWord);
                RegistDao.add(regist);
                p.workingPanel.show(lp);
                System.out.println("注册成功");
            }
        }
    }
}
