package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/Webpage.html");
	// identify username text box by using tagname locator
     Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	// identify password text box by using tagname locator
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Manager");
	
	
		
	}

}
