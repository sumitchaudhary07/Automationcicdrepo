package com.qa.crm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
public static WebDriver  driver;
 public static Properties prop;
	
 
 //load the properties through constructor
	public BaseTest()
	{
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("E:\\seleniumframework\\src\\main\\java\\com\\qa\\crm\\config\\config.properties");
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialization() throws MalformedURLException
	{
		
		if(prop.getProperty("execution_env").equalsIgnoreCase("remote")) {
		
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setPlatform(Platform.WIN11);
			
		String browsername=prop.getProperty("browser");
		
			
			dc.setBrowserName("chrome");
			
		
		
		driver=new RemoteWebDriver(new URL("http://192.168.1.7:4444/wd/hub"),dc);
		
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
		
	}
	
	/*public void takeScreenshot()
	{
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+));
	}*/
}
