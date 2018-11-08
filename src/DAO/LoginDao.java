package DAO;

import Utool.DataBaseTools;
import entity.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 查询验证用户名和密码是否一致
 *
 * @author wangx
 */
public class LoginDao {
    public static boolean login(Login lg) {
        String sql = "select * from myuser";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement ps = c.prepareStatement(sql);) {
            ResultSet ret = ps.executeQuery();
            while (ret.next()) {
                String userName = ret.getString(1);//获取用户名和密码
                String password = ret.getString(2);
                if (userName.equals(lg.getUsername())) {//查询是否相等
                    if (password.equals(lg.getPassword())) {
                        c.close();
                        ps.close();
                        return true;//用户名和密码一致返回真
                    }
                }
            }
            c.close();
            ps.close();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
