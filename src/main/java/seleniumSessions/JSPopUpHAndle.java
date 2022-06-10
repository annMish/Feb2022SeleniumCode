package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSPopUpHAndle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
				
		driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]/img")).click();
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
      // driver.switchTo().frame("frame-one748593425");
		driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
		
		By vehicleYear= By.id("RESULT_TextField-2");
		By vehicleMake= By.id("RESULT_TextField-3");
		By vehicleModel=By.id("RESULT_TextField-4");
		By color=       By.id("RESULT_TextField-5");
		By mileage=     By.id("RESULT_TextField-6");
		By VIN=         By.id("RESULT_TextField-7");
		By name=        By.id("RESULT_TextField-8");
		By Address=     By.id("RESULT_TextField-9");
		By city=        By.id("RESULT_TextField-11");
		By state=       By.id("RESULT_RadioButton-12");
		By zip=         By.id("RESULT_TextField-13");
		By phone=       By.id("RESULT_TextField-14");
		By email=       By.id("RESULT_TextField-15");
		By submit=      By.id("FSsubmit");
		
		doSendKeys(vehicleYear, "2015");
		doSendKeys(vehicleMake, "Lexus");
		doSendKeys(vehicleModel, "XL");
		doSendKeys(color, "Black");
		doSendKeys(mileage, "10000");
		doSendKeys(VIN, "abc123455");
		doSendKeys(name, "Anu");
		doSendKeys(Address, "parkway Ave");
		doSendKeys(city, "Cary");
		doSendKeys(state, "NC");
		doSendKeys(zip, "24372");
		doSendKeys(phone, "999999999");
		doSendKeys(email, "a@gmail.com");
		//doClick(submit);
		
		
					
			
		}
		
		
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

  public static WebElement getElement(By locator ) {
	
	return driver.findElement(locator);
	
  }

  
  public static void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
		
	  } 
}
