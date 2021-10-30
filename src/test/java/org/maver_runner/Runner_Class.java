package org.maver_runner;

import org.base.Base_Class;
import org.helper.File_Read;
import org.openqa.selenium.WebDriver;
import org.sdp.Page_Object_Manger;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = getBrowser("chrome"); // select driver
	public static Page_Object_Manger pom = new Page_Object_Manger(driver); // convert driver

	public static void main(String[] args) throws Throwable {

		String url = File_Read.getFile().getInstance().getUrl();
		getUrl(url);
//		String path = File_Read.getFile().getInstance().getPath();
		String path = "E:\\Greens Tech Course\\seleninum\\eclipse-workspace\\Adactin_Hotel_Project\\Test case adactin.xlsx";

		// user name
		String name = particular_Data_Read(path, "sheet1", 2, 5);
		inputPass(pom.getHome().getUsername(), name);

		// password
		String pass = particular_Data_Read(path, "sheet1", 3, 5);
		inputPass(pom.getHome().getPassword(), pass);
		elementClick(pom.getHome().getLogin_btn());
		sleep(3);

		// Location
		String location = particular_Data_Read(path, "sheet1", 5, 5);
		dropDown(pom.getHotel().getLocation(), "visible text", location);

		// Hotel
		String hotel = particular_Data_Read(path, "sheet1", 6, 5);
		dropDown(pom.getHotel().getHotels(), "visible text", hotel);

		// Room Type
		String room_type = particular_Data_Read(path, "sheet1", 7, 5);
		dropDown(pom.getHotel().getRoomType(), "visible text", room_type);

		// No. Of Rooms
		String noOfRoom = File_Read.getFile().getInstance().getNoOfRoom();
		dropDown(pom.getHotel().getRoomCount(), "value", noOfRoom);

		// Check In Date
		String dateIn = File_Read.getFile().getInstance().getDateIn();
		inputPass(pom.getHotel().getDateIn(), dateIn);

		// Check Out Date
		String dateOut = File_Read.getFile().getInstance().getDateOut();
		inputPass(pom.getHotel().getDateOut(), dateOut);

		// Adults Room
		String adults = File_Read.getFile().getInstance().getAdults();
		dropDown(pom.getHotel().getAdultRoom(), "index", adults);

		// Children Room
		String children = File_Read.getFile().getInstance().getChildren();
		dropDown(pom.getHotel().getChildRoom(), "index", children);

		// Submit Button
		elementClick(pom.getHotel().getSubmit());

		// Radio Button
		mouse(pom.getBook_Now().getRadio(), "move");
		mouse(pom.getBook_Now().getRadio(), "click");

		// Continue Button
		elementClick(pom.getBook_Now().getContinue_btn());
		sleep(2);

		// First Name
		String fname = particular_Data_Read(path, "sheet1", 16, 5);
		inputPass(pom.getBook_Confrom().getFname(), fname);

		// Last Name
		String lname = particular_Data_Read(path, "sheet1", 17, 5);
		inputPass(pom.getBook_Confrom().getLname(), lname);

		// Address
		String address = particular_Data_Read(path, "sheet1", 18, 5);
		inputPass(pom.getBook_Confrom().getAddress(), address);

		// Credit Card
		String creditCard = File_Read.getFile().getInstance().getCreditCard();
		inputPass(pom.getBook_Confrom().getCardNo(), creditCard);

		// Card Type
		String cardType = File_Read.getFile().getInstance().getCardType();
		dropDown(pom.getBook_Confrom().getCardType(), "visible text", cardType);

		// Expiry Month
		String expiryMonth = File_Read.getFile().getInstance().getExpiryMonth();
		dropDown(pom.getBook_Confrom().getExMonth(), "visible text", expiryMonth);

		// Expiry Year
		String expiryYear = File_Read.getFile().getInstance().getExpiryYear();
		dropDown(pom.getBook_Confrom().getExYear(), "visible text", expiryYear);

		// CVV number
		String cvv = File_Read.getFile().getInstance().getCvv();
		inputPass(pom.getBook_Confrom().getCvv(), cvv);

		// Book Now Button
		elementClick(pom.getBook_Confrom().getBookNow_btn());
		wait(30);

		// My Itinerary Button
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "move");
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "click");
		sleep(2);

		takeScreenShot(".\\screenShot\\book_conform.png");
		sleep(2);

		// Logout Button
		elementClick(pom.getBooked_Itinerary().getLogout_btn());
		sleep(4);
		close();

	}
}
