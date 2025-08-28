package sumitframework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseWebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String urls="https://practice.expandtesting.com/tables";
		String email="jdoe@hotmail.com";
		WebDriver driver=new ChromeDriver();
		driver.get(urls);
		
	driver.manage().window().maximize();
	
	WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
	
	
	js.executeScript("arguments[0].scrollIntoView(true);",table);
		
		driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[text()='"+email+"']/parent::tr/td/a[@class='btn btn-primary']")).click();
		
	}

}
