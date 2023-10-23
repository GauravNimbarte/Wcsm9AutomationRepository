package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	
	//it is use to get the source code of current webpage
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	// read the source code of login page
	  String loginPageSourcecode = driver.getPageSource();
	 System.out.println( loginPageSourcecode);
	driver.close();
		
		
		
		
	}
	
	

}
