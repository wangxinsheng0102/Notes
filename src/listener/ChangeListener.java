package listener;

import DAO.ChangePswDAO;
import gloable.gloableStatus;
import top.wxs1999.gui.panel.ChangeNewPSWPanel;
import top.wxs1999.gui.panel.LoginPanel;
import top.wxs1999.gui.panel.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 修改密码按钮监听类
 *
 * @author wxs
 */
public class ChangeListener implements ActionListener {
    MainPanel p;
    ChangeNewPSWPanel cp;
    JButton jb;

    @Override
    public void actionPerformed(ActionEvent e) {
        p = MainPanel.instance;
        cp = ChangeNewPSWPanel.instance;
        jb = (JButton) e.getSource();
        if (jb == cp.Change) {
            String newPsw, oldPsw;
            newPsw = new String(cp.passwordField.getPassword());
            oldPsw = new String(cp.name.getPassword());

            if (oldPsw.equals(gloableStatus.psw)) {
                ChangePswDAO.Change(newPsw);
                JOptionPane.showConfirmDialog(null, "修改成功", "Confirm",

                        JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                gloableStatus.isLogin = false;
                gloableStatus.userName = null;
                gloableStatus.psw = null;
                p.workingPanel.show(LoginPanel.instance);
            } else {
                JOptionPane.showConfirmDialog(null, "旧密码错误", "Confirm",

                        JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                p.workingPanel.show(ChangeNewPSWPanel.instance);
            }

        }
    }
}
