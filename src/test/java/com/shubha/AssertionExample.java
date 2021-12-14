package com.shubha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "S: \\ class data\\Classtools\\selenium\\newchrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	}

	@Test (priority= 1)
	void  logoTest() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement logo =driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	//	Assert.assertTrue(logo.isDisplayed(), "Logo is not visible on webpage");
		Assert.assertFalse(logo.isDisplayed(), "Logo is  visible on webpage");
	}
	
	@Test (priority = 2)
	void  homepageTiltle() throws InterruptedException
	{
		Thread.sleep(2000);
		String title= driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM","Title is not matching");
		Assert.assertEquals(title, "OrangeHRM123","Title is not matching");
	}
	
	@AfterClass
	void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}
