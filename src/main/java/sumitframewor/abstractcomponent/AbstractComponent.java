package sumitframewor.abstractcomponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	
	
	WebDriver driver;
	
	public AbstractComponent(WebDriver driver)
	{
		this.driver=driver;
	}



	public void waitForElement(WebElement element)
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(element));
	  wait.until(ExpectedConditions.invisibilityOf(element));
	
}
}
