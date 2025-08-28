package com.qa.crm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import com.qa.crm.base.BaseTest;

public class WebDriverEvent extends BaseTest implements WebDriverListener {

	public void beforeTo(WebDriver.Navigation navigation, String url) {
		
		System.out.println("before navigation"+" "+url);
	}

	  /**
	   * This action will be performed each time after {@link WebDriver.Navigation#to(String)} is
	   * called.
	   *
	   * @param navigation - decorated WebDriver.Navigation instance
	   * @param url - url to navigate to (can be relative)
	   */
	  public void afterTo(WebDriver.Navigation navigation, String url) {}

	
}
