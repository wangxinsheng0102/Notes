package top.wxs1999.gui.panel;
import DAO.SpendDAO;
import entity.Spend;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * 消费一览
 */
public class SpendPanel extends WorkingPanel {
    private double sum = 0;
    public static SpendPanel instance = new SpendPanel();
    JLabel jl = new JLabel();
    ChartFrame chartFrame;
    public SpendPanel(){
        this.setLayout(new BorderLayout());
        ArrayList<Spend> Slist = SpendDAO.spendReader();
        ChartPanel chartPanel = getChart();
        for (Spend e : Slist) {
            sum += e.getCost();
        }
        if (sum != 0) {
            jl.setText("总计消费：" + sum);
        } else {
            jl.setText("无数据");
        }
        jl.setFont(new Font("微软雅黑", Font.BOLD, 23));
        this.add(jl, BorderLayout.NORTH);
        this.add(chartPanel, BorderLayout.CENTER);
        chartPanel.repaint();
    }
    @Override
    public void updateData() {
        ArrayList<Spend> Slist = SpendDAO.spendReader();
        ChartPanel chartPanel = getChart();
        sum = 0;
        for (Spend e : Slist) {
            sum += e.getCost();
        }
        if (sum != 0) {
            jl.setText("总计消费" + sum);
        } else {
            jl.setText("无数据");
        }
        chartPanel.updateUI();
        chartPanel.revalidate();
        chartPanel.repaint();
        addListener();
    }
    @Override
    public void addListener() {

    }

    public ChartPanel getChart() {
        ArrayList<Spend> Slist = SpendDAO.spendReader();
        //获得数据集
        DefaultPieDataset df = getDataSet(Slist);
        //创建3D饼图
        JFreeChart chart = ChartFactory.createPieChart("消费分类统计图", df, true, true, false);
        //设置图片背景色
        chart.setBackgroundPaint(Color.white);
        //取得3D饼图对象
        PiePlot plot = (PiePlot) chart.getPlot();
        //指定显示的饼图上圆形(false)还椭圆形(true)
        plot.setCircular(true);
        //设置图形边框颜色
        plot.setBaseSectionOutlinePaint(Color.red);
        // 图形边框粗细
        plot.setBaseSectionOutlineStroke(new BasicStroke(0.7f));
        //设置旋转角度
        plot.setStartAngle(290);
        //设置旋转方向
        plot.setDirection(Rotation.CLOCKWISE);
        //设置透明度
        plot.setForegroundAlpha(0.9f);
        //设置标题字体
        chart.getTitle().setFont(new Font("宋体", Font.BOLD, 25));
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 20));
        plot.setLabelFont((new Font("宋体", Font.PLAIN, 20)));
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setFont(new Font("宋体", Font.BOLD, 20));
        return chartPanel;
    }

    public DefaultPieDataset getDataSet(ArrayList<Spend> sList) {
        DefaultPieDataset df = new DefaultPieDataset();
        for (Spend e : sList) {
            df.setValue(e.getType(), e.getCost());
        }
        return df;
    }
}
