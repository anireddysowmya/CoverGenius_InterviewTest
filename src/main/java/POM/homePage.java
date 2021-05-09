package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	public WebDriver driver;
	
	
By quoteBtn= By.id("nav-get-quote-button");
	
	

	public homePage(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

public WebElement quote() {

	WebElement ele= driver.findElement(quoteBtn);
	ele.click();
	return ele;

}




}
