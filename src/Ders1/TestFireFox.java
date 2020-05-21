package Ders1;

import Ders2.SWebDriver;

public class TestFireFox {
	public class TestFireFoxDriver implements SWebDriver {

		public TestFireFoxDriver() {
			System.out.println("Opening FireFox browser...");
		}
		@Override
		public void get(String url) {
			System.out.println("Launching the url :: + url");
			
		}

		@Override
		public void getCurrentUrl() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void getTitle() {
			// TODO Auto-generated method stub
			
		}

	}
}
