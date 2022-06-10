package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CriInfoAssignmentCustomXPath {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/delhi-capitals-vs-kolkata-knight-riders-41st-match-1304087/full-scorecard");
		
		getPlayerScoreList("Venkatesh Iyer");
		
		
	}
	
public static List<String> getPlayerScoreList(String playerName) {
			
			String betPlayerXpath="//div[@class='ds-bg-fill-content-prime ds-rounded-lg'] //span[contains(text(),'Venkatesh Iyer')]";
			List<WebElement> scoreList=driver.findElements(By.xpath(betPlayerXpath));
			List<String> scoreValueList= new ArrayList<String>();
			for(WebElement e:scoreList) {
				String text=e.getText();
				System.out.println(text);
				scoreValueList.add(text);
				
				}
			return scoreValueList;	
					}

   public static void getWicketTaker(String playerName) {
	   
}


}
