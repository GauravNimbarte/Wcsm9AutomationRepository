package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/singleselectdropdown.html");
	
	WebElement dropdown1 = driver.findElement(By.id("menu"));
	
	//handal dropdown
	Select sel = new Select(dropdown1);
	
	//get all the options from dropdown by using getwrappedele
	WebElement allOps = sel.getWrappedElement();
    System.out.println(allOps.getText());
    
  //get all the options from dropdown by using getOptions
    
    List<WebElement> option = sel.getOptions();
    
//    for( WebElement ops:option)
//    {
//    	System.out.println(ops.getText());
//    }
    //select the ops from dropdown without selection method
    
   for(WebElement op:option)
   {
	   Thread.sleep(2000);
	   if(op.getText().equals("Vada Pav"))
	   {
		   op.click();
		   break;
	   }
   }
     
    
	}

}
