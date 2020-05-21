package Ders6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseClass;

public class AlerDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.setUp();

		driver.findElement(By.xpath("//button@id = 'alert'[]")).click();

		// Handling Simple Alert//Alert is an interface.
		Alert SimpleAlert = driver.switchTo().alert();
		String simpleAText = SimpleAlert.getText();
		System.out.println("This is a alert text " + simpleAText);
		SimpleAlert.accept();

		// Handling Confirm Alert

		driver.findElement(By.id("confirm")).click();

		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmAlertText = confirmAlert.getText();
		System.out.println("This is confirm Alert " + confirmAlertText);
		Thread.sleep(1000);
		confirmAlert.dismiss();

		// Handling Prompt or confirmation Alert by providing confirmation message.
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		String promptText = promptAlert.getText();
		System.out.println(("This is prompt Alert " + promptText));
		promptAlert.sendKeys("Turker");
		promptAlert.accept();

		String Text = driver.findElement(By.xpath("//div[@id = 'demo']")).getText();
		System.out.println(Text);

		if (Text.contains("Turker")) {
			System.out.println("Text was succesfully added");

		} else {
			System.out.println("Text was not entered");

		}

		BaseClass.tearDown();
	}
}