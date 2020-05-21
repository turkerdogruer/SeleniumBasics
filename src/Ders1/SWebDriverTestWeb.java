package Ders1;

import Ders2.SWebDriver;

public class SWebDriverTestWeb {
	
	public static void main(String[] args) {
		SWebDriver  driver= new TestChromeDriver();
		driver.get("https://google.com");
		driver.close();
		
		TestFireFox  driver2= new TestFireFox();
		driver.get("https://google.com");
		driver.close();
	}

}
