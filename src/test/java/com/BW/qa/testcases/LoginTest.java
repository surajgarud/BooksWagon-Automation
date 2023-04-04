package com.BW.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BW.qa.base.TestBase;
import com.BW.qa.pages.LoginPage;
import com.BW.qa.utility.utilityclass;
//@Listeners(com.BW.qa.Listener.Listener.class)
public class LoginTest extends TestBase{
	public LoginPage loginpg;
	public utilityclass utility;
	public String sheetname = "Sheet1";

	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	//in this anotation first we calling properties in parent class then we are doing initialization
		public void setUp() {
			init();
		 loginpg = new LoginPage();
		}
	
	@Test
	public void Logintest() {
		loginpg.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void URL() {
		String url = loginpg.getURL();
		Assert.assertEquals(url, "https://www.bookswagon.com/login");
	}
	
	@DataProvider
	public Object[][]getLoginDetails() throws InvalidFormatException{
		Object data[][]=utility.getTestData(sheetname);
		return data;
	}
	@Test(dataProvider = "getLoginDetails",priority=2)
	public void MultiUserLogin(String un, String pw) {
		loginpg.multipleUserLogin(un,pw);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
}
