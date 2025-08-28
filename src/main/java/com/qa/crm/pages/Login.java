package com.qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.BaseTest;

public class Login extends BaseTest
{
	

	public Login() {
		//this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}


		// TODO Auto-generated method stub
         @FindBy(css="#userEmail")
		WebElement username;
		
         @FindBy(css="input[formcontrolname='userPassword']")
		WebElement password;
		
         @FindBy(css="#login")
		WebElement login;
		
		
		public HOmePage loginapp(String email,String pwd)
		{
			username.sendKeys(email);
			password.sendKeys(pwd);
			login.click();
			return new HOmePage();
		}



		


}
