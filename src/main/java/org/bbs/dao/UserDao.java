package org.bbs.dao;

import java.util.List;

import org.bbs.entity.UserPo;

public interface UserDao {

	/**
	 * 
	 * �����û�����Ϣ
	 * 
	 * @param user
	 */
	public void update(UserPo user);
	
	/**
	 * 
	 * �����û��ǳƺ��еĹؼ��ֻ�ȡ�û�
	 * @param nickname
	 * @return
	 */
	public List<UserPo> getUserByNickNameWithKeyWord(String nickname);
	
	/**
	 * �����û�����ȡ�û�
	 * @param username
	 * @return
	 */
	public UserPo getUserByUserName(String username);
	
	/**
	 * �����û�id��ȡ�û�
	 * @param user_id
	 * @return
	 */
	public UserPo getUserById(int userId);
	/**
	 * 
	 * ����һ���û���¼
	 * @param user
	 */
	public void insertUser(UserPo user);
	
	
}
