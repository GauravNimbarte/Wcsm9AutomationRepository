package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectedMethod_IsDisplayedMethod_IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	
	//to click or select the check button
	driver.findElement(By.name("remember")).click();
	
	//To check whether the check box is selected or not.
	WebElement checkBox = driver.findElement(By.name("remember"));
boolean result = checkBox.isSelected();
	System.out.println(result);
	Thread.sleep(2000);
	
	
	//To Check whether the check box is displayed or not
	
	boolean res = checkBox.isDisplayed();
	System.out.println(res);
	
	Thread.sleep(2000);
	
	
	//to check wether the login button of instagram is enabled or not
	driver.navigate().to("https://www.instagram.com/accounts/login/");
	driver.findElement(By.name("username")).sendKeys("admin123");
	driver.findElement(By.name("password")).sendKeys("manager123");
	WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	boolean res1 = loginButton.isEnabled();
	
	//click on the login button
	loginButton.submit();
	System.out.println(res1);
	
	
	}

}
