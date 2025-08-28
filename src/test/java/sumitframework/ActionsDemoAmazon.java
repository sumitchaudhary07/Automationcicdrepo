package sumitframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stubnav-link-accountList
		
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  driver.manage().window().maximize();
		  
		  WebElement AccountList=driver.findElement(By.id("nav-link-accountList"));
		  Actions action=new Actions(driver);
		  action.moveToElement(AccountList).build().perform();
		  
		  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		  action.moveToElement(search).click().build().perform();
	}

}
