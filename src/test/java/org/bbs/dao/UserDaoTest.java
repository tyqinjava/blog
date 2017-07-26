package org.bbs.dao;

import java.util.Arrays;
import java.util.List;

import org.bbs.entity.UserPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext.xml")
public class UserDaoTest {

//	 class path resource [spring/applicationContext.xml]
//	 : Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: 
//	 Failed to parse mapping resource: 'file [F:\STSProject\bbs-ssm\target\classes\org\bbs\mapper\UserMapper.xml]'; 
//	nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: org.apache.ibatis.builder.BuilderException: 
//	Parsing error was found in mapping #{userName,jdbcType.VARCHAR}.  Check syntax #{property|(expression), var1=value1, var2=value2, ...} 
	@Autowired
	private UserDao userDao;
	//@Test
	/*public void insertUserTest(){
		UserPo user=new UserPo();
		user.setUserName("tyq123465");
		user.setPassword("123456");
		user.setNickname("´ó¹«¼¦");
		userDao.insertUser(user);
	}
	*/
	/*@Test
	public void getUserTest(){
		UserPo user=userDao.getUserById(1);
		System.out.println(user);
		System.out.println();
		System.out.println();
	}*/
	/*@Test 
	public void getUserByUserNameTest(){
		UserPo user=userDao.getUserByUserName("Tom");
		System.out.println(user);
		System.out.println();
	}*/
	
	@Test 
	public void getUserByNickNameWithKeyWordTest(){
		
		List<UserPo> userList=userDao.getUserByNickNameWithKeyWord("t");
		for(UserPo user:userList)
		  System.out.println(user);
		System.out.println();
		System.out.println();
	}
}
