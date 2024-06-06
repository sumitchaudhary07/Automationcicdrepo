package sumitframework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.emulation.Emulation;

public class CDPclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		DevTools dt=driver.getDevTools();
		dt.createSession();
		dt.send(Emulation.setGeolocationOverride(40, 3, 1));
		
	}

}
