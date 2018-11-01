package Utool;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * ui工具类
 * @author wxs
 */
public class UItools {
    //设置图片文件夹
    public static  String picFolder = getAbsPath() + "/pic";
    /**
     * 获取到工程的绝对路径
     * @return  String 工程路径
     */
    public static String getAbsPath(){
        File dir = new File(".");
        try{
            String path = dir.getCanonicalPath();
            return path;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 给按钮添加图标
     * @param b
     *          按钮组件
     * @param fileName
     *          图片文件夹
     * @param tip
     *          按钮文字
     */
    public static void setImageIcon(JButton b,String fileName,String tip){
        File f =new File(picFolder,fileName);
        ImageIcon i = null;
        if(f.exists()){
            i = new ImageIcon(f.getAbsolutePath());
        }else{
            URL url = ClassLoader.getSystemResource("pic/"+fileName);
            i = new ImageIcon(url);
        }
        b.setIcon(i);
        b.setPreferredSize(new Dimension(61,81));
        b.setToolTipText(tip);//设置文字
        b.setVerticalTextPosition(3);
        b.setHorizontalTextPosition(0);
        b.setText(tip);
    }
    /**
     * 换肤
     */
    public static void useLNF() {
        try {
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (Exception e) {
            System.out.println("水晶皮肤没有找到这个包。");
            e.printStackTrace();
        }
    }
    /**
     * 显示面板
     */
    public static void showPanel(JPanel p, double stretchRate) {
        UItools.useLNF();
        JFrame f = new JFrame();
        f.setSize(500, 500);
        // f.setBackground(ColorUtil.backgroundColor);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(stretchRate);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
        cp.show(p);
    }

}
