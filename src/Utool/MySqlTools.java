package Utool;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * mysql工具类
 */
public class MySqlTools {
    /**
     * 初始化数据库时区为东八区
     */
    public static void setTimeZone() {
        String sql = "set global time_zone = '+8:00';";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement pst = c.prepareStatement(sql);) {
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
