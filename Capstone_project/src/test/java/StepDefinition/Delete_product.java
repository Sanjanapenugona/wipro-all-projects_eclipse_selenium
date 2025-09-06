package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_product {
	WebDriver driver;
	
	@Given("User is able to login with Username and password")
	public void user_is_able_to_login_with_username_and_password() {
		driver = new ChromeDriver();
	    driver.get("https://bstackdemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("Delete item from cart")
	public void delete_item_from_cart() throws InterruptedException {
		Page_class pg = new Page_class(driver);
		pg.demouserlogin();
	    pg.addtocartitem();
	    pg.deleteitemfromcart();
	    
		
	    
	}

	@Then("Item deleted successfully")
	public void item_deleted_successfully() {
		System.out.println("Item deleted successfully");
	    
	}




}
