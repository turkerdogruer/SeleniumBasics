package Ders3;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Task2 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://newtours.demoaut.com");
			driver.findElement(By.cssSelector("a[href*='mercuryregister']")).click();
			driver.findElement(By.cssSelector("input[name*='firstName")).sendKeys("Turker"); 
			driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys("Dogruer"); 
			driver.findElement(By.cssSelector("input[name*='phone")).sendKeys("12334123"); 
			driver.findElement(By.cssSelector("input[name*='userName']")).sendKeys("Dogruer@gmail.com"); 
			
			driver.findElement(By.cssSelector("input[name*='address1")).sendKeys("222 stree St"); 
			driver.findElement(By.cssSelector("input[name*='address2']")).sendKeys("apt 202"); 
			driver.findElement(By.cssSelector("input[name*='postalCode")).sendKeys("23133"); 
		
			driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("HerhangiEmail"); 
			driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("2321321321"); 
			driver.findElement(By.cssSelector("input[name*='confirmPassword']")).sendKeys("587964213"); 
			driver.findElement(By.cssSelector("input[name='register']")).click();
			
			
			
		}

}
