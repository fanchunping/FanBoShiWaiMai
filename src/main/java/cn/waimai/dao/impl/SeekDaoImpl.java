package cn.waimai.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.waimai.dao.BaseDao;
import cn.waimai.dao.ISeekDao;
import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.ShopInfo;

public class SeekDaoImpl implements ISeekDao{

	public List<ShopInfo> shopNameSeek(String shop_name) {
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<ShopInfo> si = null;
		Connection conn = BaseDao.getConn();
		try {
			
			String sql = "select shop_name from shopinfo where shop_name like ?";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, "%"+shop_name+"%");
			rs =pstat.executeQuery();
			if (rs.next()) {
				si.add(new ShopInfo());
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return si;
	}


	public List<FoodInfo> foodNameSeek(String food_name) {
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<FoodInfo> fi = null;
		Connection conn = BaseDao.getConn();
		
		try {
			String sql = "select food_name from foodinfo where food_name like ?";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, "%"+food_name+"%");
			rs =pstat.executeQuery();
			if (rs.next()) {
				fi.add(new FoodInfo()); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fi;
	}
	
}
