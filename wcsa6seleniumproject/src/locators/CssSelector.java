package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	// 1).BY using unique attribute
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
	WebDriver	driver=new ChromeDriver();
	//maximize the browser 
	driver.manage().window().maximize();
	//launch the web application
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	//identify the web element
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspider");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	//driver.close();
	
	}

}
