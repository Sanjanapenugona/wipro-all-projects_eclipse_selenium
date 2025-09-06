package Ebay_project;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class Pageclass {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	private By search_btn;
	private By addToCartBtn;
	private By removeFromCartbtn;
	private CharSequence clear;
	public Pageclass(WebDriver driver)
	{
	this.driver=driver;
	}
	@Test(priority = 1)
	public void email_in()
	{
	driver.findElement(email).click();
	driver.findElement(email).clear();
	driver.findElement(email).sendKeys("sanjanapenugonda3@gmail.com");
	}
	public void pass_in()
	{
	driver.findElement(pass).click();
	driver.findElement(pass).sendKeys("Sanjana@123");
	}
	public void con_in()
	{
	driver.findElement(cont).click();
	}
	public void submit_in()
	{
	driver.findElement(submit).click();
	}
	@Test(priority = 2)
	public void search_in() throws InterruptedException
	{
	driver.findElement(search).click();
	driver.findElement(search).sendKeys("watch");
	driver.findElement(search).sendKeys(Keys.ENTER);
	driver.findElement(search).sendKeys(clear);
	Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void testAddToCart() throws InterruptedException {
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
	public void changeloginname() throws InterruptedException {
		 WebElement elementToHover = driver.findElement(By.cssSelector("div[class=\"ghnav__left-wrap\"]"));
		    Actions actions = new Actions(driver);
		    actions.moveToElement(elementToHover).build().perform();
		    Thread.sleep(3000);
		    driver.get("https://accountsettings.ebay.com/uas");
		    Thread.sleep(3000);
		    driver.findElement(By.id("account-settings-link-PI")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("individual_username_edit_button")).click();
		    Thread.sleep(3000);
		    WebElement inp=driver.findElement(By.id("user_name"));
		    inp.clear();
		    inp.sendKeys("Sanjanaa");
		    driver.findElement(By.id("username_submit_edit_btn")).click();
		    Thread.sleep(5000);
		    WebElement name=driver.findElement(By.id("userid"));
		    name.sendKeys("sanjanapenugonda3@gmail.com");
		    driver.findElement(By.id("signin-continue-btn")).click();
		    Thread.sleep(3000);
		    WebElement pass=driver.findElement(By.id("pass"));
		    pass.sendKeys("Sanjana@123");
		    driver.findElement(By.id("sgnBt")).click();
		    Thread.sleep(4000);
		    
	}
	@Test(priority = 6)
	public void shopByCategoriesTest() throws
	InterruptedException {
	try {
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span")).click();
	driver.findElement(By.linkText("Electronics")).click();
	System.out.println("Shop by CategoriesTest: Executed");
	} catch (Exception e) {
	System.out.println("Shop by CategoriesTest Failed: " + e.getMessage());
	}
	}
	@Test(priority = 7)
	public void shopByAllCategoriesTest() {
	try {
	driver.findElement(By.id("gh-cat")).click();
	driver.findElement(By.linkText("See all categories")).click();
	System.out.println("Shop by All Categories Test:Executed");
	} catch (Exception e) {
	System.out.println("Shop by All Categories Test	Failed: " + e.getMessage());
	}
	}
	@Test(priority = 9)
	public void languageChnage() throws InterruptedException {
		//driver.get("https://www.ebay.com/");
	WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
	country.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Spain")).click();
	}
	@Test(priority = 8)
	public void productDescriptionTest() throws
	InterruptedException {
	// 1. Search for product
	driver.findElement(By.id("gh- ac")).sendKeys("headphones");
	driver.findElement(By.xpath("//*[@id=\"gh-search- btn\"]/span")).click();
	Thread.sleep(3000);
	// 2. Find first product image
	WebElement productImage = driver.findElement(By.cssSelector(".s-item img"));
	Actions actions = new Actions(driver);
	actions.contextClick(productImage).perform();
	Thread.sleep(2000);
	System.out.println("Right-click performed onproduct image ");
	}
//	@Test(priority = 9)
//	public void languageChnage() throws
//	InterruptedException {
//	WebElement country = driver.findElement(By.cssSelector("button[class=\"gfflag__button\"]"));
//	country.sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Spain")).click();
//	}
	}