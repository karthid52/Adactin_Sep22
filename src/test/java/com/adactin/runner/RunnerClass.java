package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;
import com.sdp.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", 
			glue = "com.adactin.stepdefinition",
			monochrome = true,
			dryRun = false,
			strict = true, 
			//tags = ("@smokeTest"),
			plugin = {"html:Reports/HtmlReport", //"pretty",
					"json:Reports/JsonReport.json",
					"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtendReport.html" }
)
public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
 
		String browser = FileReaderManager.getInstanceFRM().getInstanceCR().getBrowser();
		driver = BaseClass.getBrowser(browser);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
