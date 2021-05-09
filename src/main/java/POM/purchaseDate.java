package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class purchaseDate {
	public WebDriver driver;
	
By dateField= By.id("953b0ba7-d4bc-4069-b8b3-004bea50b2d8");
By calender= By.xpath("//div[@class='DayPicker_focusRegion DayPicker_focusRegion_1']");
By Month= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/strong[1]");
By nextMonth = By.xpath("//*[@id=\"Main\"]/div/form/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]");
By dates= By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']//tbody//td");
By nextBtn= By.xpath("//button[@type='submit']");


public WebElement calbody;
public List<WebElement> calDates;




public WebElement cal;
public WebElement calyear;

public purchaseDate(WebDriver driver) {
		
		this.driver= driver;
		
		
	}

public WebElement next() {
	WebElement ele=driver.findElement(nextBtn);
	ele.click();
return ele;


}

public WebElement month() {
	return driver.findElement(Month);
}

public WebElement calBody() {
	calbody= 	driver.findElement(calender);
	return calbody;
}



public WebElement date() {
	
	WebElement ele= driver.findElement(dateField);
	ele.click();
	return ele;



}

public List<WebElement> caldates() {
	
calDates=  calbody.findElements(dates);
return calDates;
}

public WebElement nextMonth() {
	WebElement ele= driver.findElement(nextMonth);
	ele.click();
	return ele;
	
}



}
