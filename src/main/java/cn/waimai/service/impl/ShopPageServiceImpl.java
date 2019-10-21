package cn.waimai.service.impl;

import cn.waimai.dao.impl.ShopInfoPageDaoImpl;
import cn.waimai.service.IShopInfoPageService;
import cn.waimai.util.ShopPage;

public class ShopPageServiceImpl implements IShopInfoPageService{

	@Override
	public ShopPage getPage(int index, int pageSize) {
		ShopPage p= new ShopPage();
		ShopInfoPageDaoImpl uip= new ShopInfoPageDaoImpl();
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
