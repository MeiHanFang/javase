package com.hianiu.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 需求：查询category表中 cname是 家用电器/电脑 的记录
 * 由于 SQL注入，导致查询到了所有类别记录
 */
public class JDBCSearchDemo2 {

    public static void main(String[] args) throws Exception {
        try (
                // 获取数据库连接
                Connection conn = ConnectionUtil.getConnection();
        ) {
            query(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询
     */
    private static void query(Connection conn) {
//      String cname = "'家用电器/电脑'"; 
        // sql注入
        String cname = "'家用电器/电脑' or 1=1"; 
        // 编写SQL语句
        String sql = "select * from category where cname=" + cname;
        try (
                // 创建SQL语句的执行对象
                Statement stmt = conn.createStatement();
                // 执行SQL语句并获取结果
                ResultSet rs = stmt.executeQuery(sql);) {
            // 遍历数据
            while (rs.next()) {
                // 按照编号获取字段数据
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}