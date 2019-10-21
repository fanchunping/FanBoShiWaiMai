package cn.waimai.service.impl;

import cn.waimai.dao.impl.FoodInfoPageDaoImpl;
import cn.waimai.service.IFoodInfoPageService;
import cn.waimai.util.FoodPage;

public class FoodPageServiceImpl implements IFoodInfoPageService{

	@Override
	public FoodPage getPage(int index, int pageSize) {
		FoodPage p= new FoodPage();
		FoodInfoPageDaoImpl uip= new FoodInfoPageDaoImpl();
		p.setTotalCount(uip.getCount());
		p.setPageSize(pageSize);
		if(index >p.getTotalPageCount()){
			p.setIndex(p.getTotalPageCount());
		}else if(index <1){
			p.setIndex(1);
		}else{
			p.setIndex(index);
		}
		
		p.setUsers(uip.getPageInfo(p.getIndex(), p.getPageSize()));
		return p;
	}
	
}
