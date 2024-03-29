package com.tedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/** Jdbc的快速入门程序
 */
public class JdbcDemo1 {
	public static void main(String[] args) throws Exception {
		//1.注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取数据库连接
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql:///jt_db?characterEncoding=utf-8", 
				"root", "root");
		//3.获取传输器
		Statement stat = conn.createStatement();
		//4.发送sql到服务器执行,并返回结果
		String sql = "select * from account";
		ResultSet rs = stat.executeQuery(sql);
		//5.处理结果(打印到控制台)
		while ( rs.next() ) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double money = rs.getDouble("money");
			System.out.println(
					id+" : "+name+" : "+money );
		}
		//6.释放资源
		rs.close();
		stat.close();
		conn.close();
		System.out.println("JdbcDemo1.main()");
	}
}

