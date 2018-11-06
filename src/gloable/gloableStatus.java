package gloable;

/**
 * 全局状态类表示是否登陆，控制访问页面
 *
 * @author wxs
 */
public class gloableStatus {
    public static gloableStatus instance = new gloableStatus();
    public static boolean isLogin = false;//当前账户状态
    public static String userName = null;//当前的账户
    public static double sum = 0;//当前账户总消费

}
