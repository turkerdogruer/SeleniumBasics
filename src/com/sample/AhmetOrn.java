package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AhmetOrn {
	public static void main(String[] args) {
		String url = ("https://images.search.yahoo.com/");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.id("yschsp")).sendKeys("Be Happy Ahmet");
		driver.findElement(By.className("ygbt")).click();
	}
}