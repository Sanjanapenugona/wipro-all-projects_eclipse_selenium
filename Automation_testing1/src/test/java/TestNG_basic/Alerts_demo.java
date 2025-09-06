package TestNG_basic;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//simplealert
		WebElement simplealert=driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("simple alert Message: " + alert.getText());
		alert.accept();
		
		//timealert
		WebElement timealert=driver.findElement(By.id("timerAlertButton"));
		timealert.click();
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("timeralert Message: " + alert1.getText());
		alert1.accept();
		//confirmalert		
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("confirmalert Message: " + alert2.getText());
		alert2.dismiss();
		//promptalert
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("promptalert Message: " + alert3.getText());
		alert3.sendKeys("nikki");
		alert3.accept();
		
		driver.quit();

	}

}
