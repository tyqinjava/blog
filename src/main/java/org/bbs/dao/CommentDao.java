package org.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bbs.entity.CommentPo;

public interface CommentDao {
	 /**
     * ����һ������
     * @param com
     */
     public void insert(CommentPo com);
      
     /**
      * ����idɾ��һ������
      * @param comment_id
      */
	 public void delCommentById(int comment_id);
	 
	 /**
	  * ��������id��ȡ����
	  * @param post_id
	  * @return
	  */
	 public List<CommentPo> getComment(int post_id);
	 
	 
	 /**
	  * 
	  * �����û�id��ȡ����
	  * @param user_id
	  * @return
	  */
	 public List<CommentPo> getCommentByUserId(int user_id);
		    
	 /**
	  * ����һ������
	  * @param c
	  */
	 public void update(CommentPo c);
	 
	 
	 /**
	  * ����id��ȡһ��������
	  * @param comment_id
	  * @return
	  */
	 public CommentPo getCommentById(int comment_id);
	
	 
	 
	 /**
	  * 
	  * ��������id,��ȡһ�η�Χ������
	  * @param start
	  * @param end
	  * @param post_id
	  * @return
	  */
	 public List<CommentPo> getRangeOfCommentByDesc(@Param("start")int start,@Param("end")int end,@Param("post_id")int post_id);
	
	 /**
	  * �����ȵ��ȡ����
	  * SELECT * from comment WHERE post_id=?
	  *  and agree >15 order by agree LIMIT 0,10;";
	  * @param post_id
	  * @return
	  */
	 public List<CommentPo> getHotComment(int post_id);
}
