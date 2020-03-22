package Runner;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/Feature", glue = "Steps", tags = { "@REQRES" })
public class Runner extends AbstractTestNGCucumberTests {

	// i need to combine the extent reports for each environment
	// https://sqa.stackexchange.com/questions/37558/how-to-integrate-merge-multiple-extent-reports-into-one-single-report-using-sele

	@BeforeSuite()
	public void beforeSuite() throws IOException {

		
//		GlobalObjects.TIMESTAMP_RESULTSFOLDER = setupResultsTimeStampFolder();

//		createAndSetupExcelResultsSheet();

//		createLogFolders();

		System.out.println("Execution started on UAT env...");
		

	}

	// before class
	@BeforeClass()
	public void beforeClass() throws IOException {

//		getReqresTestData();
//		getParaBankTestData();

	}

	

//	@AfterMethod()
//	public void afterMethod() {
//		MasterWebDriver.driver.close();
//	}
//
//	// after class
//	@AfterClass
//	public void afterClass() {
//
//		MasterWebDriver.driver.quit();
//
//	}

	

}