package StepDefinaton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocartand_delete {
	WebDriver driver;
	cucumber_pageclass addtocart;
	
	
	@Given("addtocart and delete to cart should be open in default browser")
	public void addtocart_and_delete_to_cart_should_be_open_in_default_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	}

	@When("user must be select product and add to the cart then delete that product")
	public void user_must_be_select_product_and_add_to_the_cart_then_delete_that_product() throws InterruptedException {
		addtocart = new cucumber_pageclass(driver);
		addtocart.addToCartandDelete();
		addtocart.removecart();
	    
	}

	@Then("successfully deleted")
	public void successfully_deleted() {
		System.out.println("Successfully product removed");
        driver.quit();
	   
	}

	
}
