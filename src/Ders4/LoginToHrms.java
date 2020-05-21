package Ders4;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
	
	//public static WebDriver driver;

	
	/**
	 * Use this method in need of lunching chrome or firefox browser.
	 * 
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath=System.getProperty("webdriver.chrome.driver","/Users/funda/eclipse-workspace/SeleniumBasics/ConfigSelenium/captmidn.txt");
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		
		WebDriver driver=null;
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		}
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		driver.close();
		//BREAK TILL 11:50
	}
}