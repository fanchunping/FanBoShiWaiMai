package cn.waimai.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.waimai.dao.impl.SeekDaoImpl;
import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.ShopInfo;
import cn.waimai.service.ISeekService;

public class SeekServiceImpl implements ISeekService{
	SeekDaoImpl sdi = new SeekDaoImpl();
	@Override
	public List<ShopInfo> shopNameSeek(String shop_name) {
		List<ShopInfo> ShopInfoList = null;
		
		ShopInfoList = sdi.shopNameSeek(shop_name);
		
		return ShopInfoList;
	}

	@Override
	public List<FoodInfo> foodNameSeek(String food_name) {
		List<FoodInfo> FoodInfoList = null;
		
		FoodInfoList = sdi.foodNameSeek(food_name);
		
		return FoodInfoList;
	}
	
}
