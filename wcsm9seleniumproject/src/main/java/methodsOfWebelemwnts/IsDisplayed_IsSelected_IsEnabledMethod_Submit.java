package methodsOfWebelemwnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_IsSelected_IsEnabledMethod_Submit {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	//isdisplayed
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	WebElement logOutLink = driver.findElement(By.xpath("//a[@class='logout']"));
	boolean display = logOutLink.isDisplayed();
	System.out.println(display);
	//isselected
	driver.navigate().back();
	WebElement checkbox = driver.findElement(By.xpath("//input[@name='remember']"));
	boolean selected = checkbox.isSelected();
	System.out.println(selected);
	checkbox.click();
	boolean selected1 = checkbox.isSelected();
	System.out.println(selected1);
	//isenabled
	driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
	
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("gaura123");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("gau1234");
	WebElement loginB = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	boolean enabled = loginB.isEnabled();
	System.out.println(enabled);
	
	//Submit Method
	 loginB.submit();
	
	
	}

}
