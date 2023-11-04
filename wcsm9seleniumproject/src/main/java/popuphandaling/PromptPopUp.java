package popuphandaling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver 	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/browserNot");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Thread.sleep(2000);
		
		Alert pro = driver.switchTo().alert();
		Thread.sleep(2000);
		String te = pro.getText();
		System.out.println(te);
		pro.sendKeys("no");
		Thread.sleep(2000);
	    pro.accept();
		
		//pro.dismiss();
    	Thread.sleep(2000);
		
		
	}

}
