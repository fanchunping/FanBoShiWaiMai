package cn.waimai.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.waimai.dao.BaseDao;
import cn.waimai.dao.IFoodInfoPageDao;
import cn.waimai.dao.IShopInfoPageDao;
import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.ShopInfo;

public class FoodInfoPageDaoImpl implements IFoodInfoPageDao{

	@Override
	public int getCount() {
		ResultSet rs = null;
		int count = -1;
		try {
		rs = BaseDao.getConn()
				.prepareStatement("select count(1) from food")
				.executeQuery();
		rs.next();
		count = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<FoodInfo> getPageInfo(int index, int pageSize) {
		PreparedStatement pstat = null;
		ResultSet rs= null;
		List<FoodInfo> users = new ArrayList<FoodInfo>();
		try {
			pstat = BaseDao.getConn()
					.prepareStatement("select food_id,food_name from food limit ?,?");
			pstat.setInt(1,(index-1)*pageSize);
			pstat.setInt(2,pageSize);
			rs=pstat.executeQuery();
			while (rs.next()) {
				FoodInfo ui = new FoodInfo();
				ui.setFood_id(rs.getInt("foodid"));
				ui.setFood_name(rs.getString("foodname"));
				users.add(ui);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, pstat);
		}
		return users;
	}
	
}
