package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	// switch the control to active element
	driver.switchTo().activeElement().sendKeys("poha");
	Thread.sleep(2000);
	
	// identify all the suggestion of poha element
	List<WebElement> pohaSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	Thread.sleep(2000);
	
	// to print the list use looping statments
/*	for(int i=0;i<pohaSuggestions.size();i++)
	{
		
		System.out.println(pohaSuggestions.get(i).getText());
		Thread.sleep(2000);
	
	}*/
	// by using advance for loop read the list
	
	for (WebElement poha:pohaSuggestions)
	
	{
		Thread.sleep(2000);
		System.out.println(poha.getText());
	}
	
	
	
	
	}
}
