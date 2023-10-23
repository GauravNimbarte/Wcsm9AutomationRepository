package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	// it is use to get the title of curr webpage
	public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	// launch the insta
	driver.get("http://www.instagram.com");
	Thread.sleep(2000);
	String titleOfPage = driver.getTitle();
	System.out.println(titleOfPage);
	driver.close();
	
	
	
	}

}
