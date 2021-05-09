package Xcover.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
public WebDriver driver;
public Properties prop;
//Driver Initialization	
public WebDriver browserDriver(String browser) throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Naresh Reddy\\eclipse-workspace\\CoverGenius\\External\\Config.properties");
		prop.load(fis);
	    browser= prop.getProperty("browser");
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh Reddy\\eclipse-workspace\\CoverGenius\\Drivers\\Chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		return driver;
}
}
		
	

