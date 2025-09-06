package StepDefinition;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	//login
	
	@Given("Open BStack demo URL")
	public void open_b_stack_demo_url() {
		 driver = new ChromeDriver();
		    driver.get("https://bstackdemo.com/");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User login with username and password")
	public void user_login_with_username_and_password() {
		Page_class pg = new Page_class(driver);
	    pg.demouserlogin();
	    
	}

	@Then("User login successfully")
	public void user_login_successfully() {
		System.out.println("login sucessfull");
	    driver.close();
	    
	}


}