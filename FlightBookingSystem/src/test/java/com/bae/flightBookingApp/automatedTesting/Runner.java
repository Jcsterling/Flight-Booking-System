package com.bae.flightBookingApp.automatedTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import automatedTestingJava.Constant;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:")
public class Runner {

	static ExtentReports report;
	
	@BeforeClass
	public static void startExtentReport() {
		
		 report = new ExtentReports(Constant.REPORTFILE, true);//this will replace the old report with a new report each time the test is ran
		
	}

	@AfterClass
	public static void endExtentReport() {
		
		report.flush();
	}
}