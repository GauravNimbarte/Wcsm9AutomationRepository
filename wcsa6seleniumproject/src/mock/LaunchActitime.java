package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActitime {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://127.0.0.1/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.close();
	
	}

}
