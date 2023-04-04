package com.BW.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BW.qa.base.TestBase;
import com.BW.qa.pages.SignUp;

public class SignUpTest extends TestBase{

	public SignUp signup;
	
	public SignUpTest() {
		super();
	}
	
	@BeforeMethod
	//in this anotation first we calling properties in parent class then we are doing initialization
		public void setUp() {
			init();
			signup = new SignUp();
		}
	
	@Test
	public void Signuptest() throws InterruptedException {
		signup.Signup(prop.getProperty("name"),
		prop.getProperty("mob"),
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
