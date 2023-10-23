package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.get("http://127.0.0.1/administration/userlist.do");
	Thread.sleep(2000);
	driver.get("http://127.0.0.1/administration/useradd.do?noReload=false");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("babdi");
	Thread.sleep(2000);
	driver.findElement(By.name("passwordText")).sendKeys("babdi1");
	Thread.sleep(2000);
	driver.findElement(By.name("passwordTextRetype")).sendKeys("babdi1");
	Thread.sleep(2000);
	driver.findElement(By.name("firstName")).sendKeys("Gaurav");
	Thread.sleep(2000);
	driver.findElement(By.name("lastName")).sendKeys("Nimbarte");
	

	

	}

}
