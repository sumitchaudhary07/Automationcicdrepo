package sumitframework;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Object> pref=new HashMap<String, Object>();
		
		pref.put("profile.default_content_setting_values.notifications", 2);
		
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", pref);
		
  WebDriver driver=new ChromeDriver(options);
  driver.get("https://www.spicejet.com/");
  

  
  
  WebElement passengerDropdown=driver.findElement(By.xpath("//div[contains(text(),'Passengers')]"));
  passengerDropdown.click();
  
  WebElement addAdult=driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
  WebElement addChild=driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
  int count=0;
  
  while(count<4)
  {
	  addAdult.click();
	  count++;
	  
  }
  
  int countChild=0;
  
  while(countChild<4)
  {
	  addChild.click();
	  countChild++;
	  
  }
  
	}

}
