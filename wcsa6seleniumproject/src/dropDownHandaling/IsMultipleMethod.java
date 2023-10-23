package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//single select dropdown...
		//driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/singleselectdropdown.html");
		
		//for multiselect dropdown ...
		driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
	WebElement dropDownElement = driver.findElement(By.name("menu"));
	
	Select sel = new Select(dropDownElement);
	//to check whether the dropdown is single
	System.out.println(sel.isMultiple());
	
	
	
	
		
		
		
		
	}

}
