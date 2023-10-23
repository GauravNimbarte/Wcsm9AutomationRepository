package selectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/singleselectdropdown.html");
	//handal dropdown by using select class
	//identify dropdown 
	//single select 
	WebElement dropdownEle =driver.findElement(By.id("menu"));
	
	Select sel = new Select(dropdownEle);
	
	//use selection method
	Thread.sleep(3000);
	sel.selectByIndex(3);//selected option according to index
	Thread.sleep(3000);
	sel.selectByVisibleText("Gulab Jamun");//selected option according to visibleText
	Thread.sleep(3000);
	sel.selectByValue("v3");//selected option according to value
	
	//launch multipal select dropdown webpage 
	driver.navigate().to("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
	//identify dropdown 
	// multiselect dropdown
	WebElement Dropdown = driver.findElement(By.id("menu"));
	
	
	
	
	
	
	}

}
