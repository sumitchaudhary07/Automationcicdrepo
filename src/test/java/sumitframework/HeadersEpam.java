package sumitframework;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadersEpam {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.kayak.co.in/");
			
			String link=null;
			//WebElement headers=driver.findElement(By.xpath("//*[@class='header__content']"));
			List<WebElement>list=driver.findElements(By.tagName("a"));
			for(int i=0;i<list.size();i++)
			{
				link=list.get(i).getAttribute("href");
				System.out.println(link);
				
				
			}
			
			URL url=new URL(link);
			
			(HTTPURLConnection) http=url.openConnection()
			
			driver.get("https://www.spicejet.com/");
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
			
			WebElement arrow=driver.findElement(By.xpath("(//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]"));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]"))));
			
			driver.findElement(By.xpath("(//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).click();
			
			int i=0;
			
			while(i<4) {
			
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
	}
			
	}

}
