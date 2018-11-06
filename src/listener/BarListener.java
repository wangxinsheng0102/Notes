package listener;

import DAO.SpendDAO;
import top.wxs1999.gui.panel.*;
import gloable.gloableStatus;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 工具栏按钮监听类
 *
 * @author wxs
 */
public class BarListener implements ActionListener {
    MainPanel p ;
    JButton jb;
    boolean status;
    LoginPanel lp;

    @Override
    public void actionPerformed(ActionEvent e){

        p = MainPanel.instance;
        jb = (JButton)e.getSource();
        status = gloableStatus.isLogin;
        if (status) {
            if (jb == p.bReport) {
                p.workingPanel.show(ReportPanel.instance);
            }
            if (jb == p.bCategory) {
                p.workingPanel.show(CategoryPanel.instance);
            }
            if (jb == p.bConfig) {
                p.workingPanel.show(ConfigPanel.instance);
            }
            if (jb == p.bRecord) {
                p.workingPanel.show(RecordPanel.instance);
            }
            if (jb == p.bSpend) {
                SpendDAO read = new SpendDAO();
                read.spendReader();//绑定更新消费总额
                p.workingPanel.show(SpendPanel.instance);
            }

        }
        if (jb == p.bLogin) {//已登录,按下登陆工具栏按钮
            if (status) {
                p.workingPanel.show(PersonalPanel.instance);

            } else {
                p.workingPanel.show(LoginPanel.instance);
            }

        }

    }

}
