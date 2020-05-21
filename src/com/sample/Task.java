package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		String url = "http://newtours.demoaut.com/mercuryregister.php?osCsid=db290fe30b4083719b382da2bb4a8447";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.name("mercury")).sendKeys("HELLO HAPINEZ");

		driver.findElement(By.className("button")).click();
	}
}
