package com.SauceDemo.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;


public class TC03_VerifyBagProductFunctionality extends TestBaseClass
{	
	@Test
	public void VerifyBagProductFunctionality() throws IOException
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickbagbutton();
		log.info("bag product will get selected");
		
		ScreenshotClass.takeScreenshot(driver);
		
		//--validation--//
		String exceptedProduct = "1";
		String actualproduct = hp.gettextfromaddtocart();
		
		log.info("actual product->"+actualproduct);
		
		log.info("apply validation");
		
		Assert.assertEquals(actualproduct, exceptedProduct);
	}
			
		
}


