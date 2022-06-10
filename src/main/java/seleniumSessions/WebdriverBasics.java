package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverBasics {

	
	public WebDriver driver;
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\aynap\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();// Launch chrome
 				
		driver.get("https://www.facebook.com/");//Launch URL
		String title= driver.getTitle();//Get Title tab name
		
    	System.out.println(title);//Print Title
    	//driver.quit();// SID null Quit driver
    	
    	String curUrl=driver.getCurrentUrl();//get CurrentURL
  	    System.out.println(curUrl);//Print Current URL
	
       
       

	}

}
