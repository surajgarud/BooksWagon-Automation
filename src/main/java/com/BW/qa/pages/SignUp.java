package com.BW.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BW.qa.base.TestBase;

public class SignUp extends TestBase {
	
	@FindBy(partialLinkText="New to Bookswagon? Sign")
	WebElement signup;  
	
	@FindBy(id="ctl00_phBody_SignUp_txtName")
	WebElement name;

	@FindBy(id="ctl00_phBody_SignUp_txtEmail")
	WebElement mob;
	
	@FindBy(id="ctl00_phBody_SignUp_btnContinue")
	WebElement contin;
	
	@FindBy(id="ctl00_phBody_SignUp_txtOTP")
	WebElement otp;
	
	@FindBy(id="ctl00_phBody_SignUp_txtPassword")
	WebElement pass;
	
	@FindBy(id="ctl00_phBody_SignUp_txtConfirmPwd")
	WebElement confirmpass;
	
	@FindBy(partialLinkText="Sign up")
	WebElement sign;  
	
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
	public void Signup(String FN, String MO, String OTP, String Pass, String CP) throws InterruptedException {
		signup.click();
		Thread.sleep(3000);
		name.sendKeys(FN);
		mob.sendKeys(MO);
		contin.click();
		Thread.sleep(2000);
		otp.sendKeys(OTP);
		pass.sendKeys(Pass);
		confirmpass.sendKeys(CP);
		sign.click();
		Thread.sleep(2000);
	}
}
