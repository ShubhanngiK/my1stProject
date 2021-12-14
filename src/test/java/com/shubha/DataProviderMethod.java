package com.shubha;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {

//	@DataProvider(name= "LoginDataProvider")
//	public Object[][]  getData()
//	{
//		Object[][] data= { {"abc@gmail.com", "abc"} ,{"xyz@gmail.com", "xyz"}, {"mno@gmail.com", "mno"}};
//		return data;
//	}
//	
	@Test(dataProvider = "CustomeDataProvider",dataProviderClass = CustomeDataProvider.class)
	public void loginCheck(String eId, String pwd)
	{
		
		System.out.println("Email Id               "+eId+"                 Password                  "+pwd);
	}
	
	
}
