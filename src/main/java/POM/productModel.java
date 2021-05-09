package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productModel {
	public WebDriver driver;
	
	By model= By.xpath("//input[@name='model']");
	By nextBtn= By.xpath("//button[@type='submit']");

public productModel(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

public WebElement modelName() {
	WebElement ele= driver.findElement(model);
	ele.sendKeys("Clubmaster");
	
	return ele;
}

public WebElement next() {
	WebElement ele=driver.findElement(nextBtn);
	ele.click();
return ele;


}









}
