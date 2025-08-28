package sumitframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RFesponsiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Dimension> deviceMap=new HashMap<String,Dimension>();
		deviceMap.put("pixel", new Dimension(412, 915));
		deviceMap.put("iphone12", new Dimension(390,844));
		deviceMap.put("Samsung Galaxy", new Dimension(360,740));
		
		
		 WebDriver driver= new ChromeDriver();
driver.get("https://letyshops.com/in");
Set<Entry<String,Dimension>> set=deviceMap.entrySet();

Iterator<String,Dimension> itr=set.iterator();


Dimension dim=new Dimension(412, 915);
driver.manage().window().setSize(dim);

	}

}
