package com.SauceDemo.TestClass;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;



public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	//test steps
	@Test
	public void verifyLOgOutFunctionality()
	{
		HomePOMClass y = new HomePOMClass(driver);
		y.clickmenubutton();
		log.info("click on menu button");
		y.clicklogoutbutton();
		log.info("click on log out button");

		log.info("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA
			
		   String actualTitle = driver.getTitle();
		
		   Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	}
