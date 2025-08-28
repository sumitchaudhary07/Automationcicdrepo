package sumitframework.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sumitframework.pageobjects.Landing;



public class BaseTest {
 WebDriver driver;
	public WebDriver initializeDriver()
	{
		String browserName = null;
		File f=new File("E:/seleniumframework/src/main/java/sumitframewor/abstractcomponent/Global.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		
		Properties prop=new Properties();
		
			prop.load(fis);
			
			 browserName=prop.getProperty("browser");
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (browserName.equals("chrome"))
		{ 
		
		  driver= new ChromeDriver();
		
		
    	
		}

		 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))   ;
		return driver;
	}
	
	public Landing launchApplication()
	{
		
		driver=initializeDriver();
		 Landing landing=new Landing(driver);
		 landing.openAPP();
		 return landing;
	}
}
