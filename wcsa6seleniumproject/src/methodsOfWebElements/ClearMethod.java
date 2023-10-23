package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do");
	
	// identify username textbox and pass the input
//   WebElement	usernameTextBox=driver.findElement(By.name("username"));
     // usernameTextBox.sendKeys("admin123");
	driver.findElement(By.name("username")).sendKeys("admin123");
    // identify password textbox and pass the input
    WebElement passwordTextBox=driver.findElement(By.name("pwd"));
      passwordTextBox.sendKeys("manager");
	
    //  identify login and click
 
    WebElement loginButton=driver.findElement(By.id("loginButton"));
     loginButton.click();
     Thread.sleep(2000);
     //identify username textbox and clear the input
     driver.findElement(By.name("username")).clear();
     
     

 
 
	}

}
