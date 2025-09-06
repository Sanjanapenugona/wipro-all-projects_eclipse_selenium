package TestNG_basic;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class action_alert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	//drag and drop
	driver.get("https://demoqa.com/droppable");
	driver.manage().window().maximize();
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	action.dragAndDrop(source, target).perform();
	
	//multiple options
	driver.get("https://demoqa.com/select-menu");
    WebElement multiSelect = driver.findElement(By.id("cars"));
    Select select = new Select(multiSelect);

    if(select.isMultiple()){
        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Saab");
        select.selectByIndex(4); 

        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected options:");
        for(WebElement option : selectedOptions){
            System.out.println(option.getText());
        }
    }
    //promptalert
    WebElement promptalert=driver.findElement(By.id("promtButton"));
	promptalert.click();
	//Thread.sleep(2000);
	//Alert alert123=driver.switchTo().alert();
	Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
	System.out.println("promptalert Message: " + alert3.getText());
	alert3.sendKeys("nikki");
	alert3.accept();
}	


	}


