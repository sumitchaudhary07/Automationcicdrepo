package sumitframework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Window;

import dev.failsafe.internal.util.Durations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgainWebTable {

	public static void main(String[] args) {
		String urls="https://practice.expandtesting.com/tables";

		WebDriver driver=new ChromeDriver();
		driver.get(urls);
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(table));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",table);
		
		
		driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[text()='jdoe@hotmail.com']/following-sibling::td[last()]/a[@href='#edit']")).click();
		
	}

}
