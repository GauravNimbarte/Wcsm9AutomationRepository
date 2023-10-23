package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do");
	// identify user name text box and pass input as admin
	// to identify we use findElement method
	// once the webElement found it return webElement .(I) and address of webElement 
	
	WebElement usernameTextBox = driver.findElement(By.name("username"));
	System.out.println(usernameTextBox);
	usernameTextBox.sendKeys("admin");
	// to identify pass 
	WebElement passwordTextBox = driver.findElement(By.name("pwd"));
	System.out.println(passwordTextBox);
	passwordTextBox.sendKeys("manager");
	
	}

}
