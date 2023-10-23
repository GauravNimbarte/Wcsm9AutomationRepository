package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class InstagramScreenShot {
	public static void main(String[] args) throws IOException {
	WebDriver	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/accounts/login/");
	
	driver.findElement(By.name("username")).sendKeys("admin@manager");
	driver.findElement(By.name("password")).sendKeys("wedont know");
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
	//explicit typecast into TakeScreenshot (I)
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/instagram.jpg");
	
	Files.copy(src, dest);
	}

}
