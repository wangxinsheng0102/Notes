package listener;

import DAO.SpendInnerDAO;
import entity.Spend;
import top.wxs1999.gui.panel.RecordPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecordListener implements ActionListener {
    RecordPanel rl;
    JButton jb;

    @Override
    public void actionPerformed(ActionEvent e) {
        jb = (JButton) e.getSource();
        rl = RecordPanel.instance;
        if (jb == rl.bRecord) {
            Spend item = new Spend();
            item.setCost(Double.valueOf(rl.cost.getText()));
            item.setType(rl.types.getSelectedItem().toString());
            SpendInnerDAO.spendInner(item);
        }
    }
}
