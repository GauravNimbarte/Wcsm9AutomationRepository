package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http:/www.google.com");
	// use switchto and switch the control to activeElement
	//on google searchbox
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	
	
	
	
	
	}

}
