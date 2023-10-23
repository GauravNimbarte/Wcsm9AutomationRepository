package assingnMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.netflix.com/in/login");
// identify email 
driver.findElement(By.id("id_userLoginId")).sendKeys("gaurav@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("id_password")).sendKeys("1234567");
Thread.sleep(2000);
//identify sign in button
driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
}
}
