package xcover.testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.homePage;
import POM.productAddress;
import POM.productCategory;
import POM.productCondition;
import POM.productModel;
import POM.productName;
import POM.productValue;
import POM.purchaseDate;
import Xcover.main.base;

public class getQuote extends base{

public WebDriver driver;



@BeforeTest
public void test_driver() throws IOException {
	driver= browserDriver("chrome");
	}


@Test(priority=1)
public void navigate() {
	driver.get(prop.getProperty("url"));
	
	
}

@Test(priority=2)
public void getQuoteForEyeWearProtectionPeriod() throws InterruptedException {
	//Get quote for 
	homePage home= new homePage(driver);
	productAddress address= new productAddress(driver);
	productName name= new productName(driver);
	productModel model= new productModel(driver);
	productValue value= new productValue(driver);
	purchaseDate date= new purchaseDate(driver);
	productCondition condition= new productCondition(driver);
	home.quote();
	productCategory product= new productCategory(driver);
    product.eyeWearProduct();
    product.cookie();
    product.next();
    address.productAddress();
    address.next();
    name.brandName();
    name.next();
    model.modelName();
    model.next();
    value.retailValue();
    value.next();
    date.date();
if(date.month().getText().contains("May 2021")) {
	System.out.println("Purchase month is selected");
}
   date.calBody();
   date.caldates();
   for(int i=0;i<date.calDates.size();i++) {
		
		String[] datepick=date.calDates.get(i).getText().split("");
		String day= datepick[0];
		if (day.equalsIgnoreCase("2")) {
			
			date.calDates.get(i).click();
			break;
		}
	}
   date.next();
   condition.brandCondition();
  condition.quoteBtn();
}
  
  @AfterTest
  public void tearDown() {
	 driver.close(); 
	  
  }
   

	
	
	
	
}



















