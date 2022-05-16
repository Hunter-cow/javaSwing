package com.xhu.JPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    //�����ж���������
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //���������У�ʵ����Login��Ķ��󣬵��ó�ʼ������ķ���
        Login login = new Login();
        login.initUI();

    }

    //�����ж����ʼ������ķ���
    public void initUI() {
        //��initUI��ʵ����JFrame��Ķ���
        JFrame frame = new JFrame();
        //���ô�����������ֵ
        frame.setTitle("Login");//���ô������
        frame.setSize(400, 250);//���ô����С��ֻ�Զ���������Ч
        frame.setDefaultCloseOperation(3);//���ô���رղ�����3��ʾ�رմ����˳�����
        frame.setLocationRelativeTo(null);//���ô����������һ���ľ���λ�ã�����null��ʾ�����������Ļ������λ��
        frame.setResizable(false);//��ֹ���������С
        frame.setFont(new Font("微软雅黑",Font.PLAIN,14));//�������壬��ʾ��ʽ��������С

        //ʵ����FlowLayout��ʽ������Ķ���ָ�����뷽ʽΪ���ж������֮��ļ��Ϊ10������
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,10,10);
        //ʵ������ʽ������Ķ���
        frame.setLayout(fl);

        //ʵ����JLabel��ǩ���󣬸ö�����ʾ���˺š�
        JLabel labname = new JLabel("用户名：");
        labname.setFont(new Font("微软雅黑",Font.PLAIN,14));
        //��labname��ǩ��ӵ�������
        frame.add(labname);

        //ʵ����JTextField��ǩ����
        JTextField text_name = new JTextField();
        Dimension dim1 = new Dimension(300,30);
        text_name.setPreferredSize(dim1);//���ó������������������������Ĵ�С
        //��textName��ǩ��ӵ�������
        frame.add(text_name);

        //ʵ����JLabel��ǩ���󣬸ö�����ʾ�����롱
        JLabel labpass = new JLabel("  密码：");
        labpass.setFont(new Font("微软雅黑",Font.PLAIN,14));
        //��labpass��ӵ�������
        frame.add(labpass);

        //ʵ����JPasswordField
        JPasswordField text_password = new JPasswordField();
        //���ô�С
        text_password.setPreferredSize(dim1);
        //��ӵ�����
        frame.add(text_password);

        //ʵ����JButton���
        JButton button1 = new JButton();
        //���ð�������ʾ����
        Dimension dim2 = new Dimension(100,30);
        button1.setText("登录");
        button1.setFont(new Font("微软雅黑",Font.PLAIN,14));
        //���ð�����С
        button1.setSize(dim2);
        frame.add(button1);

        JButton button2 = new JButton();
        //���ð�������ʾ����
        Dimension dim3 = new Dimension(100,30);
        button2.setText("使用说明");
        button2.setFont(new Font("微软雅黑",Font.PLAIN,14));
        //���ð�����С
        button2.setSize(dim3);
        frame.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Informationabout informationabout = new Informationabout();
            }

        });

        frame.setVisible(true);//����ɼ���һ��Ҫ��������������봰���

        LoginListener ll = new LoginListener(frame,text_name,text_password);
        button1.addActionListener(ll);
    }
}