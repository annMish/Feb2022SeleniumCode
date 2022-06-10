package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		
		By footers= (By.xpath("//footer//ul[@class='footer-nav']//a"));
		clickOnElementFromSection(footers, "Leadership");
		
//	 List<WebElement> footerlist=driver.findElements(By.xpath("//footer//ul[@class='footer-nav']//a"));
//	 
//	 System.out.println("======"+footerlist.size());
//	 
//	 for(WebElement e:footerlist) {
//		 
//		// String text=e.getText();//capture text
//		//System.out.println(text);//print all
//		 
//		 boolean islistdispalyed=e.isDisplayed();
//		 System.out.println(islistdispalyed);
//		 
//		 // click particular link
////		 if(text.contains("Leadership")) {
////			 System.out.println("PASS");
////			 e.click();
////			 break;
//	//	 }

		// }
				 
	// }
	}
	public static void clickOnElementFromSection(By locator,String value ) {
		
		 List<WebElement> footerlist1=driver.findElements(locator);
		 
		 System.out.println("======"+footerlist1.size());
		 
		 for(WebElement e:footerlist1) {
		 String text=e.getText();
		 System.out.println("======"+ text);
		 
		 if(text.contains(value)) {
			 e.click();
				break;
			 }
		 }
	}

}
