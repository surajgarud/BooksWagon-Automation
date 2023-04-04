package com.BW.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BW.qa.base.TestBase;
import com.BW.qa.pages.ForgetPass;

public class ForgetPassTest extends TestBase{
	 public ForgetPass forgetpass;
	 
	 public ForgetPassTest() {
		 super();
	 }
	 
 @BeforeMethod
	//in this anotation first we calling properties in parent class then we are doing initialization
	public void setUp() {
		init();
		forgetpass = new ForgetPass();
	}
 @Test
	public void forgetPasstest() throws InterruptedException {
	 forgetpass.forgetPass(prop.getProperty("email"),
				prop.getProperty("otp"),
				prop.getProperty("pass"),
				prop.getProperty("Confirmpass"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
