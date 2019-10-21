package cn.waimai.util;

import java.util.ArrayList;
import java.util.List;

import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.UserInfo;

public class FoodPage {
	private Integer totalCount;//�ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ����Ŀ��
	private Integer totalPageCount;//��ҳ��
	private Integer index;//��ǰҳ��
	private List<FoodInfo>users = new ArrayList<FoodInfo>();
	
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
	public List<FoodInfo> getUsers() {
		return users;
	}
	public void setUsers(List<FoodInfo> list) {
		this.users = list;
	}
	
	
}