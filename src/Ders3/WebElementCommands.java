package Ders3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ali.dogruer");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/span/span")).click();

	}
}