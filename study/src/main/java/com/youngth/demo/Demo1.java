package com.youngth.demo;

import javax.swing.*;
import java.awt.*;

/**
 * @author zys
 * @date 2019-07-23
 */
public class Demo1 {

    public static void main(String[] args) {
        //顶层容器
        JFrame jFrame = new JFrame("测试窗口");
        //设置宽高
        jFrame.setSize(300,300);
        //设置窗口关闭时的操作
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /**
         * 设置窗口的相对位置。
         * 如果 comp 整个显示区域在屏幕内, 则将窗口放置到 comp 的中心;
         * 如果 comp 显示区域有部分不在屏幕内, 则将该窗口放置在最接近 comp 中心的一侧;
         * comp 为 null, 表示将窗口放置到屏幕中心。
         */
        jFrame.setLocationRelativeTo(null);

        //中间件容器
        JPanel jPanel = new JPanel();

        //创建按钮
        JButton jButton = new JButton("我是按钮");

        jPanel.add(jButton);
        jFrame.setContentPane(jPanel);

        // 5. 显示窗口，前面创建的信息都在内存中，通过 jf.setVisible(true) 把内存中的窗口显示在屏幕上。
        jFrame.setVisible(true);
    }
}
