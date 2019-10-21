package cn.waimai.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.waimai.dao.IShopCarDao;
import cn.waimai.pojo.UserInfo;
import cn.waimai.pojo.User_ShopCar;
import cn.waimai.dao.BaseDao;

public class ShopCarDaoImpl implements  IShopCarDao {

	@Override
	public int shopAdd(String food_name, int shopCar_num) {
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		return 0;
		
	
	}
	@Override
	public int delShop(String food_name, int shopCar_num) {
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		return 0;
	}

	@Override
	public int alterShop(String food_name, int shopCar_num) {
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		return 0;
	}

	@Override
	public User_ShopCar queryShop(int ShopCar_food_id, int shopCar_num) {
		return null;
	}

	@Override
	public User_ShopCar queryShop(String food_name,int shopCar_num) {
			Connection conn = BaseDao.getConn();
			PreparedStatement pstat = null;
			ResultSet rs = null;
			User_ShopCar ui = null;
			try {
				String sql = "select shopCar_num,food_name from user_shopCar left outer join food on food.food_id=user_shopCar.shopCar_food_id where food_name = ? and shopCar_num = ?   ";
				pstat = conn.prepareStatement(sql);
				pstat.setString(1,food_name );
				pstat.setInt(2, shopCar_num);
				rs = pstat.executeQuery();
				if(rs.next()){
					ui = new User_ShopCar();
					ui.setShopCar_food_id(rs.getInt("shopCar_food_id"));
					ui.setShopCar_num(rs.getInt("shopCar_num"));
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return ui;
	
		}
	}