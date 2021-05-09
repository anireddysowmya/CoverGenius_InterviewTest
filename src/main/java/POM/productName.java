package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productName {
	public WebDriver driver;
	
	By brand= By.xpath("//input[@name='brand']");
	By nextBtn= By.xpath("//button[@type='submit']");


public productName(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

public WebElement brandName() {
	WebElement ele= driver.findElement(brand);
	ele.sendKeys("Rayban");
	
	return ele;
}


public WebElement next() {
	WebElement ele=driver.findElement(nextBtn);
	ele.click();
return ele;


}
}
