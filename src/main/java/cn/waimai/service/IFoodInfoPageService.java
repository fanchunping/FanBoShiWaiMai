package cn.waimai.service;

import cn.waimai.util.FoodPage;

public interface IFoodInfoPageService {
	FoodPage getPage(int index,int pageSize);
}
