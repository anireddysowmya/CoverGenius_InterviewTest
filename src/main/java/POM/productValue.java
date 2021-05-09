package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productValue {
	public WebDriver driver;
	
	By value= By.xpath("//input[@name='retail_value']");
	By nextBtn= By.xpath("//button[@type='submit']");
	
public productValue(WebDriver driver) {
		
		this.driver= driver;
		
		
	}


public WebElement retailValue() {
	WebElement ele= driver.findElement(value);
	ele.sendKeys("500");
	
	return ele;
}

public WebElement next() {
	WebElement ele=driver.findElement(nextBtn);
	ele.click();
return ele;


}






}
