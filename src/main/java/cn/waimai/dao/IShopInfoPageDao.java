package cn.waimai.dao;

import java.util.List;

import cn.waimai.pojo.ShopInfo;



public interface IShopInfoPageDao {
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
	List<ShopInfo>getPageInfo(int index,int pageSize);
}
