package TestNG_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orange_webApplication {

	public static void loginStep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException
	{
		System.out.println("Manual test-->"+testexecution);
		
		//loacting username test field
		WebElement user=driver.findElement(By.name("username"));
		user.click();
		user.sendKeys(user1);
		
		//locating password test field
		WebElement pass=driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys(pass1);
		
		//click on signin button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);	
		
		//Navigate back to login page for next test data
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	public static void main(String[] args)throws InterruptedException {
		
		//webDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//System.out.println("welcome to orange HRM login page");
		
		loginStep(driver,"678833","admin123","Unable to login");
		loginStep(driver,"Admin","63874894","Unable to login");
		loginStep(driver,"55tyyh","63874894","Unable to login");
		loginStep(driver,"","","Unable to login");
		loginStep(driver,"Admin","admin123","user is able to login successfully ");
		driver.close();
	}

}
