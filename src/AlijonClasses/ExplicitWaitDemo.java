package AlijonClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "configuration.properties");// property is gonna do launches the
		// browser and locate it
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		driver.manage().window().fullscreen();
		WebElement startDownloadButton = driver.findElement(By.cssSelector("button[id= 'downloadButton']"));
		startDownloadButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text() = 'Complete!']")));
		WebElement completeStatus = driver.findElement(By.cssSelector("button[id = 'Complete!']"));
		String completeStatusText = completeStatus.getText();
		System.out.println(completeStatusText);
		WebElement closeButton = driver.findElement(By.xpath("//button[text () = 'closeButton']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
	}
}