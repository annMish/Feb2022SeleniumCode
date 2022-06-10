package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		driver.navigate().to("https://www.google.com"); 
		String title= driver.getTitle();
		System.out.println(title);
		
//        try {
//			driver.navigate().to(new URL ("\"https://www.google.com\""));
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//        String title= driver.getTitle();
//		System.out.println(title);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
        
        
	}

}
