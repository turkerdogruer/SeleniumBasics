package Ders1;

import Ders2.SWebDriver;

public class TestChromeDriver implements SWebDriver {

	TestChromeDriver() {
		System.out.println("Opening Chrome Browser....");
	}

	@Override
	public void get(String url) {
		System.out.println("Lunching the url : " + url);

	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Retrieving current url : ");
	}

	@Override
	public void close() {
		System.out.println("Closing current browser window");

	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub

	}
}
