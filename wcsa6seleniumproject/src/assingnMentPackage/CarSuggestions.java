package assingnMentPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarSuggestions {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.switchTo().activeElement().sendKeys("car");
	Thread.sleep(2000);
	List<WebElement> carSug = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	Thread.sleep(2000);
	for(WebElement car:carSug)
	{
		Thread.sleep(2000);
		System.out.println(car.getText());
	}
	
	
	}

}
