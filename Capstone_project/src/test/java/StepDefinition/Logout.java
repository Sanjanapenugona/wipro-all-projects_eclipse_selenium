package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	WebDriver driver;
	
	@Given("User is open Bstackdemo and login withe credintials")
	public void user_is_open_bstackdemo_and_login_withe_credintials() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("Click on logout")
	public void click_on_logout() {
		Page_class pg = new Page_class(driver);
	    pg.demouserlogin();
	    pg.Logout();
	    
	}

	@Then("User successfully logout")
	public void user_successfully_logout() {
		System.out.println("User Successfully logout");
	   
	}

}
