package Utool;

import java.sql.*;

/**
 * 数据库工具类
 */
public class DataBaseTools {
    static String ip = "localhost";
    static int port = 3306;
    static String database = "user";
    static String encoding = "UTF-8";
    static String loginName = "root";
    static String password = "818923";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("加载驱动成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取链接
     */
    public static Connection getConn(){
        // Class.forName("com.mysql.jdbc.Driver");
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        try {
            //System.out.println("连接成功！");
            return DriverManager.getConnection(url, loginName, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sorry,连接失败");
        }
        return null;
    }

    /**
     * 关闭数据库连接
     */
    public static void closeDataBaseLink(Connection connection, PreparedStatement pst) {
        try {
            connection.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}