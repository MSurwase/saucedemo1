package com.SauceDemo.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	
	
	@Test
	public void verifyLoginFunctionality() throws IOException
	{
		
		log.info("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA	
	   String actualTitle = driver.getTitle();
	
	   Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	}
