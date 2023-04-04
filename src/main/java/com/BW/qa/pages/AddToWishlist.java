package com.BW.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BW.qa.base.TestBase;

public class AddToWishlist extends TestBase{

	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement email;  
	
	@FindBy(id="ctl00_phBody_SignIn_txtPassword")
	WebElement password;  
	
	@FindBy(partialLinkText="Login")
	WebElement login; 
	
	@FindBy(partialLinkText="New Arrivals")
	WebElement newarival;
	
	@FindBy(xpath="//img[@class='card-img-top bklazy']")
	WebElement clkBook;
	
	@FindBy(xpath="//input[@class='btn  border themeborder themecolor']")
	WebElement wishlist;
	
	@FindBy(xpath="//li[@class='list-inline-item position-relative']")
	WebElement wishicon;
	
	public AddToWishlist() {
		 
		//"this" is use to init all method in this class
			 PageFactory.initElements(driver, this);
		 }
	public void wishlistPage(String un,String pw) throws InterruptedException {
		email.sendKeys(un);
		 password.sendKeys(pw);
		 login.click();
		 Thread.sleep(2000);
		 newarival.click();
		 Thread.sleep(2000);
		 clkBook.click();
		 Thread.sleep(2000);
		 wishlist.click();
		 Thread.sleep(2000);	
		 wishicon.click();
		 Thread.sleep(1000);
	}
}
