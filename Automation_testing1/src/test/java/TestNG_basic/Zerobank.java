package TestNG_basic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zerobank {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("welcome to zero bank login page");
		{
			System.out.println("Manual test::--> Check user is able to login with invalid username and invalid password");
		}
		//locating username test field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("758494");
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("7654433");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login unsuccessfully");
		
		System.out.println("welcome to zero bank login page");
		{
			System.out.println("Manual test::--> Check user is able to login with valid username and invalid password");
		}
		//locating username test field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("76489993");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login unsuccessfully");
		
		
		System.out.println("welcome to zero bank login page");
		{
			System.out.println("Manual test::--> Check user is able to login with invalid username and valid password");
		}
		//locating username test field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("758494");
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login unsuccessfully");
		
		System.out.println("welcome to zero bank login page");
		{
			System.out.println("Manual test::--> Check user is able to login with null username and null password");
		}
		//locating username test field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login unsuccessfully");
		
		{
			System.out.println("Manual test::--> Check user is able to login with valid username and valid password");
		}
		//locating username test field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("login successfully");
		
		//Thread.sleep(5000);
		driver.close();
	
	}

}
