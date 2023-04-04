package com.BW.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestBase {
	public static WebDriver driver;		
	public static Properties prop;
	
	public ExtentReports extent = new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
	
	public  TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\suraj\\eclipse-workspace\\BooksWagon"
					+ "\\src\\main\\java\\com\\BW\\qa\\Config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public static void init() {
		//Getting browser name from properties file and store in String variable
		String Browser = prop.getProperty("browser");
		if(Browser.equals("edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\suraj\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		}else if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\suraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		//Launch url
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}

}
