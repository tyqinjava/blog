package org.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bbs.entity.PostPo;

public interface PostDao {

	

   /**
    * ����һ������
    * @param p
    */
	public void insert(PostPo p);
		
    /**
     * 
     * @param p
     */
	public void update(PostPo p);
	
	/**
	 * �������ӵ�id����ȡһ������
	 * @param id
	 * @return
	 */
	public PostPo getPost(int id);
	
	/**
	 * 
	 * �������ӵı���Ĺؼ��ֻ�ȡ����
	 * @param title
	 * @return
	 */
	public List<PostPo> getPostsByTtileWithKeyWord(String title);
	
	/**
	 * ��ȡ���ͻ�ȡ���ӵ��ܼ�¼��
	 * @param type
	 * @return
	 */
	public int getMaxCountByType(String type);
	    
	/**
	 * �����û�id ��ȡ��Ӧ������
	 * @param user_id
	 * @return
	 */
	public List<PostPo> getPostsByUserId(int userId);
	
	/**
	 *���ݷ���ʱ����ȶȻ�ȡ����
	 *select * from post where post_time like ? order by hot desc limit 0,12
	 * @param time
	 * @return
	 */
	public List<PostPo> getPostsByTimeAndHot(String time);
	
   /**
    * 
    * ���������з�ҳ��ѯ
    * @param type ��������
    * @param start ��ʼ��¼
    * @param end   ������¼
    * @return
    */
	public List<PostPo> getRangeOfPostByTypeDesc(@Param("type")String type, @Param("start")int start, @Param("end")int end);
	
	/**
	 * �������ӵ�idɾ������
	 * @param post_id
	 */
	public void delPost(int postId);
	
	/**
	 * �������ӵ�id�����û�id
	 * @param post_id
	 * @return �û�id
	 */
	public int getUserIdByPostId(int postId);
	
	
	/**
	 * ���ݷ�Χ��������
	 * @param start
	 * @param end
	 * @return
	 */
	public List<PostPo> getRangeOfPostByDesc(@Param("start")int start,@Param("end") int end);
}
