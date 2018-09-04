package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Flipkart {
	@FindBy(xpath = "//input[@type='text']")
	WebElement sProd;

	@FindBy(xpath = "button[@class='vh79eN' and @type='submit']")
	WebElement sSearch;

	@FindBy(xpath = "//input[@type='text']")
	WebElement suser;

	@FindBy(xpath = "//input[@type='password']")
	WebElement sPassword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement sSubmit;

	WebDriver driver;

	@Test
	public void goToHomePage() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.flipkart.com");
		//driver.get("http://9910308270:myPassword@flipkart.com");
		
		System.out.println("Test Done");
		PageFactory.initElements(driver, this);
		
		//driver.switchTo().alert();
		//Thread.sleep(5000);
		/*driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9910308270");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mon");
*/	
		/*suser.sendKeys("9910308270");
		sPassword.sendKeys("test");*/
		
		driver.findElement(By.className("_2zrpKA")).sendKeys("9910308270");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" YOUR USER NAME");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Monday01!");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.className("_2zrpKA")).submit();
		//		suser.sendKeys("9910308270");
		

		Thread.sleep(5000);
/*		Set<String> handler = driver.getWindowHandles();
	     System.out.println("Size is "+ handler.size());
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);
				
		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(5000);
		driver.switchTo().window(parentWindowId);
		Thread.sleep(5000);
		driver.switchTo().window(childWindowId);*/
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		
		driver.findElement(By.xpath("//a[text()='Samsung Galaxy On8 (Blue, 64 GB)']")).click();
//		sProd.sendKeys("samsung");		//driver.quit();
//		sSearch.click();
		
//		System.out.println(driver.findElement(By.xpath("//div[@class = '_1uv9Cb']")).getSize());
		
/*		List<WebElement> lw = driver.findElements(By.tagName("a"));
		System.out.println(lw.size());
		
		for(int i=0; i<lw.size(); i++){
			String linkText = lw.get(i).getText();
			if (linkText != null && linkText != linkText){
				System.out.println(linkText);
			}
		}
		*/
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
