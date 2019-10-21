package cn.waimai.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.waimai.dao.BaseDao;
import cn.waimai.dao.IAddressDao;
import cn.waimai.pojo.UserInfo;

public class AddressDaoImpl implements IAddressDao{

	@Override
	public int AddAddress(String provice, String city, String district, String address) {
		PreparedStatement stat = null;
		int count = -1;
		try {
			String sql="insert into site(????1,????2,...) values(String provice, String city, String district, String address)";
			//??????????
			stat = BaseDao.getConn().prepareStatement(sql);
			stat.setString(1, provice);
			stat.setString(2, city);
			stat.setString(3, district);
			stat.setString(4, address);
			count = stat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, stat);
		}
		return count;
	}

	@Override
	public int DelAddress(String provice, String city, String district, String address) {
		PreparedStatement stat = null;
		int count = -1;
		try {
			String sql="delete from ???? where ????=?";
			//??????????
			stat = BaseDao.getConn().prepareStatement(sql);
			stat.setString(1, provice);
			stat.setString(2, city);
			stat.setString(3, district);
			stat.setString(4, address);
			count = stat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, stat);
		}
		return count;
	}

	@Override
	public int AlertAddress(String provice, String city, String district, String address) {
		PreparedStatement stat = null;
		int count = -1;
		try {
			String sql="update ???? set ???? = ? where ???? = ?";
			//??????????
			stat = BaseDao.getConn().prepareStatement(sql);
			stat.setString(1, provice);
			stat.setString(2, city);
			stat.setString(3, district);
			stat.setString(4, address);
			count = stat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, stat);
		}
		return count;

	}

	@Override
	public UserInfo QueryAddress(String provice, String city, String district, String address) {
		PreparedStatement stat = null;
		ResultSet rs = null;
		UserInfo ui = null;
		try {
			String sql="select ????  from ???? = ?";
			//??????????
			stat = BaseDao.getConn().prepareStatement(sql);
			stat.setString(1, provice);
			stat.setString(2, city);
			stat.setString(3, district);
			stat.setString(4, address);
			rs = stat.executeQuery();
			if (rs.next()) {
				ui = new UserInfo();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, stat);
		}
		return ui;

	}

}
