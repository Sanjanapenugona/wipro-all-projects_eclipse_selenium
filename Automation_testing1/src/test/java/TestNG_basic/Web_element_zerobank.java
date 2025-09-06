package TestNG_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Web_element_zerobank {

	public static void loginStep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException
	{
		System.out.println("Manual test-->"+testexecution);
		
		//loacting username test field
		WebElement user=driver.findElement(By.id("user_login"));
		user.sendKeys(user1);
		
		//locating password test field
		WebElement pass=driver.findElement(By.id("user_password"));
		//pass.click();
		pass.sendKeys(pass1);
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);	
		
	}
	public static void main(String[] args)throws InterruptedException {
		
		//webDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("welcome to zero bank login page");
		
		loginStep(driver,"678833","password","Unable to login");
		loginStep(driver,"username","63874894","Unable to login");
		loginStep(driver,"55tyyh","63874894","Unable to login");
		loginStep(driver,"","","Unable to login");
		loginStep(driver,"username","password","user is able to login successfully ");
		

	}

}
