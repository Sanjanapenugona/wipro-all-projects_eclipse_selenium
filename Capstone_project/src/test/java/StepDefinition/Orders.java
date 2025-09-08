package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {
	WebDriver driver;
	
	@Given("User must be open BStack demo page with user name and password")
	public void user_must_be_open_b_stack_demo_page_with_user_name_and_password() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User have to click on Orders button")
	public void user_have_to_click_on_orders_button() throws InterruptedException {
		Page_class pg = new Page_class(driver);
		pg.demouserlogin();
	//	pg.Checkoutpage();
		pg.Orders();
	    
	}

	@Then("User successfully open Orders page")
	public void user_successfully_open_orders_page() {
	   
	}



}
