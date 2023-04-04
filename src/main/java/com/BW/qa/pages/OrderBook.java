package com.BW.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BW.qa.base.TestBase;

public class OrderBook extends TestBase{
	
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
	
	@FindBy(xpath="//input[@class='btn themebackground text-white']")
	WebElement Buynow;
	
	@FindBy(xpath="//input[@id='BookCart_lvCart_imgPayment']")
	WebElement placeorder;
	
	@FindBy(id="ctl00_cpBody_lvCustomerAdd_ctrl0_btnUseAddress")
	WebElement address;
	
	@FindBy(id="ctl00_cpBody_ShoppingCart_lvCart_savecontinue")
	WebElement save;
	
	@FindBy(partialLinkText="CCAvanue")
	WebElement avenue;
	
	@FindBy(id="ctl00_cpBody_btnCCAvenue")
	WebElement cc;
	
	@FindBy(id="creditCardNumber")
	WebElement creditCardNumber;
	
	@FindBy(id="expiryMonthCreditCard")
	WebElement month;
	
	@FindBy(id="expiryYearCreditCard")
	WebElement year;
	
	@FindBy(id="CVVNumberCreditCard")
	WebElement CVV;
	
	@FindBy(id="SubmitBillShip")
	WebElement paymentbtn;
	
	public OrderBook() {
		 
		//"this" is use to init all method in this class
			 PageFactory.initElements(driver, this);
		 }

	public void homePage(String un,String pw, String CN, String MO, String Year, String cvv) throws InterruptedException   {
		email.sendKeys(un);
		 password.sendKeys(pw);
		 login.click();
		 Thread.sleep(2000);
		 newarival.click();
		 Thread.sleep(2000);
		 clkBook.click();
		 Thread.sleep(2000);
		 Buynow.click();
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);
		 placeorder.click();
		 Thread.sleep(2000);
		 address.click();
		 Thread.sleep(1000);
		 save.click();
		 avenue.click();
	     Thread.sleep(1000);
	     cc.click();
	     Thread.sleep(2000);
	     creditCardNumber.sendKeys(CN);
	     month.sendKeys(MO);
	     year.sendKeys(Year);
	     CVV.sendKeys(cvv);
	     Thread.sleep(1000);
	     paymentbtn.click();
	     
	     
	}
}
