package com.BW.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BW.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement email;  
	
	@FindBy(id="ctl00_phBody_SignIn_txtPassword")
	WebElement password;  
	
	@FindBy(partialLinkText="Login")
	WebElement login;  
	
	public LoginPage() {
		 
		//"this" is use to init all method in this class
			 PageFactory.initElements(driver, this);
		 }
	
	 public OrderBook login(String un,String pw) {
		 email.sendKeys(un);
		 password.sendKeys(pw);
		 login.click();
		 
		 // after clicking login btn it will land on Homepage so giving return type is HomePage in pages folder
		 return new OrderBook();
	 }
	 public String getURL() {
			return driver.getCurrentUrl();
		 }
	 public void multipleUserLogin(String un, String pw) {
		 email.sendKeys(un);
		 password.sendKeys(pw);
		 login.click();
		 
	 }
}
