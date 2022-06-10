package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightPanelListLinks {
	
		static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		
		By rightpanelLinks=By.xpath("//aside[@id='column-right']//a");
		
		ElementUtil eleutil= new ElementUtil(driver);
		//eleutil.clickOnElementFromSection(rightpanelLinks, "Register");
		printgetALLElementstext(rightpanelLinks);
		
	       List<String> listOfString= getElementsTextList(rightpanelLinks);
	       if (listOfString.contains("Register")) {
	    	   System.out.println("PASS");
	       }
	}

	public static int getElementsListCount(By locator) {
		return driver.findElements(locator).size();
	}
	
	
	public static List<String> getElementsTextList(By locator) {
		//store text in Array List or LIST(TOP casting)
		
		List<String> eleTextList = new ArrayList<String>();
		
		List<WebElement> eleList=driver.findElements(locator);
		for(WebElement e:eleList) {
			 String text=e.getText();
			 eleTextList.add(text);
	}		 
	 return eleTextList;
		
	}
	
	public static void printgetALLElementstext(By locator) {
		
		List<WebElement> eleList=driver.findElements(locator);
		for(WebElement e:eleList) {
			 String text=e.getText();
			 System.out.println("======"+ text);
			 
	}
	
	}	
	
}
