package com.xhz.name;


import javax.swing.*;
import java.awt.*;

/**
 * Created by zhaoqiang on 2017/5/16.
 */
public class GetName extends JFrame{
    public static void main(String[] args) {
        new GetName().setVisible(true);
    }

    private JButton btn;
    private JLabel jLabel;
    private String[] names = new String[]{"裴伟华", "陈梦轩", "宋宝春", "曹阳", "张泽亚", "任耀文", "张磊", "李涛", "孙鹏"
            , "刘敏文", "左从林","宋一平","韩君帅","赵强","刘江","李亚红","李晓","马永淋","杨建宁","罗志泽"};


    public GetName() throws HeadlessException {
        super("选择一个名字");

        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        buildUI();
        addListeners();
    }

    private void buildUI() {
        btn = new JButton("选择名字");
        btn.setSize(120, 30);
        add(btn);
        jLabel = new JLabel();
        jLabel.setSize(200, 30);
        jLabel.setLocation(0, 35);
        add(jLabel);
    }

    private void addListeners() {
        // btn.addActionListener(e -> JOptionPane.showMessageDialog(Main.this," 按钮被点击了"));
        btn.addActionListener(e -> {
            int index = (int) (Math.random() *names.length);
            jLabel.setText(names[index]);
        });
    }
}
