package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalTextFieldsOpen {

	public static void main(String[] args) {
		//TotalTextFields avaible on Register page
		
		By ClassName=By.className("form-control");
		
		BrowserUtil br1= new BrowserUtil();
		WebDriver driver =br1.init_driver("chrome");
		br1.navigateUrl("https://demo.opencart.com/index.php?route=account/register");
		ElementUtil eUt= new ElementUtil(driver);	
		
		
		List<WebElement> totalListFields =driver.findElements(ClassName);
		System.out.println("TotalList"+" "+ totalListFields.size());
		
//		for(WebElement e :totalListFields) {
//			String attValue= e.getAttribute("placeholder");
//			System.out.println(attValue);
//		}
		
		
		
//		for(int i=0;i<=totalListFields.size();i++) {
//			String str=totalListFields.get(i).getAttribute("placeholder");
//			System.out.println(i);
//		}
//			
//	}
//		
	
		
		
	}
		
		
	}


