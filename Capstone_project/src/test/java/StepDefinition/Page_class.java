package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_class {
	
WebDriver driver;
	
	public Page_class(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void demouserlogin() {
		//Login
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
	}

	
	public void addtocartitem() throws InterruptedException {
		//add to cart button
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click(); 
		Thread.sleep(3000);
		
	}
	
	public void deleteitemfromcart() { 
	//cross button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[1]")).click();
		
	}
	
	public void Offers() {
		driver.findElement(By.partialLinkText("Offers")).click();
	}
	
	public void Orders() {
		driver.findElement(By.partialLinkText("Orders")).click();
	}

	
    public void Search() {
		
		WebElement Search = driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		Search.sendKeys("iphone12");
		Search.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]")).click();
		
	}
    
    public void Orderby() {
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select")).click();
		driver.findElement(By.cssSelector("select>option[value=\"lowestprice\"]")).click();
		
	}
    
    
	public void Favourites() {
		
		driver.findElement(By.id("favourites")).click();
		
	}
    
	
	
	public void Checkoutpage(String firstname, String lastname, String address, String state, String postalcode) {
		//add to cart
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		//checkout page
		driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
		
		WebElement firstname1 = driver.findElement(By.id("firstNameInput")); 
		firstname1.clear();
		firstname1.sendKeys(firstname);

		
		WebElement lastname1 = driver.findElement(By.id("lastNameInput"));
		lastname1.clear();
		lastname1.sendKeys(lastname);
		

		
		WebElement Address = driver.findElement(By.id("addressLine1Input"));
		Address.clear();
		Address.sendKeys(address);
		
		
		WebElement State = driver.findElement(By.id("provinceInput"));
		State.clear();
		State.sendKeys(state);
	
		WebElement postalcode1 = driver.findElement(By.id("postCodeInput"));
		postalcode1.clear();
		postalcode1.sendKeys(postalcode);

		
		driver.findElement(By.id("checkout-shipping-continue")).click();		
        driver.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	}
	
		

	public void Logout() {
		driver.findElement(By.id("signin")).click();
	}

	
}
