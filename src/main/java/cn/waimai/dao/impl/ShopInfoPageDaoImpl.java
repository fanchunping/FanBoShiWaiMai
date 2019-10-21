package cn.waimai.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.waimai.dao.BaseDao;
import cn.waimai.dao.IShopInfoPageDao;
import cn.waimai.pojo.ShopInfo;

public class ShopInfoPageDaoImpl implements IShopInfoPageDao{

	@Override
	public int getCount() {
		ResultSet rs = null;
		int count = -1;
		try {
		rs = BaseDao.getConn()
				.prepareStatement("select count(1) from shop")
				.executeQuery();
		rs.next();
		count = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<ShopInfo> getPageInfo(int index, int pageSize) {
		PreparedStatement pstat = null;
		ResultSet rs= null;
		List<ShopInfo> users = new ArrayList<ShopInfo>();
		try {
			pstat = BaseDao.getConn()
					.prepareStatement("select shop_id,shop_name from shop limit ?,?");
			pstat.setInt(1,(index-1)*pageSize);
			pstat.setInt(2,pageSize);
			rs=pstat.executeQuery();
			while (rs.next()) {
				ShopInfo ui = new ShopInfo();
				ui.setShop_id(rs.getInt("shopid"));
				ui.setShop_name(rs.getString("shopname"));
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
