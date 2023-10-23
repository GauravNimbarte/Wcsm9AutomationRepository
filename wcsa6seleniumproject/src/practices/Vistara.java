package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Vistara {
	public static void main(String[] args) throws InterruptedException {
		// handal notification popup
	ChromeOptions	co= new ChromeOptions();
	co.addArguments("--disable-notifications");
	
		
		//----------------------------------------------------------------
 WebDriver	driver=new ChromeDriver(co);
 driver.manage().window().maximize();
 driver.get("https://www.airvistara.com/in/en/plantravel/flight-booking");
 
 // identify depart location 
 
 driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("pune");
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("kochi");
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("(//p[@class='label'])[1]")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//li[text()='1 Adult']")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//input[@id='departCalendar' and (@placeholder='Select Departure Date')]")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//a[text()='5']")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//div[text()=' Sep ']")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//a[text()='6']")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//button[@id='pb-searchflight']")).click();
 Thread.sleep(2000);
 driver.quit();
 
	}

 }


