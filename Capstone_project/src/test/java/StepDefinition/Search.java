package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	
	@Given("User Have to open the Bstack demo website")
	public void user_have_to_open_the_bstack_demo_website() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Search for item")
	public void search_for_item() {
		Page_class pg = new Page_class(driver);
		pg.Search();
	}

	@Then("Item successfully displayed on screen")
	public void item_successfully_displayed_on_screen() {
		System.out.println("Item successfully displayed on screen");
	   
	}



}
