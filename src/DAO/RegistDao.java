package DAO;

import Utool.DataBaseTools;
import entity.Login;

import java.sql.*;

public class RegistDao {
    public void add(Login login) {
        String sql = "insert into myuser(username,password) values(?,?)";
        try (Connection c = DataBaseTools.getConn(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1, login.getUsername());
            ps.setString(2, login.getPassword());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//class test{
//    public static void main(String[] args){
//        RegistDao diao = new RegistDao();
//        diao.add(new Login(1,"laobai","123456"));
//    }
//}