package cn.waimai.service;

import java.util.List;

import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.ShopInfo;

public interface ISeekService {
	List<ShopInfo> shopNameSeek(String shop_name);
	
	List<FoodInfo> foodNameSeek(String food_name);
}
