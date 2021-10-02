package org.testng_runner;

import org.base.Base_Class;
import org.helper.File_Read;
import org.openqa.selenium.WebDriver;
import org.sdp.Page_Object_Manger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNG_Runner extends Base_Class {

	public static WebDriver driver;

	public static Page_Object_Manger pom;

	ExtentTest test;
	ExtentReports exrep;
	ExtentSparkReporter sparkrep;

	@BeforeTest
	private void configuration() {

		sparkrep = new ExtentSparkReporter(".//Report//TestNG_Extend.html");

		exrep = new ExtentReports();

		exrep.attachReporter(sparkrep);

		test = exrep.createTest("Configuration");
	}

	@BeforeClass
	private void browserLaunch() throws Throwable {
		String browser = File_Read.getFile().getInstance().getBrowser();
		driver = getBrowser(browser);
		pom = new Page_Object_Manger(driver);

		String url = File_Read.getFile().getInstance().getUrl();
		getUrl(url);

	}

	@Test(priority = 0)
	private void home_Page() throws Throwable {

		test = exrep.createTest("Home Page");
		String username = File_Read.getFile().getInstance().getUsername();
		inputPass(pom.getHome().getUsername(), username);

		String password = File_Read.getFile().getInstance().getPassword();
		inputPass(pom.getHome().getPassword(), password);

		elementClick(pom.getHome().getLogin_btn());
	}

	@Test(priority = 1)
	private void search_Hotel() throws Throwable {

		test = exrep.createTest("Search Hotel Page");

		String location = File_Read.getFile().getInstance().getLocation();
		dropDown(pom.getHotel().getLocation(), "visible text", location);

		String hotel = File_Read.getFile().getInstance().getHotel();
		dropDown(pom.getHotel().getHotels(), "visible text", hotel);

		String roomType = File_Read.getFile().getInstance().getRoomType();
		dropDown(pom.getHotel().getRoomType(), "visible text", roomType);

		String noOfRoom = File_Read.getFile().getInstance().getNoOfRoom();
		dropDown(pom.getHotel().getRoomCount(), "value", noOfRoom);

		String dateIn = File_Read.getFile().getInstance().getDateIn();
		inputPass(pom.getHotel().getDateIn(), dateIn);

		String dateOut = File_Read.getFile().getInstance().getDateOut();
		inputPass(pom.getHotel().getDateOut(), dateOut);

		String adults = File_Read.getFile().getInstance().getAdults();
		dropDown(pom.getHotel().getAdultRoom(), "index", adults);

		String children = File_Read.getFile().getInstance().getChildren();
		dropDown(pom.getHotel().getChildRoom(), "index", children);

		elementClick(pom.getHotel().getSubmit());

	}

	@Test(priority = 2)
	private void select_Hotel() {

		test = exrep.createTest("Select Hotel Page");
		mouse(pom.getBook_Now().getRadio(), "move");
		mouse(pom.getBook_Now().getRadio(), "click");

		elementClick(pom.getBook_Now().getContinue_btn());

	}

	@Test(priority = 3)
	private void book_Now() throws Throwable {

		test = exrep.createTest("Book Now Hotel Page");

		String fname = File_Read.getFile().getInstance().getFirstName();
		inputPass(pom.getBook_Confrom().getFname(), fname);

		String lname = File_Read.getFile().getInstance().getLastName();
		inputPass(pom.getBook_Confrom().getLname(), lname);

		String address = File_Read.getFile().getInstance().getAddress();
		inputPass(pom.getBook_Confrom().getAddress(), address);

		String creditCard = File_Read.getFile().getInstance().getCreditCard();
		inputPass(pom.getBook_Confrom().getCardNo(), creditCard);

		String cardType = File_Read.getFile().getInstance().getCardType();
		dropDown(pom.getBook_Confrom().getCardType(), "visible text", cardType);

		String expiryMonth = File_Read.getFile().getInstance().getExpiryMonth();
		dropDown(pom.getBook_Confrom().getExMonth(), "visible text", expiryMonth);

		String expiryYear = File_Read.getFile().getInstance().getExpiryYear();
		dropDown(pom.getBook_Confrom().getExYear(), "visible text", expiryYear);

		String cvv = File_Read.getFile().getInstance().getCvv();
		inputPass(pom.getBook_Confrom().getCvv(), cvv);

		elementClick(pom.getBook_Confrom().getBookNow_btn());
		wait(30);

	}

	@Test(priority = 4)
	private void booking_Confirm() {

		test = exrep.createTest("Booking Hotel Confirm Page");
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "move");
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "click");
		wait(30);
	}

	@Test(priority = 5)
	private void iteinerary() {

		test = exrep.createTest("My Iteinerary Page");
		elementClick(pom.getBooked_Itinerary().getLogout_btn());

	}

	@AfterClass
	private void browserClose() {
		close();
	}

	@AfterTest
	private void flush() {

		exrep.flush();
	}
}
