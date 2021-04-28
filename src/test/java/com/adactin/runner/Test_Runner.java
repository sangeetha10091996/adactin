 package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Main_Project.Base_Main;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//java//com//adactin//featurefile", 
		glue = "com.adactin.stepdefination", 
		monochrome = true, 
		dryRun = false, 
		strict = true,
		tags=("@Smoketest,@Sanitytest,@Regressiontest"), 
		plugin = {
		"html:Report/HTML_Report",
		"pretty", 
		"json:Report/jsonReport.json",
	    "com.cucumber.listener.ExtentCucumberFormatter:Report/Extentreport.html",
		})
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_up() throws Throwable {
		String browser = FileReaderManager.getinstance().getInstanceCR().getBrowser();
		driver = Base_Main.getBrowser(browser);
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
