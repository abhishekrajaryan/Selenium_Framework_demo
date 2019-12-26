package com.Banking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Banking.BaseTest.BaseTest;


public class BasePage extends BaseTest {
	
	public BasePage(WebDriver driver)
	{
		super.driver=driver;
	}
	
	public void click(By Locator)
	{
		driver.findElement(Locator).click();
	}
	
	public void entertext(By Locator,String value)
	{
		driver.findElement(Locator).sendKeys(value);
	}
	public WebElement waitForElement(By locator,String condition)
	{
		WebDriverWait wait=new WebDriverWait(driver,3);
		switch(condition)
		{
		case "visibility":
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));		
		}
		
		return null;
	}
}
