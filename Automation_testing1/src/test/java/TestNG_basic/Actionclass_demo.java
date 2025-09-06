package TestNG_basic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleclick).perform();
		String doubleClickMsg = driver.findElement(By.id("doubleClickMessage")).getText();
        System.out.println("DoubleClick Message: " + doubleClickMsg);
        
        WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightclick).perform();
        String rightClickMsg = driver.findElement(By.id("rightClickMessage")).getText();
        System.out.println("RightClick Message: " + rightClickMsg);
        Thread.sleep(2000);
	
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.contextClick(click).perform();
		String ClickMsg = driver.findElement(By.id("dynamicClickMessage")).getText();
        System.out.println("Single Click Message: " + ClickMsg);
        Thread.sleep(3000);
        
		
		
		
		//perform mouse over actions
//		driver.get("https://www.ebay.com/");
//		driver.manage().window().maximize();
//		Actions act=new Actions(driver);
//		WebElement motors=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
//		act.moveToElement(motors).perform();
//		Thread.sleep(3000);
//		WebElement sports=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
//		act.moveToElement(sports).perform();
//		Thread.sleep(3000);
//		WebElement fashion=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
//		act.moveToElement(fashion).perform();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions act1=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act1.dragAndDrop(source, target).perform();
	}

}
