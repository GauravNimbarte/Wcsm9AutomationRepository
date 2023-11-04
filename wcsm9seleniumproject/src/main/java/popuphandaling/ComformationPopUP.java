package popuphandaling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComformationPopUP {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/browserNot");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Alert comfirm = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		String ok = comfirm.getText();
		System.out.println(ok);
		comfirm.dismiss();
		
		
		
		
		
	}

}
