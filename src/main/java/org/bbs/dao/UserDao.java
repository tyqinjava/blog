package org.bbs.dao;

import java.util.List;

import org.bbs.entity.UserPo;

public interface UserDao {

	/**
	 * 
	 * 更新用户表信息
	 * 
	 * @param user
	 */
	public void update(UserPo user);
	
	/**
	 * 
	 * 根据用户昵称含有的关键字获取用户
	 * @param nickname
	 * @return
	 */
	public List<UserPo> getUserByNickNameWithKeyWord(String nickname);
	
	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	public UserPo getUserByUserName(String username);
	
	/**
	 * 根据用户id获取用户
	 * @param user_id
	 * @return
	 */
	public UserPo getUserById(int userId);
	/**
	 * 
	 * 插入一条用户记录
	 * @param user
	 */
	public void insertUser(UserPo user);
	
	
}
