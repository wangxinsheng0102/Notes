package DAO;

import Utool.DataBaseTools;
import entity.Spend;
import gloable.gloableStatus;

import javax.swing.*;
import java.sql.*;

/**
 * 写入消费记录
 *
 * @author wxs
 */
public class SpendInnerDAO {
    public static void spendInner(Spend sp) {
        String sql = "insert into cost_data(id,type,cost,time) values(?,?,?,?)";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, gloableStatus.userName);
            ps.setString(2, sp.getType());
            ps.setDouble(3, sp.getCost());
            java.util.Date date = new java.util.Date();
            java.sql.Date s_date = new Date(date.getTime());
            ps.setDate(4, s_date);
            ps.execute();
            JOptionPane.showConfirmDialog(null, "写入成功", "Confirm",

                    JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//class test{
//    public static void main(String[] args){
//        gloableStatus.userName = "wang";
//        Spend sp = new Spend("消费",201.3);
//        Spend pp = new Spend();
//        SpendInnerDAO.spendInner(sp);
//        //pp = SpendDAO.spendReader();
//        //System.out.println(pp.getType()+" "+pp.getCost());
//    }
//}
