package TestNG_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		System.out.println("Page loaded successfully");
		String expectedTitle="Selenium dev";
		String actualTitle=driver.getTitle();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedTitle.equals(actualTitle))
			System.out.println("Title validation successful");
		else
			System.out.println("title validation failed");
		driver.close();

	}

}
