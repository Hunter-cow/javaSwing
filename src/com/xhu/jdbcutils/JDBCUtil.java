package com.xhu.jdbcutils;

import java.io.FileInputStream;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    private static String Driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getClassLoader()
                    .getResourceAsStream("proper.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            Driver = properties.getProperty("driver");
            url = properties.getProperty("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("驱动加载失败");
        }
        try {
//            System.out.println("url="+url);
//            System.out.println("user="+user);
//            System.out.println("password="+password);
            connection  = DriverManager.getConnection(url,user,password);
            System.out.println("成功得到连接~");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}
