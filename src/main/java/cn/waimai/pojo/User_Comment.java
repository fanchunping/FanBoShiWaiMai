package cn.waimai.pojo;

public class User_Comment {
	private Integer comment_id;
	private String comment_info;
	private Integer comment_user_id;
	private Integer comment_shop_id;
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment_info() {
		return comment_info;
	}
	public void setComment_info(String comment_info) {
		this.comment_info = comment_info;
	}
	public Integer getComment_user_id() {
		return comment_user_id;
	}
	public void setComment_user_id(Integer comment_user_id) {
		this.comment_user_id = comment_user_id;
	}
	public Integer getComment_shop_id() {
		return comment_shop_id;
	}
	public void setComment_shop_id(Integer comment_shop_id) {
		this.comment_shop_id = comment_shop_id;
	}
}
