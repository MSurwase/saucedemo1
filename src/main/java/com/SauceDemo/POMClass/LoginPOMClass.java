package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 

//POM Class steps
		//1.WebDriver driver declare
		//2.ele find by @FindBy Annotation
		//3.created a method to perform a action on element
		//4.Constructor create
{
	   //1.driver declared
		private WebDriver driver;
		private Actions act;
		
		//2.element find
		@FindBy(xpath = "//input[@id='user-name']")
		private WebElement Username;
		
		//3.create a method as per action on ele
		//and add action in that method
		public void sendusername()
		{
			Username.sendKeys("standard_user");
		}
		
		//2.
		@FindBy(xpath = "//input[@id='password']")
		private WebElement password;
		
		//3
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		//2.
		@FindBy(xpath = "//input[@id='login-button']")
		private WebElement loginbutton;
		
		//3
		public void clickloginbutton()
		{
			loginbutton.click();
		}
		
		//or
//		mouse acction
		public void clickloginbuttonbymouse()
		{
			
			act.click(loginbutton).perform();
		}
		
		//4.create a constructor
		public LoginPOMClass(WebDriver driver)
		{
			//global       local
			this.driver = driver;
			
			//sele class
			PageFactory.initElements(driver, this);
			
			act = new Actions(driver);
		}
		
		//---------------	
//		int a;   //a var declare
	//	
//		//4.create a constructor
//		public LoginPOMClass(int a)
//		{
////			a = x;         //possible
////			this.a = a;    //possible
//			
//		}
	//-----------------
		
		//POM Class steps
		//1.WebDriver driver declare
		//2.ele find by @FindBy Annotation
		//3.created a method to perform a action on element
		//4.Constructor create


		
		

}
