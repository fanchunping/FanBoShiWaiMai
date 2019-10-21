package cn.waimai.service.impl;

import java.util.List;

import cn.waimai.dao.impl.AddressDaoImpl;
import cn.waimai.pojo.UserInfo;
import cn.waimai.service.IAddressService;

public class AddressServiceImpl implements IAddressService{
	@Override
	public String AddAddress(String provice, String city, String district, String address) {
		AddressDaoImpl ad= new AddressDaoImpl();
		int count = ad.AddAddress(provice, city, district, address);
		if(count > 0){
			return "添加成功";
		}else{
			return "添加失败";
		}
	}

	@Override
	public String DelAddress(String provice, String city, String district, String address) {
		AddressDaoImpl ad= new AddressDaoImpl();
		int count = ad.DelAddress(provice, city, district, address);
		if(count > 0){
			return "删除成功";
		}else{
			return "删除失败";
		}
	}

	@Override
	public String AlertAddress(String provice, String city, String district, String address) {
		AddressDaoImpl ad= new AddressDaoImpl();
		int count = ad.AlertAddress(provice, city, district, address);
		if(count > 0){
			return "修改成功";
		}else{
			return "修改失败";
		}
	}

	@Override
	public List<UserInfo> queryShop(String provice, String city, String district, String address) {
		return null;
	}


}
