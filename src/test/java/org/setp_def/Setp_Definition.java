package org.setp_def;

import org.base.Base_Class;
import org.helper.File_Read;
import org.openqa.selenium.WebDriver;
import org.sdp.Page_Object_Manger;
import org.test_runner.Test_Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Setp_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manger pom = new Page_Object_Manger(driver);

	@Before
	public static void beforeHooks(Scenario s) throws Throwable {
		String status = s.getStatus();
		System.out.println("Before Hooks Status : " + status);
		if (s.isFailed()) {
			takeScreenShot(
					"E:\\Greens Tech Course\\seleninum\\eclipse-workspace\\Adactin_Hotel_Project\\screenShot\\beforfailedHooks.png");
		}
	}

	@After
	public static void afterHooks(Scenario s) throws Throwable {

		String status = s.getStatus();
		System.out.println("After Hooks Status : " + status);
		if (s.isFailed()) {
			takeScreenShot(
					"E:\\Greens Tech Course\\seleninum\\eclipse-workspace\\Adactin_Hotel_Project\\screenShot\\afterfailedHooks.png");
		}
	}

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		// URL
		String url = File_Read.getFile().getInstance().getUrl();
		getUrl(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String user) throws Throwable {
		// User Name
		inputPass(pom.getHome().getUsername(), user);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String pass) throws Throwable {
		// Password
		inputPass(pom.getHome().getPassword(), pass);

	}

	@Then("^user Click The Login Button To Navigate The Search Hotel Page$")
	public void user_Click_The_Login_Button_To_Navigate_The_Search_Hotel_Page() throws Throwable {
		// Login Button
		elementClick(pom.getHome().getLogin_btn());
		sleep(3);
	}

	@When("^user Select The Hotel \"([^\"]*)\"$")
	public void user_Select_The_Hotel(String location) throws Throwable {
		// Location
		dropDown(pom.getHotel().getLocation(), "visible text", location);

	}

	@When("^user Select The \"([^\"]*)\"$")
	public void user_Select_The(String hotel) throws Throwable {
		// Hotel
		dropDown(pom.getHotel().getHotels(), "visible text", hotel);
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		// Room Type
		String roomType = File_Read.getFile().getInstance().getRoomType();
		dropDown(pom.getHotel().getRoomType(), "visible text", roomType);
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		// No. Of Room
		String noOfRoom = File_Read.getFile().getInstance().getNoOfRoom();
		dropDown(pom.getHotel().getRoomCount(), "index", noOfRoom);
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		// Check In Date
		String dateIn = File_Read.getFile().getInstance().getDateIn();
//		inputClear(pom.getHotel().getDateIn());
		inputPass(pom.getHotel().getDateIn(), dateIn);

	}

	@When("^User Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		// Check Out Date
		String dateOut = File_Read.getFile().getInstance().getDateOut();
//		inputClear(pom.getHotel().getDateOut());
		inputPass(pom.getHotel().getDateOut(), dateOut);
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		// Adults Room
		String adults = File_Read.getFile().getInstance().getAdults();
		dropDown(pom.getHotel().getAdultRoom(), "index", adults);

	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		// Children Room
		String children = File_Read.getFile().getInstance().getChildren();
		dropDown(pom.getHotel().getChildRoom(), "index", children);

	}

	@Then("^user Click The Search Button To Navigate The Select Hotel Page$")
	public void user_Click_The_Search_Button_To_Navigate_The_Select_Hotel_Page() throws Throwable {
		// submit button
		elementClick(pom.getHotel().getSubmit());
		sleep(3);
	}

	@When("^user Click To Select The Hotel$")
	public void user_Click_To_Select_The_Hotel() throws Throwable {
		// Radio Button
		mouse(pom.getBook_Now().getRadio(), "move");
		mouse(pom.getBook_Now().getRadio(), "click");

	}

	@Then("^user Click The Continue Button To Navigate The BooK Hotel$")
	public void user_Click_The_Continue_Button_To_Navigate_The_BooK_Hotel() throws Throwable {
		// Continue Button
		elementClick(pom.getBook_Now().getContinue_btn());
		sleep(2);
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		// First Name
		String fname = File_Read.getFile().getInstance().getFirstName();
		inputPass(pom.getBook_Confrom().getFname(), fname);
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		// Last Name
		String lname = File_Read.getFile().getInstance().getLastName();
		inputPass(pom.getBook_Confrom().getLname(), lname);

	}

	@When("^user Enter The Address In Address Field$")
	public void user_Enter_The_Address_In_Address_Field() throws Throwable {
		// Address
		String address = File_Read.getFile().getInstance().getAddress();
		inputPass(pom.getBook_Confrom().getAddress(), address);

	}

	@When("^user Enter The Credit Card No IN Credit Card Field$")
	public void user_Enter_The_Credit_Card_No_IN_Credit_Card_Field() throws Throwable {
		// Credit Card Number
		String creditCard = File_Read.getFile().getInstance().getCreditCard();
		inputPass(pom.getBook_Confrom().getCardNo(), creditCard);

	}

	@When("^user Select The Card Type$")
	public void user_Select_The_Card_Type() throws Throwable {
		// Card Type
		String cardType = File_Read.getFile().getInstance().getCardType();
		dropDown(pom.getBook_Confrom().getCardType(), "visible text", cardType);
	}

	@When("^user Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		// Expiry Month
		String expiryMonth = File_Read.getFile().getInstance().getExpiryMonth();
		dropDown(pom.getBook_Confrom().getExMonth(), "visible text", expiryMonth);

	}

	@When("^user Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
		// Expiry Year
		String expiryYear = File_Read.getFile().getInstance().getExpiryYear();
		dropDown(pom.getBook_Confrom().getExYear(), "visible text", expiryYear);
	}

	@When("^user Enter The Cvv Number In Cvv Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Field() throws Throwable {
		// CVV number
		String cvv = File_Read.getFile().getInstance().getCvv();
		inputPass(pom.getBook_Confrom().getCvv(), cvv);

	}

	@Then("^user Click The Book Now Button To Navigate The Booking Confirm Page$")
	public void user_Click_The_Book_Now_Button_To_Navigate_The_Booking_Confirm_Page() throws Throwable {
		// Book Now Button
		elementClick(pom.getBook_Confrom().getBookNow_btn());
		wait(30);
	}

	@Then("^user Click The My Itinerary Button To Navigate Booked Itinerary Page$")
	public void user_Click_The_My_Itinerary_Button_To_Navigate_Booked_Itinerary_Page() throws Throwable {
		// My Itinerary Button
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "move");
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "click");
		sleep(2);

	}

	@Then("^user Click The Logout Button To Logout The Our Account$")
	public void user_Click_The_Logout_Button_To_Logout_The_Our_Account() throws Throwable {
		takeScreenShot(".\\screenShot\\cucumber_book_conform.png");
		sleep(2);

		// Logout Button
		elementClick(pom.getBooked_Itinerary().getLogout_btn());
		sleep(3);

	}

}
