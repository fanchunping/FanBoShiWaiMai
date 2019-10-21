package cn.waimai.dao;

import cn.waimai.pojo.UserInfo;
import cn.waimai.pojo.User_ShopCar;

public interface IShopCarDao {
	/**
	 * 添加数据
	 * @param food_name 食品名称
	 * @param shopCar_num 数量
	 * @return
	 */
	int shopAdd(String food_name,int shopCar_num);
	/**
	 * 删除数据
	 * @param food_name 食品名称
	 * @param shopCar_num 数量
	 * @return
	 */
	int delShop(String food_name,int shopCar_num);
	/**
	 * 修改数据
	 * @param food_name 食品名称
	 * @param shopCar_num 数量
	 * @return
	 */
	int alterShop(String food_name,int shopCar_num);
	/**
	 * 查询数据
	 * @param food_name 食品名称
	 * @param shopCar_num 数量
	 * @return
	 */
	User_ShopCar queryShop(int ShopCar_food_id, int shopCar_num);
	User_ShopCar queryShop(String food_name, int shopCar_num);
}

