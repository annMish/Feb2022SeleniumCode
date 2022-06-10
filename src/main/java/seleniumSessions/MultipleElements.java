package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleElements {

	public static void main(String[] args) {
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");	
		By phone=By.id("input-telephone");	
		By password=By.id("input-password");
		By privacyCheckbox=By.name("agree");
		By xpathContinue= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By confirmPassword=By.xpath("//*[@id=\"input-confirm\"]");
		By tagName=By.tagName("a");
		
		
		BrowserUtil br1= new BrowserUtil();
		WebDriver driver =br1.init_driver("chrome");
		br1.navigateUrl("https://demo.opencart.com/index.php?route=account/register");
		ElementUtil eUt= new ElementUtil(driver);	
		
		//url: page
		//find total number of links on the page
		//print the text of each link on console
		//ignore those links which are having empty link
		
		//find total number of links on the page
		List<WebElement> linkList =driver.findElements(By.tagName("a"));
		//List<WebElement> linkList1 =driver.findElements(By.tagName("input"));
		System.out.println("TotalLinks"+" "+ linkList.size());
		
		//print the text of each link on console (Enhanced For Loop)
		
//		for(WebElement e:linkList) {
//			String text=e.getText();
//			String hrefValue=e.getAttribute("href");
//			//ignore those links which are having empty link
//			if(!text.isEmpty()) {
//				System.out.println(text+ ""+ hrefValue);
//			}
//				
//	     }
		
		
		//Index Bases loop
//		for(int i=0;i<=linkList.size();i++) {
//			String linkText= linkList.get(i).getText();
//			System.out.println(linkText);
//			if(!linkText.isEmpty()) {
//				System.out.println(linkText);
//			}
//			String hrefValue= linkList.get(i).getAttribute("href");
//			System.out.println(hrefValue);
//			
//		}
		
		
		
		//lamda: Java streams
		
//		linkList.stream().forEach(e->{System.out.println(e.getText());
//		linkList.stream().filter(e->!e.getText().isEmpty()).
//		forEach((e->{System.out.println(e.getText()}
//		}
//		
		
				
	//Parallel Stream	
		
//		linkList.parallelStream().filter(e->!e.getText().isEmpty());
//		linkList.forEach(e->{System.out.println(e.getText())};
		
		    
		
		
		
	}

}
