package AustralianCustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Alivia {
  @Test
  public void aliviatest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening, alivia",true);
	  driver.get("https://www.shopalivia.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
	  
	  
	  
	  
  }
}
