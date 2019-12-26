package com.Banking.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Banking.BaseTest.BaseTest;
import com.Banking.Pages.LoginPage;
import com.Banking.Pages.SearchPage;



public class SearchPageTest extends BaseTest {
	
	SearchPage sp;
	
	@BeforeClass
	public void app() throws Exception {
		
		LoginPage lp=new LoginPage(driver);
		lp.doLogin();
	}
	
	@Test
	public void Seachcoursetest()
	{
		sp.Searchcourse();
	}
  
}
