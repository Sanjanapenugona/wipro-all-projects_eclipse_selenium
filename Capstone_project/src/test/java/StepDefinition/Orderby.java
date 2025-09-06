package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orderby {
	WebDriver driver;
	
	
	@Given("Open the Bstackdemo url")
	public void open_the_bstackdemo_url() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User click on Orderby option select one option for prices")
	public void user_click_on_orderby_option_select_one_option_for_prices() {
		Page_class pg = new Page_class(driver);
		pg.Orderby();
		
	}

	@Then("Successfully sorted the all prices")
	public void successfully_sorted_the_all_prices() {


	}




}
