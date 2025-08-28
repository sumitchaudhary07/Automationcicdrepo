package sumitframework;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableSortinggain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		WebElement table=driver.findElement(By.cssSelector(".table"));
		
		driver.findElement(By.xpath("//*[contains(text(),'Veg/fruit name')]")).click();
		
		List<WebElement> firstcoloums=table.findElements(By.xpath("tbody/tr/td[1]"));
		List<String> coloumnvalues=firstcoloums.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> price;
		do
		{
			Thread.sleep(10000);
			List<WebElement> firstcoloumsss=table.findElements(By.xpath("tbody/tr/td[1]"));
		price=firstcoloumsss.stream().filter(s->s.getText().contains("Guava")).map(s->getPrice(s)).collect(Collectors.toList());
		price.stream().forEach(s->System.out.println(s));
		if(price.size()<1)
		{
		driver.findElement(By.cssSelector("a[aria-label*='Next']")).click()	;
		}
		}while(price.size()<1);
		
	//	firstcoloums.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		//List<String> sortedvalues=coloumnvalues.stream().sorted().collect(Collectors.toList());
		//coloumnvalues.stream().sorted().forEach(s->System.out.println(s));
	//System.out.println(coloumnvalues.equals(sortedvalues));
		
		
		
		

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price ;
	}

}
