package com.Banking.Pages;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	By Login=By.xpath("//a[@data-gi-action=\"Login\"]");
	By username=By.xpath("//input[@id=\"si_popup_email\"]");
	By password=By.xpath("//input[@id=\"si_popup_passwd\"]");
	By loginbtn=By.xpath("//button[text()=\"Login\"]");
	By logout=By.xpath("(//span[@class=\"webinar-profile-name\"])[1]");
	By logoutbtn=By.xpath("//a[text()=\"Log Out\"]");
	
	
		
	
	//FileReader reader=new FileReader("C:\\Users\\UX016420\\Desktop\\abhishek\\tutorials\\src\\main\\resources\\config.properties");
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SearchPage doLogin() throws Exception
	{
		
		click(Login);
		waitForElement(username,"visibility");
		driver.findElement(username).clear();
		Thread.sleep(3000);
		entertext(username, "mail2krabhishek@gmail.com");
		//String user=p1.getProperty("u");
		//entertext(username, user);

		//(username, p1.);
		waitForElement(password,"visibility");
		//entertext(password,pd.toString());
		entertext(password, "abcd1234");
		click(loginbtn);
		return new SearchPage(driver);
	}
	
	public void signoff() throws Exception
	{
		
		waitForElement(logout,"visibility");
		click(logout);
		waitForElement(logoutbtn,"visibility");
		click(logoutbtn);
	}
	
	

}

