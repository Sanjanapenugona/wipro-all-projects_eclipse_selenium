package StepDefinaton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shopbyallcate {
	WebDriver driver;
	cucumber_pageclass shopbyallcate;
	
	@Given("shop by all category is available in home page")	
	public void shop_by_all_category_is_available_in_home_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	    
	

	@When("user should be click on shop by all category")
	public void user_should_be_click_on_shop_by_all_category() throws InterruptedException {
		shopbyallcate = new cucumber_pageclass(driver);
		shopbyallcate.shopByallCat();
	
	    
	}

	@Then("it display all categories")
	public void it_display_all_categories() {
		System.out.println("showing all categories");
	    

	}

}
