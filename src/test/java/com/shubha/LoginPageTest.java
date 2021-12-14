package com.shubha;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest {
	
	@Test
	public void testLogin1()
	{
		
		LoginPage myLoginPage = new LoginPage();
		Assert.assertEquals(0, myLoginPage.userLogin("abc", "abc123"));
	}
	
	@Test
	public void testLogin2()
	{
		
		LoginPage myLoginPage = new LoginPage();
		Assert.assertEquals(1, myLoginPage.userLogin("abc", "abc@123"));
	}
	
}
