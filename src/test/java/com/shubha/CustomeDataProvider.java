package com.shubha;

import org.testng.annotations.DataProvider;

public class CustomeDataProvider {

	
	 @DataProvider(name= "CustomeDataProvider")
		public Object[][]  getData()
		{
			Object[][] data= { {"abc@gmail.com", "abc"} ,{"xyz@gmail.com", "xyz"}, {"mno@gmail.com", "mno"}};
			return data;
		}
		
}
