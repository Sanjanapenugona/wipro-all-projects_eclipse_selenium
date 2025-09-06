package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkoutpage_shippingaddress {
	WebDriver driver;
	
	@Given("User login to home page with credintials")
	public void user_login_to_home_page_with_credintials() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("Click on checkoutpage and enter all details for order")
	public void click_on_checkoutpage_and_enter_all_details_for_order() {
		Page_class pg = new Page_class(driver);
		pg.demouserlogin();
		pg.Checkoutpage();
	    
	}

	@Then("Order confirm successfully")
	public void order_confirm_successfully() {
		System.out.println("Order confirm successfully");
	   
	}



}
