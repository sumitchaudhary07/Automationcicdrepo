package sumitframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
	      
		  driver.get("https://jqueryui.com/droppable");
	      
	      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));)
WebElement drag=driver.findElement(By.id("draggable"));
drag.click();
	}

}
