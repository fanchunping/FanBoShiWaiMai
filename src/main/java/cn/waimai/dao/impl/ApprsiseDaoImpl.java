package cn.waimai.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.waimai.dao.BaseDao;
import cn.waimai.dao.IAppraiseDao;
import cn.waimai.pojo.User_Comment;

public class ApprsiseDaoImpl implements IAppraiseDao {

	@Override
	public int addAppraise(int comment_user_id, int comment_shop_id,
			String comment_content) {
		PreparedStatement pstat = null;
	
		Connection conn = BaseDao.getConn();
		int count = -1;
		
		try {
			String sql = "insert into user_comment(comment_user_id,comment_shop_id,comment_content)values(?,?,?)";
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, comment_user_id);
			pstat.setInt(2, comment_shop_id);
			pstat.setString(3, comment_content);
			count = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int delAppraise(int comment_user_id, int comment_shop_id,
			String comment_content) {
		PreparedStatement pstat = null;
		Connection conn = BaseDao.getConn();
		int count = -1;
		
		try {
			String sql = "delete from user_comment where comment_id";
			pstat = conn.prepareStatement(sql);
			count = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int alertAppraise(int comment_user_id, int comment_shop_id,
			String comment_content) {
		PreparedStatement pstat = null;
		Connection conn = BaseDao.getConn();
		int count = -1;
		
		String sql = "";
		return 0;
	}

	@Override
	public User_Comment queryAppraise(int comment_user_id, int comment_shop_id,
			String comment_content) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
