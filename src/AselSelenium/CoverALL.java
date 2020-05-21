package AselSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoverALL {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.get("url");

//or we can go driver.navigate().forward()
		// .back();
		driver.manage().window().fullscreen();
// .getTitle() , .manage().window().fullscreen(); }
		
		
		
	}
}