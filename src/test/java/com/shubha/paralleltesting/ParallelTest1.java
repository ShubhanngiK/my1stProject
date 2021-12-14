package com.shubha.paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {

	WebDriver driver;
	
	@Test (priority =1)
	void  logoTest() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement logo =driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	    Assert.assertTrue(logo.isDisplayed(), "Logo is not visible on webpage");
	    Thread.sleep(5000);
		
	}
	
	
	@Test (priority =2)
	void  homepageTiltle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		String title= driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM","Title is not matching");
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	void appclose()
	{
				driver.quit();
	}
}
