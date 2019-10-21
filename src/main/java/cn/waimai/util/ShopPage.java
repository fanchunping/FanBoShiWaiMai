package cn.waimai.util;

import java.util.ArrayList;
import java.util.List;
import cn.waimai.pojo.ShopInfo;
import cn.waimai.pojo.UserInfo;

public class ShopPage {
	private Integer totalCount;//总记录数
	private Integer pageSize;//每页显示的条目数
	private Integer totalPageCount;//总页数
	private Integer index;//当前页码
	private List<ShopInfo>users = new ArrayList<ShopInfo>();
	
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalPageCount() {
		return totalCount % pageSize == 0? totalCount/pageSize : totalCount/pageSize + 1;
	}
	
//	public void setTotalPageCount(Integer totalPageCount) {
//		this.totalPageCount = totalPageCount;
//	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public List<ShopInfo> getUsers() {
		return users;
	}
	public void setUsers(List<ShopInfo> list) {
		this.users = list;
	}
	
	
}
