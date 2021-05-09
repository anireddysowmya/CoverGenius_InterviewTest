package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productCondition {

	public WebDriver driver;
	
	By dropdown= By.xpath("//div[@class='react-select__indicator react-select__dropdown-indicator css-tlfecz-indicatorContainer']");
	By quote= By.xpath("//button[@type='submit']");
	By conditionField= By.xpath("//div[@class='react-select__control css-yk16xz-control']");
	By dropdownField= By.xpath("//div[@class='react-select__input']");


public productCondition(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

public WebElement brandCondition() throws InterruptedException {
	
	new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(dropdownField));
	WebElement ele1= driver.findElement(dropdownField);
	ele1.click();
	Thread.sleep(2000);
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.CONTROL,Keys.ENTER);
	actions.build().perform();
	return ele1;
	
	
}


public WebElement quoteBtn() {
	
	WebElement ele= driver.findElement(quote);
	ele.click();
	
	return ele;
	
	
}





}
