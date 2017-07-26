package org.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bbs.entity.CommentPo;

public interface CommentDao {
	 /**
     * 插入一个评论
     * @param com
     */
     public void insert(CommentPo com);
      
     /**
      * 根据id删除一条评论
      * @param comment_id
      */
	 public void delCommentById(int comment_id);
	 
	 /**
	  * 根据帖子id获取评论
	  * @param post_id
	  * @return
	  */
	 public List<CommentPo> getComment(int post_id);
	 
	 
	 /**
	  * 
	  * 根据用户id获取评论
	  * @param user_id
	  * @return
	  */
	 public List<CommentPo> getCommentByUserId(int user_id);
		    
	 /**
	  * 更新一个评论
	  * @param c
	  */
	 public void update(CommentPo c);
	 
	 
	 /**
	  * 根据id获取一个条评论
	  * @param comment_id
	  * @return
	  */
	 public CommentPo getCommentById(int comment_id);
	
	 
	 
	 /**
	  * 
	  * 根据帖子id,获取一段范围的评论
	  * @param start
	  * @param end
	  * @param post_id
	  * @return
	  */
	 public List<CommentPo> getRangeOfCommentByDesc(@Param("start")int start,@Param("end")int end,@Param("post_id")int post_id);
	
	 /**
	  * 根据热点获取评论
	  * SELECT * from comment WHERE post_id=?
	  *  and agree >15 order by agree LIMIT 0,10;";
	  * @param post_id
	  * @return
	  */
	 public List<CommentPo> getHotComment(int post_id);
}
