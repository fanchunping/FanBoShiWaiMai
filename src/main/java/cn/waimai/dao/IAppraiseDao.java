package cn.waimai.dao;

import cn.waimai.pojo.User_Comment;

public interface IAppraiseDao {
	//Ìí¼Ó
	int addAppraise(int comment_user_id,int comment_shop_id,String comment_content);
	//É¾³ý
	int delAppraise(int comment_user_id,int comment_shop_id,String comment_content);
	//ÐÞ¸Ä
	int alertAppraise(int comment_user_id,int comment_shop_id,String comment_content);
	//²éÑ¯
	User_Comment queryAppraise(int comment_user_id,int comment_shop_id,String comment_content);
}
