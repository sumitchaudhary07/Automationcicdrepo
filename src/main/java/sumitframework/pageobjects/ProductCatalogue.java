package sumitframework.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sumitframewor.abstractcomponent.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {
	
	WebDriver driver;
	public ProductCatalogue(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//section[@id='products']/div[1]/div[2]/div")
	 List<WebElement> listofProducts;
	 
	 By products=By.xpath("//section[@id='products']/div[1]/div[2]/div");
	 By zara=By.xpath("//button[text()=' Add To Cart']");
	 
	 @FindBy(css=".toast-bottom-right")
	 WebElement toaster;
	 public List<WebElement> getProduct()
	 {
		 
		 return listofProducts;
	 }
	 
	 public WebElement getProductByName()
	 {
		  WebElement productZara=  getProduct().stream().filter(s->s.findElement(By.xpath("//*[text()='ZARA COAT 3']")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		  
		 return productZara;
	 }
	 
	 public void addToCart()
	 {
		 WebElement pz=getProductByName();
		 pz.findElement(zara).click(); 
	 }
	    
	   
	  
	public void waitForToaster()
	{
		waitForElement(toaster);
		
	}
	  
	
	  

	  
	  

}
