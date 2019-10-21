package cn.waimai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.waimai.dao.BaseDao;

public class BaseDao {
	private String url = "jdbc:mysql://localhost:3306/hehe";
	private String dbName = "root";
	private String dbPwd = "root";
	private static Connection conn = null;
	
	private BaseDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbName, dbPwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		if(conn == null)
			new BaseDao();
		
		return conn;
	}
	
	public static void closeAll(ResultSet rs, Statement stat){
		try {
			if(rs != null)
				rs.close();
			if(stat != null)
				stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

