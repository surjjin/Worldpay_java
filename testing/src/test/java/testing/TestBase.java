package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase extends DriverUtility{
	public static void createChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
