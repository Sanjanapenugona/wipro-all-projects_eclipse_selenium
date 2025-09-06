package TestNG_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

public class Multiple_select {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        try {
	        	//select blue from oldstyleDropdown
	            driver.get("https://demoqa.com/select-menu");
	            WebElement oldstyleDropdown = driver.findElement(By.id("oldSelectMenu"));
	            Select selectOld = new Select(oldstyleDropdown);
	            selectOld.selectByVisibleText("Blue");
	            System.out.println("Selected color from old-styledropdown: " + selectOld.getFirstSelectedOption().getText());

	            //multiple options from multi-selectdropdown 
	            WebElement multiSelectoption = driver.findElement(By.id("cars")); // multi-select dropdown
	            Select selectMulti = new Select(multiSelectoption);

	            if (selectMulti.isMultiple()) {
	                selectMulti.deselectAll(); // clear any previous selection
	                selectMulti.selectByVisibleText("Green");
	                selectMulti.selectByVisibleText("Yellow");
	                selectMulti.selectByVisibleText("Black");

	                System.out.println("Selected options in multi-select:");
	                List<WebElement> selectedOptions = selectMulti.getAllSelectedOptions();
	                for (WebElement option : selectedOptions) {
	                    System.out.println("- " + option.getText());
	                }
	            } 
	            else 
	            {
	                System.out.println("Dropdown is not multi-select.");
	            }

	            // Select using index
	            selectOld.selectByIndex(3); 
	            System.out.println("Selected color by index: " + selectOld.getFirstSelectedOption().getText());

	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        } finally
	        {
	            driver.quit();
	        }
	}

}
