package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   // driver.get("http://demoapps.qspiders.com/");
	    
	    //identify options
	    // we can not perform deselection method on single select dropdown---------------------?
	    //we get UnsupportedOperationException----------------------------------?
	    
//	    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
//	    WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,' transition-all duration-150 w-5/12')]"));
//	    Select sel = new Select(dropdown1);
//	    
//	    //select the options
//	    sel.selectByIndex(2);
//	    
//	    Thread.sleep(2000);
//	    sel.deselectByIndex(2);
	    
	    
	    //perform deselection on multiselect dropdown
	    
	    driver.navigate().to("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
	    
	    WebElement dropdown4 = driver.findElement(By.id("menu"));
	    Select sel4 = new Select(dropdown4);
	    sel4.selectByIndex(5);
	      
	    Thread.sleep(2000);
	    
	    sel4.deselectByIndex(5);
	    
	    
	    //select multipal option from multi select dropdown
	    Thread.sleep(2000);
	    for(int i=0;i<=5;i++)
    {
	    	Thread.sleep(2000);
	    	sel4.selectByIndex(i);
	
    }  
	    
	    for(int i=0;i<=5;i++)
	    {
		    	Thread.sleep(2000);
		    	sel4.deselectByIndex(i);
		
	    }  
	    Thread.sleep(2000);
	    
	    sel4.selectByValue("v3");
	    Thread.sleep(2000);
	    sel4.deselectByValue("v3");
	    
	    //
	    
	    sel4.selectByVisibleText("tea");
	    Thread.sleep(2000);
	    sel4.deselectByVisibleText("tea");
	    
	    

   }
}
