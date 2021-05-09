package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productAddress {
	public WebDriver driver;
	
	By address= By.id("geosuggest__input");
	By nextBtn= By.xpath("//button[@type='submit']");
	
	

public productAddress(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

public WebElement productAddress() {
	
	WebElement ele= driver.findElement(address);
	ele.click();
ele.sendKeys("Parramatta Road, Auburn NSW, Australia");
ele.sendKeys(Keys.CONTROL,Keys.ARROW_DOWN);
ele.sendKeys(Keys.ENTER);
return ele;




}
public WebElement next() {
	WebElement ele=driver.findElement(nextBtn);
	ele.click();
return ele;


}





}
