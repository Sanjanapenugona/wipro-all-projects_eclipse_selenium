package TestNG_basic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Url_validation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first Automation Script");
		//setup browser (Chrome driver, firefox driver)
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitis\\OneDrive\\Desktop\\java_selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// create object for Browser
			
		WebDriver driver=new ChromeDriver();
		//Set WebApplication URL
		driver.get("https://www.selenium.dev");
		
		String expectedurl="https://www.selenium.dev/";
		String actualurl=driver.getCurrentUrl();
		System.out.println("Expected URL:"+expectedurl);
		System.out.println("Actual URL:"+actualurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedurl.equals(actualurl))
		{
			System.out.println("Url validation successful");
		}
		else
		{
			System.out.println("Url validation failed");
		}
		driver.close();

	}

}
