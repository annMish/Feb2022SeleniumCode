package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AttributeConcept {

			
	public static void main(String[] args) {
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");	
		By phone=By.id("input-telephone");	
		By password=By.id("input-password");
		By privacyCheckbox=By.name("agree");
		By xpathContinue= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By confirmPassword=By.xpath("//*[@id=\"input-confirm\"]");
			
		BrowserUtil br1= new BrowserUtil();
		WebDriver driver =br1.init_driver("chrome");
		br1.navigateUrl("https://demo.opencart.com/index.php?route=account/register");
		ElementUtil eUt= new ElementUtil(driver);	
		
		
		String str=driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
		System.out.println("I am firstname"+""+str);
		eUt.doSendKeys(firstName, "Anu");
		String place=driver.findElement(By.id("input-firstname")).getAttribute("value");
		System.out.println(place);
		
		String attType= driver.findElement(lastName).getAttribute("type");
		System.out.println("I am LastName attribute value"+" "+attType);
		eUt.doSendKeys(lastName, "Pan");
		
	    eUt.doSendKeys(email, "Auom@gmail.com");
		String attValue= eUt.getAttributeValue(email, "type");
		System.out.println("I am email attributevalue"+" "+attValue);
		
		boolean isdisp= eUt.isDisplayed(phone);
		System.out.println(isdisp);
		eUt.doSendKeys(phone, "9999999");
		
		eUt.doSendKeys(password, "Automation1234");
		eUt.doSendKeys(confirmPassword, "Automation1234");
		eUt.doClick(privacyCheckbox);
		eUt.doClick(xpathContinue);
		
		
		
		
			
	}
	
}		
	
	

	
	

	

	
	
	


