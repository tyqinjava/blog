package org.bbs.dao;

import java.util.List;


public interface Collection {
	
    /**
     * ����һ���ղؼ�¼
     * @param c
     */
	public void insert(Collection c);
	
	/**
	 * ��������idɾ���ղ�
	 * @param post_id
	 */
	public void delCollectionByPostId(int post_id);
	
	/**
   	 * �����ղر�idɾ���ղؼ�¼ 
	 * @param cl_id
	 */
	public void delCollectionById(int cl_id);
	
	
	/**
	 * �����û�id ɾ���ղؼ�¼
	 * 
	 * @param user_id
	 */
	public void delCollectionByUserId(int user_id);
	
	/**
	 * ��ȡ���е��ղؼ�¼�����û�id
	 * @param user_id
	 * @return
	 */
	public List<Collection> getCollectionByUserId(int user_id);
	
	/**
	 * ��������id��ȡ�ղؼ�¼
	 * @param post_id
	 * @return
	 */
    public List<Collection> getCollectionPostId(int post_id);
    
}
