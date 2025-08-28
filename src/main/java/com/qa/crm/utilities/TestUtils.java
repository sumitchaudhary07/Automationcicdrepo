package com.qa.crm.utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.crm.base.BaseTest;
import com.qa.crm.pages.HOmePage;

public class TestUtils extends BaseTest {
    HOmePage homePage;

	public void waitForElement(WebElement element)
	{
		
		
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(element));
	  wait.until(ExpectedConditions.invisibilityOf(element));
	  
	
}
	
	
}
