package StepDefinaton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SopByCategory {
	WebDriver driver;
	cucumber_pageclass shopbycate;
	
	@Given("shop by category option available on home page")
	public void shop_by_category_option_available_on_home_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	}

	@When("user must be click on shop by category and select on category")
	public void user_must_be_click_on_shop_by_category_and_select_on_category() throws InterruptedException {
		shopbycate = new cucumber_pageclass(driver);
		shopbycate.shopByCategory();
	    
	}

	@Then("it display all all sub categories")
	public void it_display_all_all_sub_categories() {
		System.out.println("it showing all sub categories");
	    
	}


}
