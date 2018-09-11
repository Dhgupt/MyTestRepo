package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.BasePage;

public class LoginPage extends BasePage{
	
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	WebElement txtLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
	 	
	
	WebElement txtEmail = driver.findElement(By.xpath("//input[@id='u_0_o']"));
	WebElement txtPasswd = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
	WebElement cmbBirthday = driver.findElement(By.xpath("//*[@id='day']"));
	WebElement cmbMonth = driver.findElement(By.xpath(" //*[@id='month']"));
	WebElement cmbYear = driver.findElement(By.xpath("//*[@id='year']"));
	WebElement linkBirthdateHelp = driver.findElement(By.xpath("//*[@id='birthday-help']"));
	WebElement radioOptFemale = driver.findElement(By.xpath("//*[(@name='sex' and @value='1')] "));
	WebElement radioOptMale = driver.findElement(By.xpath("//*[(@name='sex' and @value='2')] "));
	WebElement btnSubmit = driver.findElement(By.xpath("//*[(@name='websubmit')] "));
	
	
	public LoginPage(){
		
	};
	
	

}
