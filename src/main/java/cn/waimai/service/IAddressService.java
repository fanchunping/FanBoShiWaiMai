package cn.waimai.service;

import cn.waimai.pojo.UserInfo;

import java.util.List;

public interface IAddressService {
	/**
	 * 判断是否添加成功
	 * @param provice 省份
	 * @param city 城市
	 * @param district 区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 添加结果
	 */
	String AddAddress(String provice,String city,String district,String address);
	/**
	 * 判断是否删除成功
	 * @param provice 省份
	 * @param city 城市
	 * @param district 区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 删除结果
	 */
	String DelAddress(String provice,String city,String district,String address);
	/**
	 * 判断是否修改成功
	 * @param provice 省份
	 * @param city 城市
	 * @param district 区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 修改结果
	 */
	String AlertAddress(String provice,String city,String district,String address);
	/**
	 * 查询
	 * @param provice 省份
	 * @param city 城市
	 * @param district 区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 查询结果集合
	 */
	 List<UserInfo> queryShop(String provice, String city, String district, String address);
}
