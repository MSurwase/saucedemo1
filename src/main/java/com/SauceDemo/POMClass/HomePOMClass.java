package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	//POM Class steps
			//1.WebDriver driver declare
			//2.ele find by @FindBy Annotation
			//3.created a method to perform a action on element
			//4.Constructor create

		//1
		private WebDriver driver ;
		private Select s;
		
		//2
		@FindBy(xpath ="//button[@id='react-burger-menu-btn']" )
		private WebElement menubutton;
		
		//3
		public void clickmenubutton()
		{
			menubutton.click();
		}
		
		//2
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		private WebElement logoutbutton;
		
		//3
		public void clicklogoutbutton()
		{
			logoutbutton.click();
		}
		
		public HomePOMClass(WebDriver driver)
		{
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
			s = new Select(dropDownfilter);

		}
		
		//bag ele
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagButton;

		public void clickbagbutton()
		{
			bagButton.click();
		}
		
		//addToCart ele
		@FindBy(xpath = "//a[@class='shopping_cart_link']")
		private WebElement addtocart;
		
		////multiple product ele
		@FindBy(xpath = "//button[text()='Add to cart']")
		private List<WebElement> allproduct;
		
		public void clickallproducts()
		{
//			its not work properly so use for each loop
//			for(int i = 1;i<allproduct.size();i++ )
//			{
//				allproduct.get(i).click();
//			}
			for(WebElement i : allproduct)
			{
				i.click();
			}
//			
		}
		
		//dropDownELe find
		@FindBy(xpath = "//select[@class='product_sort_container']")
		private WebElement dropDownfilter;
		
		public void clickdropDownfilter()
		{
			dropDownfilter.click();
			s.selectByValue("lohi");
		}
		
		public String gettextfromaddtocart()
		{
			String totalproduct = addtocart.getText();
			return totalproduct;
			
		}

}
