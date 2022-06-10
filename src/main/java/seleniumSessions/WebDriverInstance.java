package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverInstance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aynap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			
//	 		WebDriver driver = new ChromeDriver();// Launch chrome
//	 		driver= new ChromeDriver();
//	 		driver= new ChromeDriver();
//	 		driver.get("https://www.google.com");
	 		
		
		//3 session id 3 drivers gor created
	 		WebDriver driver1 = new ChromeDriver();// 
	 		WebDriver driver2 = new ChromeDriver();// Launch chrome
	 		WebDriver driver3= new ChromeDriver();
	 		
	 		driver1.get("https://www.google.com");
	 		driver2.get("https://www.gmail.com");
	 		driver3.get("https://www.amazon.com");
	 		
	 		
	}

}