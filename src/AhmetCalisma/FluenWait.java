package AhmetCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluenWait {
//fluent wait is class in selenium library webDriver is interface of selenium
//APPLY WAIT TO SPECIFIC ELEMENTS
	//THERE IS FREQUENCY
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	//we need static because we are calling into static main method. 
	public static void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("abcd");//gidecegin elementi locator i sec
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); // (Kets.RETURN) => ENTER demek
		driver.findElement(By.linkText("Home Page - ABCD")).click();
		
		 Wait wait = new FluentWait(driver)
				    .withTimeout(30, SECONDS)
				    .pollingEvery(5, SECONDS)
				    .ignoring(NoSuchElementException.class);
		
		driver.close();
		driver.quit();
	}
}
///when we run it withoug  applying fluent wait we will have an error sayin noSuchElementException (ElementNotVisibleException)
// The link is not available 
//becuase we did not apply wait time and not loaded. (unable to loaded).
//the environment application server is slow, or internet slow, or content in the webdriver different sizes.
//the solve the load time error for multiple objects we use fluent, webDriver is waiting for the conditions, plus
//fluent wait  new FluenWait<WebDriver>(driver).withTimeout(20.TimeUnitSecond).poling 
// 