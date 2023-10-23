package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocato {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("gaurav@123");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("mahol");
	
	
	}

}
