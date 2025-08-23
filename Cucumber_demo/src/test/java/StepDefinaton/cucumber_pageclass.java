package StepDefinaton;import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class cucumber_pageclass {
	WebDriver driver;
	private Object keys;

	public cucumber_pageclass(WebDriver driver)
	{
		this.driver= driver;
		
	}
	public void login() throws InterruptedException 
    {
		

		driver.findElement(By.cssSelector(".gh-identity-signed-out-unrecognized > a:nth-child(1)")).click();
	
		driver.findElement(By.id("userid")).sendKeys("sanjanapenugonda3@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Sanjana@123");
		driver.findElement(By.id("sgnBt")).click();

		System.out.println("successfully login");
		Thread.sleep(3000);
	}
	
	
	public void Search() throws InterruptedException 
	{
		
	     
		 WebElement search=driver.findElement(By.id("gh-ac"));
		  search.sendKeys("Watch");
		  search.sendKeys(Keys.ENTER);
		  driver.navigate().refresh();
		}
	
	
	
	public void addToCartandDelete() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		 searchBox.clear();
		 searchBox.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.get("https://www.ebay.com/itm/314074071401?_skw=New+Sony+WH-1000XM5%2FB+Wireless+Industry+Leading+Noise+Canceling+Bluetooth+Headphones&epid=22054478105&itmmeta=01K35YSBGJVARN9PJ9JCF2PJJ4&hash=item4920460169:g:M68AAeSw5D1opmZ2&itmprp=enc%3AAQAKAAABEFkggFvd1GGDu0w3yXCmi1c3tSgm%2BT5%2BwjYvrwfzuGAG2atqwTVjj0R%2FxhBeIhaUsuILYW%2BZ%2Fkcr25GYqx9wuP4l2jtqi9daEN4wd9sI4Vw2TIzlFT0dqgxl02ldLi%2BDuMZ6W10g9IZxuK1B6jWuBr2W6jBCsftWrjtKEHd5550Ry%2B7HO1L26Oy8oa%2FROxb%2FqmeYY2B2zrO7vZuNIsnIX0XpjUu04tYJezgz%2FFYyPNlttPCoMwftUlTvH74iyzlw3sXDQ%2FcVRcXUDYZCP13jDytUZv6MYJp53qqq6rg1N10s9BjPyQEb%2BeOLova2kjnvrKLlTjJ0Q2UveIoH7rTYjkGhwRrqlrIeha2oJ51JrwtQ%7Ctkp%3ABk9SR7i45b6ZZg");

	     // Switch to product page tab
	     for (String handle : driver.getWindowHandles()) {
	         driver.switchTo().window(handle);
	     }

	     // 3. Click Add to Cart
	     WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]/span/span"));
	     addToCartBtn.click();
	 
	     Thread.sleep(3000);
	}
	
	public void removecart() {
		 WebElement removecart = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a/span/span"));
	     removecart.click();
	     WebElement remove = driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
	     remove.click();
		
	}
	
	public void changeAddressAndName() throws InterruptedException {
	   
	    driver.findElement(By.linkText("My eBay")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Summary")).click();
        Thread.sleep(2000);

        // Go to Account Settings → Personal Info
        driver.findElement(By.linkText("Account")).click();
        Thread.sleep(2000);
       

        driver.findElement(By.linkText("Personal Information")).click();
        Thread.sleep(3000);

        // 4. Click edit on Name
        driver.findElement(By.xpath("//a[contains(text(),'Edit') and contains(@href,'name')]")).click();
        Thread.sleep(2000);

        // 5. Change name
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.clear();
        firstName.sendKeys("Sanju");

        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("Penugonda");

        driver.findElement(By.id("saveBtn")).click();
        Thread.sleep(3000);
    }
	
	
   public void shopByCategory() throws InterruptedException 
   {
   	
       driver.navigate().to("https://www.ebay.com/");
       Actions act = new Actions(driver);
   	WebElement motors = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
   	motors.sendKeys("motors");
   	Thread.sleep (2000);
   
   	WebElement sports = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
   	sports.sendKeys("sports");
   	Thread.sleep (2000);
   	
   	WebElement fashion= driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
   	fashion.sendKeys("fashion");
   	
       Thread.sleep(4000);
   }
	
   public void shopByallCat() throws InterruptedException 
   {
     
       driver.findElement(By.id("gh-cat")).click();
       driver.findElement(By.id("gh-search-btn")).click();
      
       Thread.sleep(3000);
   }
   
   public void LanguageChange() throws InterruptedException
   {
	   WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		 country.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Spain")).click();
   
	
   }

}
