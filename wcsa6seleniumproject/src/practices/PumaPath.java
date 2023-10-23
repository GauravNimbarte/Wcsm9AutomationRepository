package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaPath {
	public static void main(String[] args) throws InterruptedException {
WebDriver	driver	= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=BS&utm_aud=OTH&utm_obj=OLC&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&gclid=EAIaIQobChMIgJuqrNCrgAMVhdBMAh0cXgKhEAAYASAAEgI5f_D_BwE");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(@data-test-id,'item-price')]")).click();
Thread.sleep(2000);


	}

}
