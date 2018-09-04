package com.pages;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class CalendarTest {
	WebDriver driver;

	@Test
	public void f() {
		Assert.assertEquals(true, true);

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.freecrm.com");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dhgupt");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Monday01!");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");

		String date = "26-June-2018";
		String dateArr[] = date.split("-"); // {18,September,2017}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select selectMonth = new Select(driver.findElement(By.xpath("//Select[@name='slctMonth']")));
		// Select selectYear = new
		// Select(driver.findElement(By.xpath("//Select[@name='slctYear']")));

		// selectYear.selectByVisibleText(year);
		selectMonth.selectByVisibleText(month);

		Thread.sleep(5000);

		String xPathBefore = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String xPathAfter = "]/td[";

		boolean flag = false;
		String dayVal = null;

		for (int rowNum = 1; rowNum < 8; rowNum++) {
			for (int colNum = 1; colNum < 8; colNum++) {
				String xPathConstructed = xPathBefore + rowNum + xPathAfter + colNum + "]";
				System.out.println(xPathConstructed);
				dayVal = driver.findElement(By.xpath(xPathConstructed)).getText();
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(xPathConstructed)).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.println(driver.findElement(By.xpath("[contains(text(),'02:00 PM')]")).getText());
		System.out.println("Trial Success ----------------->");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
