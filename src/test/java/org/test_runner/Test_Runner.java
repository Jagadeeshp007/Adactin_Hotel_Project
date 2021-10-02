package org.test_runner;

import org.base.Base_Class;
import org.helper.File_Read;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".\\src\\test\\java\\org\\feature_file\\Adactin.feature",

		glue = "org.setp_def",

		monochrome = true,

		dryRun = false,

		strict = true,

//		tags = ("~@regressionTest, @smokeTest"),

		plugin = { "html:Report/Cucumber_Report",

				"pretty",

				"json:Report/Json_Report.json",

//				"com.cucumber.listener.ExtentCucumberFormatter:Report/Extend_Report.html"

		}

)
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws Throwable {
		String browser = File_Read.getFile().getInstance().getBrowser();

		driver = Base_Class.getBrowser(browser);
	}

	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
