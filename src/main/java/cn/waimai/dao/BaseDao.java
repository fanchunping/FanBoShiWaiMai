package cn.waimai.dao;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDao {
	public static Connection getConn() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/news");
			conn = ds.getConnection();
		} catch (SQLException exception) {
			exception.printStackTrace();
		} catch (NamingException namingException){
			namingException.printStackTrace();
		}
		return conn;
	}

	public static void closeAll(Object o, PreparedStatement stat) {
	}
}


