package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin {
	public static void main(String[] args) {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPasword")).sendKeys("Admin123");

		driver.findElement(By.className("button")).click();

		// tagName , XPath, CSS

	}
}
