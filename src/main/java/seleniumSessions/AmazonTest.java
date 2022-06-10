package seleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args) {
		
	
		BrowserUtil br= new BrowserUtil();
		br.init_driver("chrome");
		
		br.navigateUrl("https://www.gmail.com");
		String title=br.getPageTitle();
		System.out.println(title);
		
		if(title.contains("Gmail")) {
		    System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
			
		}
	
		System.out.println(br.getPageSource().contains("Actionable Analytics"));
		//String curr=br.getPageUrl();
		//System.out.println(curr);
		System.out.println(br.getPageUrl().contains("https://accounts.google.com"));
		//br.closeBrowser();
		
	}

}
