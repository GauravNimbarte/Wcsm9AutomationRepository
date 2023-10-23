package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//click on setting module
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		//click on 'logo and colour scheme'
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		Thread.sleep(2000);
		//select the radio button
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(4000);
		
		//double click on choose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		//file Upload pop up get open
		//handle the file upload pop up
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
