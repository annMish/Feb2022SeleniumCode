package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;
	
			
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
	
	//		By shopCategory= By.xpath("//a[@class='dropdown-toggle meganav-shop']");
			
			//Always pass the driver in Actions class
					
			WebElement catogoryMenu= driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
			Actions act= new Actions(driver);
		   act.moveToElement(catogoryMenu).build().perform();
		   Thread.sleep(5000);
		   
		  
		   WebElement bevrages= driver.findElement(By.xpath("//ul[@id='navBarMegaNav']/li//a[@href='/cl/beverages/?nc=nb']"));
		   act.moveToElement(bevrages).build().perform();
		   Thread.sleep(5000);
		  
		   WebElement coffee= driver.findElement(By.linkText("Coffee"));
		   act.moveToElement(coffee).build().perform();
	      Thread.sleep(5000);
		
	      WebElement instantCoffee= driver.findElement(By.linkText("Instant Coffee"));
		   act.moveToElement(instantCoffee).click().build().perform();
	      Thread.sleep(5000);
		}

}
