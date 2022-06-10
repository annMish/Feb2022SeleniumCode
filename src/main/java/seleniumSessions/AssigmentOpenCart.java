package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssigmentOpenCart {

	
		
	public static void main(String[] args) {
	
		BrowserUtil br=new BrowserUtil();
		WebDriver driver= br.init_driver("chrome");
		br.navigateUrl("https://demo.opencart.com/index.php?route=account/register");
		
	   ElementUtil elUt= new ElementUtil(driver);
	   
        By firstname= By.id("input-firstname");
	    By lastname= By.id("input-lastname");
		By email=By.id("input-email");
	    By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By Cpassword= By.id("input-confirm"); 
		By checkBoxAgree= By.name("agree");
		By xpathContinue= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	   
	   	      
	   elUt.doSendKeys(firstname, "Anu");
	   elUt.doSendKeys(lastname, "Automation");
	   elUt.doSendKeys(email, "Autom@gmail.com");
	    elUt.doSendKeys(telephone, "9999999");
	   elUt.doSendKeys(password, "Automation1234");
	   elUt.doSendKeys(Cpassword, "Automation1234");
	   elUt.doClick(checkBoxAgree);
       elUt.doClick(xpathContinue);
		
	   
//		String firstname= "input-firstname";
//		String lastname= "input-lastname";
//		String email="input-email";
//		String telephone="input-telephone";
//		String password="input-password";
//		String Cpassword= "input-confirm"; 
//		String checkBoxAgree= "agree";
//		String xpathContinue= "//*[@id=\"content\"]/form/div/div/input[2]";
//		
//		
//		elUt.doSendKeys(getBy("id",firstname), "Anna");
//		elUt.doSendKeys(getBy("id",lastname), "Pan");
//		elUt.doSendKeys(getBy("id",email), "Pan11@gmail.com");
//		elUt.doSendKeys(getBy("id",telephone), "99999");
//		elUt.doSendKeys(getBy("id",password), "Abcd123");
//		elUt.doSendKeys(getBy("id",Cpassword), "Abcd123");
//		elUt.doClick(getBy("name",checkBoxAgree));
//		elUt.doClick(getBy("xpath",xpathContinue));
		
	}
		
	public static By getBy(String locatorType, String locatorValue) {
//				By locator=By.id(locatorValue)	;
//				return locator;
  	By locator=null;
		
	    switch (locatorType) {
	    case "id":
		  locator=By.id(locatorValue);
		     break;
       case "name":
			  locator=By.name(locatorValue);
			     break;
	    case "classname":
			  locator=By.className(locatorValue);
			     break;
	    case "xpath":
		  locator=By.xpath(locatorValue);
			     break;
//	    case "cssSelector":
//			  locator=By.cssSelector(locatorValue);
//			     break;
//	    case "linkText":
//			  locator=By.linkText(locatorValue);
//			     break;
//	    case "partialLinkText":
//			  locator=By.partialLinkText(locatorValue);
//			     break;
//	    case "tagName":
//		  locator=By.tagName(locatorValue);
//			     break;
	     default:
		   System.out.println("Please pass the right locator");
		      break;
	}
	
	return locator;
	
	}

		

}
