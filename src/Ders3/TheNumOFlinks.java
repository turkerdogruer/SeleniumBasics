package Ders3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheNumOFlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.gsu.edu");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("on GSU home page there are " + links.size() + " links");

		for (WebElement newlink : links) {
			// System.out.println(newlink.getText()); //suppose to get the text of these
			// links but did not worked here
			String all = newlink.getText();
			if (!all.isEmpty()) {
				System.out.println(all);
			}
		}

		driver.close();
	}
}
