package sumitframework;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;
import sumitframework.basepackage.BaseTest;
import sumitframework.pageobjects.Landing;
import sumitframework.pageobjects.ProductCatalogue;

public class StandaloneWebTest extends BaseTest {

	WebDriver driver;
	
	
	@Test
	
	public void startApp() throws InterruptedException
	{
	
	/// WebDriver driver= new ChromeDriver();
	Landing landings=launchApplication();
landings.loginApplication("ty@abc.com", "Hanuman@2024");

    String webPageTitle=driver.getTitle();
    System.out.println(webPageTitle);
    
    ProductCatalogue pc=new ProductCatalogue(driver);
    
   List<WebElement> listodProducts= pc.getProduct();
   WebElement productZara=pc.getProductByName();
   pc.addToCart();
    pc.waitForToaster();
   /* List<WebElement> listofProducts=driver.findElements(By.xpath("//section[@id='products']/div[1]/div[2]/div"));
    
  WebElement productZara=  listofProducts.stream().filter(s->s.findElement(By.xpath("//*[text()='ZARA COAT 3']")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
  productZara.findElement(By.xpath("//button[text()=' Add To Cart']")).click();    
  
  WebElement toaster=driver.findElement(By.cssSelector(".toast-bottom-right"));
  
  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
  wait.until(ExpectedConditions.visibilityOf(toaster));
  wait.until(ExpectedConditions.invisibilityOf(toaster));*/
  WebElement cart=driver.findElement(By.xpath("//button[@routerLink='/dashboard/cart']"));
  cart.click();
  
  List<WebElement> cartProduct=driver.findElements(By.xpath(".//div[@class='cartSection']/h3"));
WebElement id = cartProduct.stream().filter(s->s.getText().equalsIgnoreCase("ZARA COAT 3")).findFirst().orElse(null);
  
  System.out.println(id.findElement(By.xpath("preceding-sibling::p")).getText());
  
  
  WebElement checkout=driver.findElement(By.xpath("//button[text()='Checkout']"));
  checkout.click();
  
  WebElement selectCountry=driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
  
  Actions a=new Actions(driver);
  a.moveToElement(selectCountry).click().keyDown(Keys.SHIFT).sendKeys("ind").keyUp(Keys.SHIFT).build().perform();
 List<WebElement> dropdownResult= driver.findElements(By.xpath("//section[@class='ta-results list-group ng-star-inserted']/button"));
 
 Thread.sleep(10000);
  WebElement countryToBeSelected=dropdownResult.stream().filter(s->s.findElement(By.xpath("//span[text()='   India']")).getText().trim().equals("India")).findFirst().orElse(null); 
  countryToBeSelected.click();
  
  
	}

	
}
