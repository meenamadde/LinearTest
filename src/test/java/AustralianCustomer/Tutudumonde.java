package AustralianCustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tutudumonde {
  @Test
  public void tutudumonde() throws InterruptedException  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening, tutudumonde", true);
	  driver.get("https://tutudumonde.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
	  
	  
	
  }
}
