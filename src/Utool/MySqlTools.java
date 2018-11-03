package Utool;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTools {

    public static void insert(String s) throws SQLException {
        Connection connection;
        Statement statement;
        connection = DataBaseTools.getConn();
        statement = connection.createStatement();
        try {
            statement.executeUpdate("INSERT INTO user VALUES ('" + s + "','" + s.length() + "')");
        } catch (SQLException e) {
            System.out.println("已经有这个词语");
            e.printStackTrace();
        }
        try {
            statement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
