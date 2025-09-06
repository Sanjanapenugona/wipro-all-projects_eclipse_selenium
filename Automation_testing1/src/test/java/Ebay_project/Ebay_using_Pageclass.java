package Ebay_project;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.Arrays;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ebay_using_Pageclass {
	WebDriver driver;
	Pageclass pg;
	private By search;
	private By search_btn;
	private By addToCartBtn;
	@BeforeTest
	public void setup() {
	driver = new ChromeDriver();
	pg=new Pageclass(driver);
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=1)
	public void login() {
	driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	pg.email_in();
	pg.con_in();
	pg.pass_in();
	pg.submit_in();
	}
	@Test(priority=2)
	public void search() throws InterruptedException {
	pg.search_in();
	}
	@Test(priority = 3)
	public void testAddToCart() throws InterruptedException
	{
	pg.testAddToCart();
	pg.removecart();
	}
	@Test(priority = 5)
	public void changeloginname() throws
	InterruptedException {
	pg.changeloginname();
	}
	@Test(priority = 6)
	public void shopByCategoriesTest() throws
	InterruptedException {
	pg.shopByCategoriesTest();
	}
	@Test(priority = 7)
	public void shopByAllCategoriesTest() throws InterruptedException {
	pg.shopByAllCategoriesTest();
	}
	@Test(priority = 8)
	public void productDescriptionTest() throws InterruptedException {
	pg.productDescriptionTest();
	}
	@Test(priority = 8)
	public void languageChnage() throws
	InterruptedException {
	pg.languageChnage();
	}
	}