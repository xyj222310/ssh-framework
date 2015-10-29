package com.service.action;

import static org.junit.Assert.*;

import org.junit.Test;

import com.action.UserAction;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception{
		UserAction ua =new UserAction();
		ua.setUsername("h");
		ua.setId("4");
		ua.setPassword("h");
		String ret = ua.execute();
		assertEquals("success",ret);
		//fail("Not yet implemented");
	}

}
