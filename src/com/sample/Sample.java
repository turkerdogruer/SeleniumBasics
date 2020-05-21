package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		/*
		 * Commands with Page
		 * getCurrentUrl()
		 * getTitle()*/
		
		
		String fbUrl = "https://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(fbUrl);

		String url = driver.getCurrentUrl();
		System.out.println(" Current URL " + url);
		
		String title = driver.getTitle();
		System.out.println("Title of the page " + title);
		
		driver.close();
	}

}
