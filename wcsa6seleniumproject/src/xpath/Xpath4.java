package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text'and (@name='email')]")).sendKeys("1234567890");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pass'and (@id='pass')]")).sendKeys("3456779");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@value='1'and (text()='Log in')]")).click();
	//driver.close();
	
	}

}
