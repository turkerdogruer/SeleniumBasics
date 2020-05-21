package AselSelenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	
	import utils.CommonMethods;
	
	public class PrivateCoverFrame extends CommonMethods {
		public static void main(String[] args) {
	
			CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
			WebElement frame = driver.findElement(By.name("iframe_a"));
			driver.switchTo().frame("iframe_a");
			WebElement textbox = driver.findElement(By.id("name"));
	
			textbox.sentKeys("frame practice");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("alert")).click();
			;
		}
	}