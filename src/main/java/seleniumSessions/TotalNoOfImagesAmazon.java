package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalNoOfImagesAmazon {

	public static void main(String[] args) {
		
		BrowserUtil br1= new BrowserUtil();
		WebDriver driver =br1.init_driver("chrome");
		br1.navigateUrl("https://www.amazon.com/");
		ElementUtil eUt= new ElementUtil(driver);	
		
		//Capture image
		//give value src or alt
		
		List<WebElement> imageList =driver.findElements(By.tagName("img"));
		System.out.println("TotalLinks"+" "+ imageList.size());
		
		for(WebElement e:imageList) {
			String altValue= e.getAttribute("alt");
			if(!altValue.isEmpty()) {
				System.out.println(altValue);
			}
			String srcValue=e.getAttribute("src");
			System.out.println(srcValue);
			
					
	     }
		
		
	}

}
