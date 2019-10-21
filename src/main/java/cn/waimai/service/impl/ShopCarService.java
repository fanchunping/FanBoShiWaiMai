package cn.waimai.service.impl;

import java.util.List;

import cn.waimai.dao.impl.ShopCarDaoImpl;
import cn.waimai.pojo.User_ShopCar;
import cn.waimai.service.IShopCarService;

public class ShopCarService implements IShopCarService {

	public String queryShop(String food_name,int shopCar_num) {
		ShopCarDaoImpl scr = new ShopCarDaoImpl();
		User_ShopCar usr = scr.queryShop(food_name, shopCar_num);
		if(usr == null){
			return "???" ;
		}else{
			return "???";
		}
		
	
	}

	@Override
	public String queryShop(int shopCar_food_id, int shopCar_num) {
		return null;
	}
}
