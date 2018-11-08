package DAO;

import Utool.DataBaseTools;
import com.mysql.cj.xdevapi.SqlDataResult;
import entity.Login;
import gloable.gloableStatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 修改密码数据库操作类
 *
 * @author wangx
 */
public class ChangePswDAO {
    public static void Change(String psw) {
        String sql = "UPDATE  myuser   SET password= ? WHERE username = ?";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement pst = c.prepareStatement(sql);) {
            pst.setString(1, psw);
            pst.setString(2, gloableStatus.userName);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//class test{
//    public static void main(String[] args){
//        gloableStatus.userName = "wang";
//        ChangePswDAO.Change("qqq");
//    }
//}
