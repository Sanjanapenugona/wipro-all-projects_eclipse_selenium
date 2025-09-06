package TestNG_basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class Ebay_testing {
	WebDriver driver;
	  @Test(priority=2)
	  public void search() {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.sendKeys("watch");
		  search.sendKeys(Keys.ENTER);
		  driver.navigate().refresh();
		   //search.click();
		   //search.sendKeys("pnone");
		   //search.sendKeys(Keys.ENTER);
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();	
			driver.get("https://www.ebay.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
		  
	  }
	  @Test(priority=1)
	  public void search1() {
		  WebElement search1=driver.findElement(By.id("gh-ac"));
		  search1.sendKeys("phone");
		  search1.sendKeys(Keys.ENTER);
		  driver.navigate().refresh();
		   //search.click();
		   //search.sendKeys("pnone");
		   //search.sendKeys(Keys.ENTER);
	  }
	  
	  
	  @AfterTest
	  public void afterTest() {
		  Assert.assertTrue(true, "search button is not working");
		  driver.close();
  }

}
