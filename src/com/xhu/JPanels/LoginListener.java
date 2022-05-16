package com.xhu.JPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener{
    private JTextField text_name;
    private JPasswordField text_password;
    private JFrame login;

    public LoginListener(JFrame login, JTextField text_name, JPasswordField text_password)
    {//��ȡ��¼���桢�˺�������������
        this.login=login;
        this.text_name=text_name;
        this.text_password=text_password;
    }

    int i=3;//3�ε�¼����

    public void actionPerformed(ActionEvent e)
    {
        Dimension dim2 = new Dimension(100,30);
        Dimension dim3 = new Dimension(300,30);

        //�����½���
        JFrame login2 = new JFrame();
        login2.setSize(400,200);
        login2.setDefaultCloseOperation(3);
        login2.setLocationRelativeTo(null);
        login2.setFont(new Font("����",Font.PLAIN,14));
        //�������
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();

        if(text_name.getText().equals("admit") && text_password.getText().equals("12345"))
        {
            JLabel message = new JLabel("登录成功");
            message.setFont(new Font("微软雅黑",Font.PLAIN,14));
            message.setPreferredSize(dim3);
            jp1.add(message);
            login2.add(jp1,BorderLayout.CENTER);

            login2.setResizable(false);
            login2.setVisible(true);
            login2.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            login.dispose();
            myFrame myframe = new myFrame();
            myframe.setVisible(true);
            myframe.setLocationRelativeTo(null);
            myframe.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            login2.dispose();


        }

        else if(i>=2)
        {
            JLabel message = new JLabel("登录失败，今日剩余次数"+(i-1)+"次");
            message.setFont(new Font("微软雅黑",Font.PLAIN,14));
            message.setPreferredSize(dim3);
            //��textName��ǩ��ӵ�������
            jp1.add(message);
            login2.add(jp1,BorderLayout.CENTER);

            JButton close = new JButton("关闭");
            close.setFont(new Font("微软雅黑",Font.PLAIN,14));
            //���ð�����С
            close.setSize(dim3);
            jp2.add(close);
            login2.add(jp2,BorderLayout.SOUTH);

            i--;//��������
            close.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    login2.dispose();
                }
            });

            login2.setResizable(false);
            login2.setVisible(true);
        }

        else if(i == 1)
        {
            JLabel message = new JLabel("账户已锁定，请联系管理员");
            message.setFont(new Font("����",Font.PLAIN,14));
            message.setPreferredSize(dim3);
            //��textName��ǩ��ӵ�������
            jp1.add(message);
            login2.add(jp1,BorderLayout.CENTER);

            JButton close = new JButton("关闭");
            close.setFont(new Font("微软雅黑",Font.PLAIN,14));
            //���ð�����С
            close.setSize(dim3);
            jp2.add(close);
            login2.add(jp2,BorderLayout.SOUTH);

            close.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    login2.dispose();
                }
            });

            login2.setResizable(false);
            login2.setVisible(true);

            //��dispose�����ر���
            login.dispose();
        }
    }
}