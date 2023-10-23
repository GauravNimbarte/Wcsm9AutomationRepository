package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {
public static void main(String[] args) throws InterruptedException {
ChromeOptions	co=new ChromeOptions();
co.addArguments("--disable-notification");

//--------------------------
WebDriver	driver=new ChromeDriver(co);
driver.get("https://www.facebook.com/login/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("9552415899");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@type,'pass') ]")).sendKeys("3443");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(.,'Log in')]")).click();
}
}
