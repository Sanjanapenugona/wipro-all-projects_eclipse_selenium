package StepDefinaton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class languageChange {
	WebDriver driver;
	cucumber_pageclass changelanguage;
	@Given("for changing language scrool down the screen")
	public void for_changing_language_scrool_down_the_screen() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	}

	@When("change country to Spain")
	public void change_country_to_spain() throws InterruptedException {
		changelanguage = new cucumber_pageclass(driver);
		changelanguage.LanguageChange();
	    
	}

	@Then("country change successfully")
	public void country_change_successfully() {
		System.out.println("successfully laguage changed");
        driver.quit();
	    
	}

}
