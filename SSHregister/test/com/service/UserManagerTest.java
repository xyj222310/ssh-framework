package com.service;




import org.junit.Assert;
import org.junit.Test;

import com.model.User;
import com.service.Impl.UserManagerImpl;

public class UserManagerTest {

	@Test
	public void testExsit() throws Exception{
		UserManager um = new UserManagerImpl();
		User u= new User();
		u.setId("3");
		boolean exists = um.exists(u);
		Assert.assertEquals(true,exists);
	}

	@Test
	public void testAdd() throws Exception{
		UserManager um = new UserManagerImpl();
		User u = new User();
		u.setId("3");
		u.setUsername("d");
		u.setPassword("d");
		boolean exists=um.exists(u);
		if(!exists){
			um.add(u);
			boolean exists2 = um.exists(u);
			Assert.assertEquals(true,exists2);
		}
		
		else{
			Assert.fail("Not yet added");
		}
	}

}
