package testngsessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https:demo.opencart.com/index.php?route=account/login");
		
	}

	// AAA Rule
	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(priority=2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is : " + url);
		Assert.assertTrue(url.contains("route=account/login"));

	}

	@Test(priority=3)
	public void demoLabel() {
		WebElement label= driver.findElement(By.linkText("Your Store"));
		System.out.println("The Label is" +label);
		Assert.assertTrue(label.isDisplayed());
		
	}
	
	@Test(priority=4)
	public void newCustomerLabel() {
		WebElement newcustLabel =driver.findElement(By.xpath("h2[contains(text(),'New Customer')]"));
		Assert.assertTrue(newcustLabel.isDisplayed());
		
	}
	
	@Test(priority=5)
	public void cartIsDispalyed() {
		WebElement cartisDisplayed=driver.findElement(By.xpath("span[@id=\"cart-total\"]"));
				
		Assert.assertTrue(cartisDisplayed.isDisplayed());
	}
	
	@Test(priority=6)
	public void forgotpassword() {
		WebElement forgot=driver.findElement(By.xpath("div[@class='list-group']/a[contains(text(),'Forgotten Password')]"));
		forgot.click();
		String url = driver.getCurrentUrl();
		System.out.println("page url is : " + url);
		Assert.assertTrue(url.contains("route=account/forgotten"));

	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
