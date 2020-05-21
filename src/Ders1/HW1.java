package Ders1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
//	Open chrome browser
//	Navigate to “https://www.zillow.com/”
//	Navigate to “https://www.google.com/”
//	Navigate back to Zillow Page
//	Refresh current page
//	Verify url contains “Zillow”
	
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.zillow.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		System.out.println("It contains " + driver.getCurrentUrl());
		boolean currentUrl = driver.getCurrentUrl().contains("zillow");
		System.out.println(currentUrl);
		Thread.sleep(3000);
		driver.close();
	}
	
}
