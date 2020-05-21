package RahoulSelenium;

///////////////////////////FIRST AUTOMATION //////////////////////
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTestChrome {
	public static void main(String[] args) {
		// Create driver object// since we use chrome browser we create an driver objcet
		// for chrome browser STEP1
		// invoke .exe file first //10-11 line two steps invoking the browser.
		System.setProperty("webdriver.chrome.driver", "/Users/funda/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		// thn I want to hit google.com in the chrome browser, above we opned first two
		// steps.

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		/**
		 * Note: this is one validation, when developers builts a title for the page, we
		 * will definetly have a test case sayin validate whether the title of the page
		 * is correct and test passes. This is the first very basic test case when we
		 * are developing application from scrach.
		 */

	}
}
