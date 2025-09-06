package TestNG_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class E_Commerce_testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wix.com/lp-en/ecom");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("input_comp-kyrcpp26"));
		email.sendKeys("sanjanapenugonda3@gmail.com");
		driver.findElement(By.cssSelector("button>span[class=\"l7_2fn wixui-button__label\"]")).click();
		WebElement pass=driver.findElement(By.id(""));
		pass.sendKeys("Sanjana@123");
		

	}

}
