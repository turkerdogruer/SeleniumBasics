package Ders1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	public static void main(String[] args) {

		/*
		 * Using xPath ONLY TC 2: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info (skip dropdowns) Click Submit User successfully registered Using Css
		 * ONLY TC 2: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info (skip dropdowns) Click Submit User successfully registered
		 */

		
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("KivircikAli");
		driver.findElement(By.name("lastname")).sendKeys("Dogruer");
		driver.findElement(By.id("u_0_r")).sendKeys("5208956895");
		driver.findElement(By.id("u_0_w")).sendKeys("12345");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.cssSelector("#u_0_13")).click();
		
		
		
	}

}
