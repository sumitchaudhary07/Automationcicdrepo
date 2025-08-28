package com.qa.crm.test;

import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.BaseTest;
import com.qa.crm.pages.HOmePage;
import com.qa.crm.pages.Login;



public class LoginPageTest extends BaseTest {
	Login login;
	HOmePage homepage;
	WebDriver driver;
	public LoginPageTest()
	{
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		
		initialization();
		
	    login=new Login();
	 }
	
	@Test
	public void login()
	{
		homepage=login.loginapp(prop.getProperty("username"), prop.getProperty("password"));
	}

}
