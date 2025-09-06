package TestNG_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.cssSelector("div>input[id=\"firstName\"]"));
		fname.sendKeys("Sanjana");
		
		
		WebElement lname=driver.findElement(By.cssSelector("div>input[id=\"lastName\"]"));
		lname.sendKeys("penugonda");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.cssSelector("select>option[value=\"1903\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"5\"]")).click();
		driver.findElement(By.cssSelector("div>[aria-label=\"Choose Tuesday, May 12th, 1903\"]")).click();

	}

}
