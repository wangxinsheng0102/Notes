package DAO;

import Utool.DataBaseTools;
import entity.Spend;
import gloable.gloableStatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 读取消费记录
 *
 * @author wxs
 */
public class SpendDAO {
    public void spendReader() {
        String sql = "select * from cost_data";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement ps = c.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String user = rs.getString(1);
                String type = rs.getString(2);
                double cost = rs.getDouble(3);
                if (user.equals(gloableStatus.userName)) {
                    gloableStatus.sum += cost;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//class test{
//    public static void main(String[] args0){
//        System.out.println(SpendDAO.spendReader());
//    }
//}
