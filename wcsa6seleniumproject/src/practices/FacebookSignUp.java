package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gaurav");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nimbarte");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("77739981");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("777399");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='day']")).sendKeys("23");
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("sep");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@class='_58mt'and (text()='Male')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
