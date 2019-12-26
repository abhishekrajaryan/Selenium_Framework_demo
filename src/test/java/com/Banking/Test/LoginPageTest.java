package com.Banking.Test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Banking.BaseTest.BaseTest;
import com.Banking.Pages.LoginPage;



public class LoginPageTest extends BaseTest {
	
	LoginPage lp;
  
	
	@Test
	public void doLoginTest() throws Exception
	{
		test = report.createTest("Login TEST");
		lp = new LoginPage(driver);
		lp.doLogin();
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		lp.signoff();
	}
}