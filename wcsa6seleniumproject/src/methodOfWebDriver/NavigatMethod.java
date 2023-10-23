package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//use navigate method and launch web application
	driver.navigate().to("http:/www.google.com");
	//use navigate perform backward operation
	Thread.sleep(2000);
	driver.navigate().back();
	//use navigate perform forward operation
	Thread.sleep(2000);
	driver.navigate().forward();
	//use navigate perform refresh operation 
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	}

}
