package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDescendant {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("mobiles");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	System.out.println(driver.findElement(By.xpath("//div[text()='POCO C51 (Royal Blue, 64 GB)']/../descendant::div[@class='fMghEO']/ul/descendant::li[text()='5000 mAh Battery']")).getText());
	
	}

}
