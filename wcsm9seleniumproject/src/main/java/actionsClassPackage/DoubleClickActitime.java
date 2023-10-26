package actionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickActitime {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	WebElement setting = driver.findElement(By.xpath("//a[@class='content administration']/descendant::div[text()='Settings']"));
	Actions act = new Actions(driver);
	  act.doubleClick(setting).perform();
	  
	  driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	  driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	  WebElement custom = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	  Actions act1 = new Actions(driver);
	  act.doubleClick(custom).perform();
	  
	
	}


}
