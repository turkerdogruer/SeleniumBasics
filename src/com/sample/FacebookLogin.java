package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("turkerdogruer.outlook.com");
		
		driver.findElement(By.id("pass")).sendKeys("tdogruer");
			
		driver.findElement(By.id("u_0_d")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot Password")).click();
		
		
	}
}