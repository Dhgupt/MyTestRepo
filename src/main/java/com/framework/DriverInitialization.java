package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverInitialization {
	
	/*Singleton */
	private static WebDriver driver = null;
	
	private DriverInitialization(){
	}

	public static WebDriver getInstance(){
		if (driver == null) {
			initializeDriver(getBrowser());
		}
		return driver;
	}
	
	/*Abstract Factory implementation*/	
	
	private static String browser;
	
	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		DriverInitialization.browser = browser;
	}

	/*Dynamic Polymorphism*/
	
	private static void initializeDriver(String browser) {

		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER);
			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER);
			driver = new ChromeDriver();

		} else if (browser.equals("ie")) {

			System.setProperty("webdriver.chrome.driver", Constants.IE_DRIVER);
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
	}

	
}
