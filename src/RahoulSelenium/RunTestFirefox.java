package RahoulSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTestFirefox {
	public static void main(String[] args) {
		// Create driver object// since we use chrome browser we create an driver objcet
		// for chrome browser STEP1
		// invoke .exe file first //10-11 line two steps invoking the browser.
		System.setProperty("webdriver.gecko.driver", "/Users/funda/eclipse-workspace/SeleniumBasics/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		// thn I want to hit google.com in the chrome browser, above we opned first two
		// steps.

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.yahoo.com");
		driver.close();// close current browser opened by Selenium. 
		//driver.quit();//close all the browsers opened by Selenium script

		/**
		 * Note: this is one validation, when developers builts a title for the page, we
		 * will definetly have a test case sayin validate whether the title of the page
		 * is correct and test passes. This is the first very basic test case when we
		 * are developing application from scrach.
		 */

	}
}
