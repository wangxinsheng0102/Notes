package gloable;

/**
 * 全局状态类表示是否登陆，控制访问页面
 *
 * @author wxs
 */
public class gloableStatus {
    public static gloableStatus instance = new gloableStatus();
    public static boolean isLogin = false;

}
