package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Favourites {
	WebDriver driver;
	
	@Given("Open bstackdemo url")
	public void open_bstackdemo_url() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User must be click on Favourites button")
	public void user_must_be_click_on_favourites_button() {
		Page_class pg = new Page_class(driver);
		pg.demouserlogin();
		pg.Favourites();
	    
	}

	@Then("Successfully open Favourites page")
	public void successfully_open_favourites_page() {
		System.out.println("Successfully open Favourites page");
	    
	}




}
