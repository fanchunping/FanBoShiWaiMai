package cn.waimai.dao;

import cn.waimai.pojo.UserInfo;

public interface IAddressDao {
	/**
	 * 添加地址
	 * @param provice 所在省份
	 * @param city 所在城市
	 * @param district 所在区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 修改行数
	 */
	int AddAddress(String provice,String city,String district,String address);
	/**
	 * 删除地址
	 * @param provice 所在省份
	 * @param city 所在城市
	 * @param district 所在区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 修改行数
	 */
	int DelAddress(String provice,String city,String district,String address);
	/**
	 * 修改地址
	 * @param provice 所在省份
	 * @param city 所在城市
	 * @param district 所在区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 修改行数
	 */
	int AlertAddress(String provice,String city,String district,String address);
	/**
	 * 查询地址
	 * @param provice 所在省份
	 * @param city 所在城市
	 * @param district 所在区域
	 * @param address 具体地址，例如街道，门牌号
	 * @return 修改行数
	 */
	UserInfo QueryAddress(String provice,String city,String district,String address);
}
