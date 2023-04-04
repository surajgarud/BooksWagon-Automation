package com.BW.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BW.qa.base.TestBase;
import com.BW.qa.pages.AddToWishlist;

public class AddToWishlistTest extends TestBase{
	public AddToWishlist addwishlist;
	
	public AddToWishlistTest() {
		super();
	}
	@BeforeMethod
	//in this anotation first we calling properties in parent class then we are doing initialization
	public void setUp() {
		init();
		addwishlist = new AddToWishlist();
	}
	@Test
	public void hometest() throws InterruptedException {
		addwishlist.wishlistPage(prop.getProperty("email"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
