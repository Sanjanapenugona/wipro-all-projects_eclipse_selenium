package TestNG_basic;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	WebDriver driver;
	  @Test
	  public void chromebrowser1() throws InterruptedException {
		  driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  String expectedtitle="online shopping";
		  String actualtitle=driver.getTitle();
		//  Assert.assertEquals(actualtitle, expectedtitle," Title validation fail");
		  Thread.sleep(2000);
		  
	  }
	  public void firefoxbrowser() throws InterruptedException {
		  System.setProperty("webdriver.firefox.driver","\"C:\\Users\\Sanjana\\OneDrive\\Desktop\\Selenium files\\geckodriver-v0.36.0-win32.zip\"");
		  driver=new FirefoxDriver();
		  driver.get("https://www.flipkart.com/");
		  String expectedtitle="online shopping";
		  String actualtitle=driver.getTitle();
		//  Assert.assertEquals(actualtitle, expectedtitle," Title validation fail");
		  Thread.sleep(2000);
		  
	  }
	  public void edgebrowser() throws InterruptedException {
		  System.setProperty("webdriver.edge.driver", "\"C:\\Users\\Sanjana\\OneDrive\\Desktop\\Selenium files\\edgedriver_win64.zip\"");
		  driver=new EdgeDriver();
		  driver.get("https://www.flipkart.com/");
		  String expectedtitle="online shopping";
		  String actualtitle=driver.getTitle();
	//	  Assert.assertEquals(actualtitle, expectedtitle," Title validation fail");
		  Thread.sleep(2000);
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
  }

}
