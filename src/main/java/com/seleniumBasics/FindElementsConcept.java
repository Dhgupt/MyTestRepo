package com.seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsConcept {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		driver.get("http://www.facebook.com"); //enter URL
		
		
		//1. get the total count of links on the page
		//2. get the text of each link on the page
		
		//all the links are represented by <a> html tag:

		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linkList:
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++){
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		driver.findElement(By.xpath("//*[@name = 'firstname']")).sendKeys("Dheeraj");
		driver.findElement(By.xpath("//*[@name ='lastname']")).sendKeys("Gupta");
		
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id = 'day']")));
			
		s1.selectByValue("26");
	
	}

}
