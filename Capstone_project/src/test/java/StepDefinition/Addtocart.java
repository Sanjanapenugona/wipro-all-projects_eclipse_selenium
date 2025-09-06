package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocart {
	WebDriver driver;
	
	@Given("User is logged in with the credintials")
	public void user_is_logged_in_with_the_credintials() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User want to add product into the cart")
	public void user_want_to_add_product_into_the_cart() throws InterruptedException {
		Page_class pg = new Page_class(driver);
	    pg.demouserlogin();
	    pg.addtocartitem();   
	    
	}

	@Then("product added successfully")
	public void product_added_successfully() {
		System.out.println("Product added successfully");
		driver.close();
	    
	}




}
