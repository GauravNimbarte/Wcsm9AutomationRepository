package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod_SelectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://demoapps.qspiders.com/");
    
    //identify options
    
    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
    WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,' transition-all duration-150 w-5/12')]"));
    Select sel = new Select(dropdown1);
    
    //select the options
    sel.selectByIndex(2);
    //identify country dropdown
    WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));	
    		Select sel1 = new Select(dropdown2);
    		Thread.sleep(2000);
    		sel1.selectByValue("India");
    		
    		  WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
    		    Select sel3 = new Select(dropdown3);
    		    sel3.selectByVisibleText("Maharashtra");
    		    
    		    //handal multiselect dropdown
    		    Thread.sleep(2000);
    		    driver.navigate().to("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
    		    
    		    WebElement dropdown4 = driver.findElement(By.id("menu"));
    		    Select sel4 = new Select(dropdown4);
    		    sel4.selectByIndex(5);
    		    
    		    //select multipal option from multi select dropdown
    		    Thread.sleep(2000);
    		    for(int i=0;i<=5;i++)
    		    {
    		    	sel4.selectByIndex(i);
    		    }
    		
    		    driver.navigate().to("http://demoapps.qspiders.com/");
    		    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
    		    driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
    		    //identify dropdown
    		    WebElement dropdown5 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
    		    
    		    Select sel5 = new Select(dropdown5);
    		    
    		    for (int i=0;i<=4;i++)
    		    {
    		    	Thread.sleep(2000);
    		    	sel5.selectByIndex(i);
    		    }
	}

}
