package com.SauceDemo.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;


public class TC04_VerifyAllProductFunctionality extends TestBaseClass
{
	
		@Test
		public void VerifyAllProductFunctionality() throws IOException
		{
			
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickallproducts();
		log.info("click on all product");
		ScreenshotClass.takeScreenshot(driver);
		
		//--validation--//
		String expectedproduct = "6";
		String actualproduct = hp.gettextfromaddtocart();
		
		log.info("actual product->"+actualproduct);
		
		log.info("apply validation");

		Assert.assertEquals(actualproduct, expectedproduct);		
		}
		
}
