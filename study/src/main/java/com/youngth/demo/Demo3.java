package com.youngth.demo;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * @author YoungTH
 * @date 2019/7/25
 * 流式布局
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //创建顶层容器
        JFrame jFrame = new JFrame("流式布局Demo");
        //通过当前类加载其获取图片
        URL url =Thread.currentThread().getContextClassLoader().getResource("image/self.png");
        BufferedImage img = ImageIO.read(url);
        jFrame.setIconImage(img);
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);

        //创建中间件面板 使用流式布局
        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JButton jButton1 = new JButton("按钮01");
        JButton jButton2 = new JButton("按钮02");
        JButton jButton3 = new JButton("按钮03");
        JButton jButton4 = new JButton("按钮04");
        JButton jButton5 = new JButton("按钮05");

        jButton1.addActionListener(e -> {
            jPanel.remove(jButton1);
            jPanel.updateUI();//根据最新布局  重新画一遍
//            jPanel.repaint();//不改变布局
        });


        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
