package Utool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类
 */
public class DataBaseTools {
    static String ip = "120.78.156.16";
    static int port = 3306;
    static String database = "user";
    static String encoding = "UTF-8";
    static String loginName = "wangxinsheng";
    static String password = "123456";
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("驱动加载成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    /**
     * 获取链接
     */
    public static Connection getConn(){
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        try {
            return DriverManager.getConnection(url, loginName, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sorry,连接失败");
        }
        return null;
    }
}
