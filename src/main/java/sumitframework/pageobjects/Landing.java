package sumitframework.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sumitframewor.abstractcomponent.AbstractComponent;

public class Landing extends AbstractComponent{
	
	WebDriver driver;
	public Landing(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	    
    @FindBy(id="userEmail")
	    WebElement email;  
	
	    
    @FindBy(id="userPassword") 
	    WebElement password;
	   
	   
    @FindBy(id="login")
	    WebElement loginButton;
	 
	  
	    public void loginApplication(String emails,String passwords)
	    {
	    	
	    	 email.sendKeys(emails);
	    	 password.sendKeys(passwords);
	    	  loginButton.click();
	  	    
	    }
	    
	    public void openAPP()
	    {
	    	
	    	 driver.manage().window().maximize();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))   ;  
	    driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	    }
	    

}
