package com.BW.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BW.qa.base.TestBase;

public class ForgetPass extends TestBase{
	
	@FindBy(partialLinkText="Forgot your Password?")
	WebElement forgetpass;
	
	@FindBy(id="ctl00_phBody_ForgotPassword_txtFGEmail")
	WebElement email;
	
	@FindBy(partialLinkText="Continue")
	WebElement cont;
	
	@FindBy(id="ctl00_phBody_ForgotPassword_txtFGOTP")
	WebElement enterotp;
	
	@FindBy(id="ctl00_phBody_ForgotPassword_txtFGPassword")
	WebElement pass;
	
	@FindBy(id="ctl00_phBody_ForgotPassword_txtConfirmFGPwd")
	WebElement confirmpass;
	
	@FindBy(id="ctl00_phBody_ForgotPassword_btnFGLogin")
	WebElement log;
	
	public ForgetPass() {
		PageFactory.initElements(driver, this);
	}
	
	public void forgetPass(String EM, String OTP, String PWD, String CP) throws InterruptedException {
		forgetpass.click();
		Thread.sleep(2000);
		email.sendKeys(EM);
		cont.click();
		Thread.sleep(2000);
		enterotp.sendKeys(OTP);
		pass.sendKeys(PWD);
		confirmpass.sendKeys(CP);
		Thread.sleep(1000);
		log.click();
		Thread.sleep(1000);
	}

}
