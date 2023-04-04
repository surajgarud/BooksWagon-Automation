package com.BW.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BW.qa.base.TestBase;
import com.BW.qa.pages.OrderBook;

public class OrderBookTest extends TestBase{
	
	public OrderBook homepage;
	
	public OrderBookTest() {
		super();
	}
	@BeforeMethod
	//in this anotation first we calling properties in parent class then we are doing initialization
	public void setUp() {
		init();
		homepage = new OrderBook();
	}
	
	@Test
	public void hometest() throws InterruptedException {
		homepage.homePage(prop.getProperty("email"),
				prop.getProperty("password"),
				prop.getProperty("CN"),
				prop.getProperty("months"),
				prop.getProperty("years"),
				prop.getProperty("CVV"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
