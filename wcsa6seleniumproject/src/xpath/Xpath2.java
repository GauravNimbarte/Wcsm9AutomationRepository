package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	// xpath by using text() or (.)
	public static void main(String[] args) throws InterruptedException{
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[text()=' Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
