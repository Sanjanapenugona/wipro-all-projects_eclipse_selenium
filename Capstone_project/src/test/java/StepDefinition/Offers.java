package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Offers {
	WebDriver driver;
	
	@Given("User is open to Bstack demo with username and password")
	public void user_is_open_to_bstack_demo_with_username_and_password() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User have to click on offers button")
	public void user_have_to_click_on_offers_button() {
		Page_class pg = new Page_class(driver);
	    pg.demouserlogin();
	    pg.Offers();
	   
	}

	@Then("Successfully open offers page")
	public void successfully_open_offers_page() {
		System.out.println("Successfully offers page opended");
	    
	}



}
