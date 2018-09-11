package com.framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.framework.DriverInitialization;

import junit.framework.Assert;

public class BasePage {
	public WebDriver driver;
	private static String sTitle= null;
	
	public BasePage(){
		DriverInitialization.setBrowser(Constants.browser);
		driver = DriverInitialization.getInstance();
		driver.get(Constants.appURL);
	}

	@Test
	public void validateBasePage(){
		Assert.assertEquals(Constants.appBasePageTitle, driver.getTitle());
	}
}
