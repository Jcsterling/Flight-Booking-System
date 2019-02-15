package com.bae.flightBookingApp.automatedTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import automatedTestingJava.Constant;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class FlightStepDefinition {

	WebDriver driver;

    ExtentReports reports;
    ExtentTest test;

    String url;
	 @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver",
	                Constant.CROMEDRIVER);
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       
	        test = Runner.report.startTest("Google Test");


	    }
	    
	    @After
	    public void teardown() throws Exception {

	        Thread.sleep(3000);
	        Runner.report.endTest(test);
	        driver.quit();
	    }
	    
	    

}
