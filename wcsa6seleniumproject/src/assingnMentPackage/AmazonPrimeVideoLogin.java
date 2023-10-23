package assingnMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeVideoLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg3aZpuu5Ct3vcg7A4TzQEfV-1ZfnSCndU9Qnechq7uGJAAAAAQAAAABktkMIcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=260-2834038-6260068&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	// identify email text box
	Thread.sleep(2000);
	driver.findElement(By.id("ap_email")).sendKeys("7773998195");
	Thread.sleep(2000);
	//identify password text box
	driver.findElement(By.id("ap_password")).sendKeys("1234567");
	Thread.sleep(2000);
	driver.findElement(By.id("signInSubmit")).click();
	
	}

}
