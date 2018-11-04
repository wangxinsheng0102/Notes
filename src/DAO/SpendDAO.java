package DAO;

import Utool.DataBaseTools;
import entity.Spend;
import gloable.gloableStatus;

import javax.xml.crypto.Data;
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
    public static Spend spendReader() {
        String sql = "select * from cost_data";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement ps = c.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String user = rs.getString(1);
                String type = rs.getString(2);
                double cost = rs.getDouble(3);
                // Data time = (Data) rs.getDate(4);
                if (user.equals(gloableStatus.userName)) {
                    Spend sp = new Spend(type, cost);
                    return sp;
                }
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
//class test{
//    public static void main(String[] args0){
//        SpendDAO.spendReader();
//    }
//}
