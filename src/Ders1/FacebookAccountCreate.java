package Ders1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccountCreate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().fullscreen();

		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.name("name")).sendKeys("KivircikAli");
		driver.findElement(By.name("lastname")).sendKeys("Dogruer");

	}
}
