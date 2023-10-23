package selectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         FirefoxDriver driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("file:///C:/Users/shant/OneDrive/Desktop/WebElement/multiselectdropdown.html");
         
         WebElement dropDownEle = driver.findElement(By.name("menu"));
        Select sel = new Select(dropDownEle);
        /* //select single option from multiselect dropdown
         //sel.selectByIndex(2);
         //deselect single option from multiselect dropdown
         //sel.deselectByIndex(2);
         
        //select multiple option  
         for (int i=0;i<3;i++)
         {
        	 Thread.sleep(2000);
        	 sel.selectByIndex(i);
         }
         Thread.sleep(3000);
         
         //deselect multiple option
         
         for (int i=0;i<3;i++)
         {
        	 Thread.sleep(2000);
        	 sel.deselectByIndex(i);
         }*/
         
         
       //select multipal option from dropdown by using selectByValue();
         
   /*  String [] array = {"v1","v2","v3","v4","v5"};
     
     for (int i=0;i<array.length;i++)
     {
    	 Thread.sleep(2000);
    	 sel.selectByIndex(i);
    	 
     }
     
     Thread.sleep(2000);
     //deselect by value
     for(int i=0;i<array.length;i++)
     {
    	 Thread.sleep(2000);
    	 sel.deselectByValue(array[i]);
    	 
    	 
     }*/
     
         
      //select the option from multiselect drodown by using 
        //selectByVisibleText()
        sel.selectByVisibleText("Paani Puri");
        
        Thread.sleep(2000);
        
       // sel.deselectByVisibleText("Paani Puri");
        sel.deselectAll();
        
        for(int i=0;i<3;i++)
        {
        	Thread.sleep(2000);
        	sel.selectByIndex(i);
        }
        Thread.sleep(2000);
        sel.deselectAll();
        
        
         
         
	}

}
