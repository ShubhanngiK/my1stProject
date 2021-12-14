package com.shubha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterizecode {

	
	WebDriver driver;
	
	@BeforeClass
	@Parameters ({"browser" , "url"})
	void setup(String browserName, String urlName) throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		//"https://opensource-demo.orangehrmlive.com/"
		driver.get(urlName);
		
	}

	
	
	@Test (priority= 1)
	void  logoTest() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement logo =driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not visible on webpage");
		
	}
	
	@Test (priority = 2)
	void  homepageTiltle() throws InterruptedException
	{
		Thread.sleep(2000);
		String title= driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM","Title is not matching");
	
	}
	
	@AfterClass
	void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}
