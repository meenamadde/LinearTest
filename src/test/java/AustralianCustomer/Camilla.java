package AustralianCustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Camilla {
  @Test
  public void camillatest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening, camilla",true);
	  driver.get("https://au.camilla.com/");
	  driver.manage().deleteAllCookies();
      Thread.sleep(7000);
	  driver.close();
	  
	  
	  
  }
}
