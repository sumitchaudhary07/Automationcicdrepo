package sumitframework;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		List<WebElement> table=driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> tablecol=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		int numberofrows=table.size();
		int numberofcol=tablecol.size();
		
		
		table.stream().map(t->t.getText()).forEach(t->System.out.println(t));
		
		//List<WebElement> actualtable=driver.findElements(By.xpath("//table"));
		
//List<WebElement> items	=tablecol.stream().filter(t->t.getText().equals("Rice")).collect(Collectors.toList());
   //  String price=  items.get(0).findElement(By.xpath("following-sibling::td[1]")).getText();
		
		//System.out.println(price);

	}

}
