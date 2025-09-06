package Ebay_project;
import org.testng.annotations.Test;
import dev.failsafe.internal.util.Assert;
import org.testng.annotations.BeforeTest;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_ng {
	WebDriver driver;
	private By search;
	private By search_btn;
	private By addToCartBtn;
	@BeforeTest
	public void setup() {
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	}
	@Test(priority = 1)
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
	@Test(priority = 2)
	public void multipleSearches() throws InterruptedException {
//	driver = new ChromeDriver();
//	//driver.get("https://www.ebay.com/");
//	driver.manage().window().maximize();
	// search multiple products
	String[] searches = {"Watch", " TV", " Shoes"};
	for (String search : searches) {
	//driver.findElement(By.id("gh- ac")).sendKeys(search);
	WebElement
	search1=driver.findElement(By.id("gh-ac"));
	search1.clear();
	search1.sendKeys(search);
	search1.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	}
	}
	@Test(priority = 3)
	public void addToCartTest() throws InterruptedException
	{
//		WebElement searchBox = driver.findElement(By.id("gh-ac"));
//		 searchBox.clear();
//		 searchBox.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
//			driver.get("https://www.ebay.com/itm/314074071401?_skw=New+Sony+WH-1000XM5%2FB+Wireless+Industry+Leading+Noise+Canceling+Bluetooth+Headphones&epid=22054478105&itmmeta=01K35YSBGJVARN9PJ9JCF2PJJ4&hash=item4920460169:g:M68AAeSw5D1opmZ2&itmprp=enc%3AAQAKAAABEFkggFvd1GGDu0w3yXCmi1c3tSgm%2BT5%2BwjYvrwfzuGAG2atqwTVjj0R%2FxhBeIhaUsuILYW%2BZ%2Fkcr25GYqx9wuP4l2jtqi9daEN4wd9sI4Vw2TIzlFT0dqgxl02ldLi%2BDuMZ6W10g9IZxuK1B6jWuBr2W6jBCsftWrjtKEHd5550Ry%2B7HO1L26Oy8oa%2FROxb%2FqmeYY2B2zrO7vZuNIsnIX0XpjUu04tYJezgz%2FFYyPNlttPCoMwftUlTvH74iyzlw3sXDQ%2FcVRcXUDYZCP13jDytUZv6MYJp53qqq6rg1N10s9BjPyQEb%2BeOLova2kjnvrKLlTjJ0Q2UveIoH7rTYjkGhwRrqlrIeha2oJ51JrwtQ%7Ctkp%3ABk9SR7i45b6ZZg");
//
//	     // Switch to product page tab
//	     for (String handle : driver.getWindowHandles()) {
//	         driver.switchTo().window(handle);
//	     }
//
//	     // 3. Click Add to Cart
//	     WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]/span/span"));
//	     addToCartBtn.click();
//	 
//	     Thread.sleep(3000);
//	}
//	@Test(priority = 4)
//	public void deleteFromCartTest() {
//		WebElement removecart = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a/span/span"));
//	     removecart.click();
//	     WebElement remove = driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
//	     remove.click();
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
	@Test(priority = 5)
	public void ShopByCategory() throws InterruptedException {
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
	@Test(priority = 8)
	public void productDescriptionTest() {
	driver.findElement(By.id("gh-ac")).clear();
	driver.findElement(By.id("gh-ac")).sendKeys("SmartWatch");
	driver.findElement(By.id("gh-search-btn")).click();
	WebElement productImage = driver.findElement(By.cssSelector(".s-item__image img"));
	Actions actions = new Actions(driver);
	actions.contextClick(productImage).perform();
	productImage.click();
	System.out.println("Product Description TestExecuted");
	}
	
	@Test(priority = 9)
	public void shopByAllCategoriesTest() throws InterruptedException {
		driver.findElement(By.id("gh-cat")).click();
	       driver.findElement(By.id("gh-search-btn")).click();
	      
	       Thread.sleep(3000);
	}
	
	@Test(priority = 10)
	public void changeLanguageTest() throws InterruptedException {
		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		 country.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Spain")).click();
	}
  }


