package StepDefinaton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebay_loginpage {
	WebDriver driver;
	cucumber_pageclass login;
	
	@Given("login page navigate to defauly browser")
	public void login_page_navigate_to_defauly_browser() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
	    
	

	@When("user enter the email and their password")
	public void user_enter_the_email_and_their_password() throws InterruptedException {
		login = new cucumber_pageclass(driver);
        login.login();
    }
	    

	@Then("signin successfully")
	public void signin_successfully() {
		 System.out.println("Login validated.");
	        driver.quit();
	    
	}


}
