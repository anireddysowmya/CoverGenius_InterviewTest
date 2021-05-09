package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productCategory {
	public WebDriver driver;
	
	By eyeWearProduct= By.id("sunglasses-insurance");
	By nextBtn= By.xpath("//button[@type='submit']");
	By acceptCookie= By.id("rcc-confirm-button");
	
	
public productCategory(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

	
	
	public WebElement eyeWearProduct() {
		WebElement ele=driver.findElement(eyeWearProduct);
		ele.click();
	return ele;
	
	
	}
	
	
	public WebElement next() {
		WebElement ele=driver.findElement(nextBtn);
		ele.click();
	return ele;
	
	
	}
	
	
	public WebElement cookie() {
		WebElement ele=driver.findElement(acceptCookie);
		ele.click();
	return ele;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	












}
