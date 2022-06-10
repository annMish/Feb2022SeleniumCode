package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserConcept {

	public static void main(String[] args) {
		
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co= new ChromeOptions();
//		//co.setHeadless(true);
//		//co.addArguments("--headless");
//		co.addArguments("--incognito");
//		WebDriver driver= new ChromeDriver(co);
//		driver.get("https://www.google.com");
//		String url=driver.getTitle();
//		System.out.println(url);
		//driver.close();
//		
		
    WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo= new FirefoxOptions();
		//co.setHeadless(true);
		//co.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver= new FirefoxDriver(fo);
		driver.get("https://www.google.com");
		String url=driver.getTitle();
		System.out.println(url);
		driver.quit();
		

	}

}
