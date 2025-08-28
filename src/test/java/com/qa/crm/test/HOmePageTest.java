package com.qa.crm.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.crm.base.BaseTest;
import com.qa.crm.pages.HOmePage;
import com.qa.crm.pages.Login;
import com.qa.crm.testdata.TestDataHashMap;
import com.qa.crm.utilities.TestUtils;

public class HOmePageTest extends BaseTest {
	Login login;
	HOmePage home;
	TestUtils testUtils;
	public HOmePageTest()
	{
		
		super();
		
	}
	
	
	@BeforeMethod
	public HOmePage getHomePage() throws MalformedURLException
	{
		
		initialization();
		login=new Login();
		testUtils=new TestUtils();
		 home=login.loginapp(prop.getProperty("username"), prop.getProperty("password"));
		
		return home;
	}
	
	
	@Test(priority = 1)
	public void getProduct()
	{
		home.addToCart();
		
		
	}
	@Test(priority = 2)
	public void toaster()
	{
		
		
		testUtils.waitForElement(home.waitForToaster());
		
	}
	
	@DataProvider(name="data")
	public Object [][] getData() throws IOException
	{
		TestDataHashMap testdata=new TestDataHashMap();
		List<HashMap<String, String>> testdatamap=testdata.getDatafromHashMap();
		
		return new Object[][] {{testdatamap.get(0)},{testdatamap.get(1)}};
		
		
	}
	

}
