package org.bbs.dao;

import java.util.List;


public interface Collection {
	
    /**
     * 插入一个收藏记录
     * @param c
     */
	public void insert(Collection c);
	
	/**
	 * 根据帖子id删除收藏
	 * @param post_id
	 */
	public void delCollectionByPostId(int post_id);
	
	/**
   	 * 根据收藏表id删除收藏记录 
	 * @param cl_id
	 */
	public void delCollectionById(int cl_id);
	
	
	/**
	 * 根据用户id 删除收藏记录
	 * 
	 * @param user_id
	 */
	public void delCollectionByUserId(int user_id);
	
	/**
	 * 获取所有的收藏记录根据用户id
	 * @param user_id
	 * @return
	 */
	public List<Collection> getCollectionByUserId(int user_id);
	
	/**
	 * 根据帖子id获取收藏记录
	 * @param post_id
	 * @return
	 */
    public List<Collection> getCollectionPostId(int post_id);
    
}
