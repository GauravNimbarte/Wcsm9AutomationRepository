package assingnMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAuto {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("91457875656");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("12346");
	Thread.sleep(2000);
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("x1lliihq x1k90msu x2h7rmj x1qfuztq x5e5rjt")).click();
	}

}
