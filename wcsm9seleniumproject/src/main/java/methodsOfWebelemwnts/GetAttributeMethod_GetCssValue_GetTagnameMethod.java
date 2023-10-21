package methodsOfWebelemwnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTagnameMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement loginBu = driver.findElement(By.xpath("//button[text()=' Login ']"));
	String attribute = loginBu.getAttribute("class");
	System.out.println(attribute);
	
	//get the css property of username tb
	String cssValue = loginBu.getCssValue("height");
	System.out.println(cssValue);
	
	//get the tagname of username tb
	String tag = loginBu.getTagName();
	System.out.println(tag);
	
	}

}
