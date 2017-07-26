package org.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bbs.entity.PostPo;

public interface PostDao {

	

   /**
    * 插入一个帖子
    * @param p
    */
	public void insert(PostPo p);
		
    /**
     * 
     * @param p
     */
	public void update(PostPo p);
	
	/**
	 * 根据帖子的id，获取一个帖子
	 * @param id
	 * @return
	 */
	public PostPo getPost(int id);
	
	/**
	 * 
	 * 根据帖子的标题的关键字获取帖子
	 * @param title
	 * @return
	 */
	public List<PostPo> getPostsByTtileWithKeyWord(String title);
	
	/**
	 * 获取类型获取帖子的总记录数
	 * @param type
	 * @return
	 */
	public int getMaxCountByType(String type);
	    
	/**
	 * 根据用户id 获取对应的帖子
	 * @param user_id
	 * @return
	 */
	public List<PostPo> getPostsByUserId(int userId);
	
	/**
	 *根据发布时间和热度获取帖子
	 *select * from post where post_time like ? order by hot desc limit 0,12
	 * @param time
	 * @return
	 */
	public List<PostPo> getPostsByTimeAndHot(String time);
	
   /**
    * 
    * 根据类别进行分页查询
    * @param type 帖子类型
    * @param start 开始记录
    * @param end   结束记录
    * @return
    */
	public List<PostPo> getRangeOfPostByTypeDesc(@Param("type")String type, @Param("start")int start, @Param("end")int end);
	
	/**
	 * 根据帖子的id删除帖子
	 * @param post_id
	 */
	public void delPost(int postId);
	
	/**
	 * 根据帖子的id返回用户id
	 * @param post_id
	 * @return 用户id
	 */
	public int getUserIdByPostId(int postId);
	
	
	/**
	 * 根据范围返回帖子
	 * @param start
	 * @param end
	 * @return
	 */
	public List<PostPo> getRangeOfPostByDesc(@Param("start")int start,@Param("end") int end);
}
