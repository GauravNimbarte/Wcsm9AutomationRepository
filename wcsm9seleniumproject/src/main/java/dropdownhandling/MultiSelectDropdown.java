package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://demoapps.qspiders.com/");
	    
	    //identify options
	    
	    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	    driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	    WebElement dropdown = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	    Select sel = new Select(dropdown);
	    
	    Thread.sleep(2000);
	    for(int i=0;i<=5;i++)
	    	
	    {
	    	Thread.sleep(2000);
	    	sel.selectByIndex(i);
	    }

	}

}
