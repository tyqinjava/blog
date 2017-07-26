package org.bbs.entity;

import java.util.Date;

public class CollectionPo {

	private Integer collectionId;
	
	private Integer userId;
	
	private Integer postId;
	
	private Date time;

	public Integer getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Collection [collectionId=" + collectionId + ", userId=" + userId + ", postId=" + postId + ", time="
				+ time + "]";
	}
	
	
}
