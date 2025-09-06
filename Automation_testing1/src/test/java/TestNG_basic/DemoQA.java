package TestNG_basic;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoQA {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.out.println("Manual test-->"+testexecution);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Sanjana");
		
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Penugonda");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("sanjanapenugonda3@gmail.com");
		
		//radio button ex:gender 
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	    js.executeScript("window.scrollBy(0,400)");
		
		WebElement Mobile=driver.findElement(By.id("userNumber"));
		Mobile.sendKeys("9652126299");
		
		//driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel=new Select(year);
		sel.selectByVisibleText("2002");
		
	WebElement month=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sell=new Select(month);
		sell.selectByVisibleText ("March");
		
		//selecting particular date
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[7]")).click();

		//subject
//		WebElement sub=driver.findElement(By.id("subjectsInput"));
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("Phy");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("co");
//		sub.sendKeys(Keys.ARROW_DOWN);
//		sub.sendKeys(Keys.ENTER);
		String[] subjects = {"Math","Phy","Eco","Eng"};
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		for(String subject:subjects)
		{
			sub.sendKeys(subject);
			sub.sendKeys(Keys.ENTER);
		}		
		//radio button ex:hobbies 
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		
		//upload images
		WebElement image=driver.findElement(By.id("uploadPicture"));
		image.sendKeys("C:\\Users\\nitis\\OneDrive\\Pictures");
		
		WebElement state=driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		//submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
	}

}
