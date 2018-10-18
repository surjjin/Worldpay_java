package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtility {
	public static WebDriver driver;
	
	public static WebElement find(By locator){
		return driver.findElement(locator);
	}
	
	public static void click(By locator){
		click(locator);
	}
	
	public static void setText(String s,By locator){
		find(locator).sendKeys(s);;
		
	}
}
