package com.hianiu.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 驱动管理器
        String url = "jdbc:mysql://11.147.251.93:3306/my_database?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";
        Connection connection = DriverManager.getConnection(url, username, password);

        // 通过连接获取执行对象
        Statement statement = connection.createStatement();

        // sql语句
        String sql = "select cid, cname from category";

        // 执行操作
        ResultSet resultSet = statement.executeQuery(sql);

        // 创建集合
        ArrayList<Category> list = new ArrayList<>();

        // 处理结果集
        while (resultSet.next()){
            int cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");

            // 封装成对象
            Category category = new Category(cid,cname);

            // 存入集合
            list.add(category);
        }

        //遍历集合
        for (Category category : list) {
            System.out.println(category);
        }

        //释放资源
        connection.close();

    }
}
