package listener;

import DAO.LoginDao;
import entity.Login;
import org.jdesktop.swingx.renderer.StringValue;
import top.wxs1999.gui.panel.*;
import gloable.gloableStatus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.SimpleTimeZone;

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
        if (jb == lp.bLogin) {
            Login lg = new Login();
            String userName = lp.name.getText();
            String password = new String(lp.passwordField.getPassword());
            lg.setUsername(userName);
            lg.setPassword(password);
            if (LoginDao.login(lg)) {
                gloableStatus.userName = userName;
                Date date = new Date();
                System.out.println("登陆成功");
                JOptionPane.showConfirmDialog(null, "登陆成功", "Confirm",

                        JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                gloableStatus.isLogin = true;
                PersonalPanel.instance.setName(userName);
                PersonalPanel.instance.setDate(String.valueOf(date));
                PersonalPanel.instance.run();
                p.workingPanel.show(PersonalPanel.instance);
            }
        }
    }
}
