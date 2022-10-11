package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TestBaseClass 
{
	public WebDriver driver;
	Logger log= Logger.getLogger("SauceDemo");	
	
//	used to perform multibrowser testing
	@Parameters("browserName")
	@BeforeMethod
//	method argument pass string
	public void setUp(String browserName) throws IOException

//	public void setUp() throws IOException
	{
//		if else is used to select differnt browser to perform multibrowser testing
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFiles\\chromedriver.exe");

		driver = new ChromeDriver();

		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
				"./DriverFiles\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\DELL\\OneDrive\\TESTING\\chromedriver_win32\\chromedriver.exe");
//
//		driver = new ChromeDriver();
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser is opened");
		
		driver.manage().window().maximize();
		log.info("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screesnhot
		ScreenshotClass.takeScreenshot(driver);
		
		
		//loginPage elements find +action perform
		
		LoginPOMClass x = new LoginPOMClass(driver);
		
		x.sendusername();
		log.info("username is entered");
		
		x.sendpassword();
		log.info("Password is entered");
		
		x.clickloginbutton();
		log.info("Clicked on login button");
	    
		ScreenshotClass.takeScreenshot(driver);
				
	}
	
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			log.info("browser is closed");
	       
			log.info("end of Program");	
		}


}
