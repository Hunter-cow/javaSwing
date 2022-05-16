package com.xhu.JPanels;

import javax.swing.*;
import java.awt.*;

public class Informationabout extends JFrame {

    JTextArea textarea;
    JPanel panel = new JPanel();

    public Informationabout() {
        this.setSize(500, 500);
        this.setTitle("软件使用说明");
        this.setLocation(700, 200);
        this.setVisible(true);
        this.setLayout(null);

        this.init();
    }

    private void init() {

        textarea = new JTextArea(15, 25);
        textarea.setText("本软件的开发者为魏丽梅、冯毅、钟平洋、胡蝶、蒋香凝和罗梁珲同学。" + "\n" + "本软件的特色是在口罩生产管理系统的基础上实现了链表的动态存储" + "\n"
                + "该软件有增删查改的功能。" + "\n" + "该软件的使用并不复杂，输入有误即可提示。");

        textarea.setLineWrap(true);    //�����ı����е��ı�Ϊ�Զ�����
        textarea.setForeground(Color.BLACK);    //��������ı���ɫ
        textarea.setFont(new Font("����", Font.BOLD, 16));    //�޸�������ʽ
        textarea.setBackground(Color.WHITE);    //���ð�ť����ɫ
        JScrollPane jsp = new JScrollPane(textarea);    //���ı�������������

        Dimension size = textarea.getPreferredSize();    //����ı������ѡ��С
        panel.add(textarea);
        this.setContentPane(panel);

    }
}
