package sumitframework;

import java.util.Set;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class WebScope {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
		  List<WebElement> link=driver.findElements(By.tagName("a"));
		
		  int countoflink=link.size();
		  System.out.println(countoflink);
		  
		  WebElement footer=driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		  
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		  
		  
		 
		  jse.executeScript("arguments[0].scrollIntoView(true);", footer);
		  
		  List<WebElement> footerlinksize=footer.findElements(By.tagName("a"));
		  
		  for(int i=0;i<footerlinksize.size();i++)
		  {
			  String url=footerlinksize.get(i).getAttribute("href");
			  System.out.println(url);
	URL urls=new URL(url);		  
	HttpURLConnection conn =(HttpURLConnection)urls.openConnection();
	
	conn.setRequestMethod("HEAD");
	conn.connect();
int statuscode	=conn.getResponseCode();
if (statuscode>400)
{
System.out.println("broken"+" "+url);	
}
		  }
		  
		  
		  
		  System.out.println(footerlinksize.size());
		  
		  WebElement coloumfooter=footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(coloumfooter.findElements(By.tagName("a")).size());
		
		for(int i=0;i<coloumfooter.findElements(By.tagName("a")).size();i++)
		{
			String clicks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumfooter.findElements(By.tagName("a")).get(i).sendKeys(clicks);
			
			Thread.sleep(10000);
			
	  
	  
	 
		}
		
		Set<String> abc=driver.getWindowHandles();
		  Iterator<String> itr=abc.iterator();
		 while(itr.hasNext())
		  {
		  
			  String windowtitle=driver.switchTo().window(itr.next()).getTitle();
				System.out.println(windowtitle);
				
			}
		  
	}

}
