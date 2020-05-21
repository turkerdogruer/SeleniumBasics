package AlijonClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		// we need main method to executed to codes
		System.setProperty("webdriver.chrome.driver", "configuration.properties");// property is gonna do launches the
																					// browser and locate it
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
	}
}