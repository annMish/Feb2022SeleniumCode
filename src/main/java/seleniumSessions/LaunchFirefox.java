package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		
	//	Validation/Checkpoint Expected v/s Actual
		if(title.equals("Google"))
			System.out.println("correct title");
		else {
			System.out.println("incorrect title");
			
			String url= driver.getCurrentUrl();
			System.out.println(url);
			driver.close();
		}
		

	}

}
