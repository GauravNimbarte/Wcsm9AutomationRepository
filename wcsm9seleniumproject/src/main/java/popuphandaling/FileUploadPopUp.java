package popuphandaling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		  
		  driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		  driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		  WebElement custom = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		  
		  //perform doubleclick on filebutton whoch 
		  Actions act = new Actions(driver);
		  act.doubleClick(custom).perform();
		  
		  //handale file
		  File file = new File("./autoITPgm/FileUpload.exe");
		   String abspath = file.getAbsolutePath();
		   
		  Runtime.getRuntime().exec(abspath);
		  Thread.sleep(6000);
		  Runtime.getRuntime().exec(abspath);
		  
		  
		  
		  driver.quit();
		  
		
		}


}
