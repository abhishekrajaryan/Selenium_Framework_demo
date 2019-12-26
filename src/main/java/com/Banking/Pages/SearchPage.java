package com.Banking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
	
	By course= By.xpath("//input[@id=\"search-inp-overlay-new\"]");

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void Searchcourse()
	{
		waitForElement(course,"visibility");
		entertext(course, "selenium");
	}
}
