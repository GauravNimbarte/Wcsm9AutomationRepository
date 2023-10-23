package assingnMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FriendsAllAuto {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("APjFqb")).sendKeys("Joey Tribbiani");
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	
	}

}
