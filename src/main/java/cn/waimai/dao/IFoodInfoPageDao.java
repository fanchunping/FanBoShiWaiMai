package cn.waimai.dao;

import java.util.List;

import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.ShopInfo;



public interface IFoodInfoPageDao {
	/**
	 * 总记录数
	 * @return 总记录数
	 */
	int getCount();
	/**
	 * 获得每页信息的集合
	 * @param index 页码
	 * @param pageSize 每页显示的信息数
	 * @return 每页的信息集合
	 */
	List<FoodInfo>getPageInfo(int index,int pageSize);
}
