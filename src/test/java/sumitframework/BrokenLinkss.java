package sumitframework;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class BrokenLinkss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String urls="https://rahulshettyacademy.com/AutomationPractice/";

		WebDriver driver=new ChromeDriver();
		driver.get(urls);
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:\\seleniumframework\\src\\test\\java\\sumitframework//screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.cssSelector("table[ class= 'gf-t']"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		//js.executeScript("arguments[0].scrollIntoView(true);",table);
		
		File src1=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src1, new File("E:\\seleniumframework\\src\\test\\java\\sumitframework//screenshot1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 List<WebElement> list=element.findElements(By.tagName("a"));
	 int broekncount=0;
	 int nonbroekncount=0;
	for(int i=0;i<list.size();i++)
	{
		String link=list.get(i).getAttribute("href");
		
		System.out.println(link);
		try {
			URL url=new URL(link);
			HttpURLConnection url1=(HttpURLConnection) url.openConnection();
			url1.setRequestMethod("HEAD");
			url1.connect();
			int httpcode=url1.getResponseCode();
			
			if(httpcode>=400)
			{
				System.out.println(link  +" "+"is bokennnnnn");
				broekncount++;
			}
			else
			{
				
				System.out.println(link  +" "+"is not bokennnnnn");
				nonbroekncount++;
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(broekncount);
		System.out.println(nonbroekncount);
		
		
		
		
	}
	}
	}
		
	