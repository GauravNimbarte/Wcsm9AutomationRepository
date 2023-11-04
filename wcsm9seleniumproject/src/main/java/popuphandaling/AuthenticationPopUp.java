package popuphandaling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver 	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/browserNot");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		//driver
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		 Alert authe = driver.switchTo().alert();
		Thread.sleep(2000);
		authe.sendKeys("Guru");
		authe.sendKeys("12345667");
		authe.accept();
		Thread.sleep(2000);
		
		
	}

}
