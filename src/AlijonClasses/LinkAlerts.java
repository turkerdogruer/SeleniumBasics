package AlijonClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkAlerts {
	public static void main(String[] args) throws InterruptedException {
		// we need main method to executed to codes
		System.setProperty("webdriver.chrome.driver", "configuration.properties");// property is gonna do launches the
																					// browser and locate it
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement allertButton = driver.findElement(By.id("alert"));

		allertButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement timingAlertButton = driver.findElement(By.xpath("//button[text() ='Timing Alert' ]"));
		timingAlertButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		alert.accept();
	}
}
