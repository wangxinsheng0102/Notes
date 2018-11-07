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
    public static double spendReader() {
        String sql = "select * from cost_data";
        double sum = 0;
        try (Connection c = DataBaseTools.getConn(); PreparedStatement ps = c.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String user = rs.getString(1);
                String type = rs.getString(2);
                double cost = rs.getDouble(3);
                if (user.equals(gloableStatus.userName)) {
                    sum += cost;
                }
            }
            DataBaseTools.closeDataBaseLink(c, ps);
            return sum;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
//class test{
//    public static void main(String[] args0){
//        System.out.println(SpendDAO.spendReader());
//    }
//}
