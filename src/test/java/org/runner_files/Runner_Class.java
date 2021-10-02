package org.runner_files;

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

		String path = "E:\\Greens Tech Course\\Manual Test\\Test case adactin.xlsx";

		String name = particular_Data_Read(path, "sheet1", 2, 5);
		inputPass(pom.getHome().getUsername(), name);

		String pass = particular_Data_Read(path, "sheet1", 3, 5);
		inputPass(pom.getHome().getPassword(), pass);
		elementClick(pom.getHome().getLogin_btn());

		sleep(3);

		String location = particular_Data_Read(path, "sheet1", 5, 5);
		dropDown(pom.getHotel().getLocation(), "visible text", location);

		String hotel = particular_Data_Read(path, "sheet1", 6, 5);
		dropDown(pom.getHotel().getHotels(), "visible text", hotel);

		String room_type = particular_Data_Read(path, "sheet1", 7, 5);
		dropDown(pom.getHotel().getRoomType(), "visible text", room_type);

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

		mouse(pom.getBook_Now().getRadio(), "move");
		mouse(pom.getBook_Now().getRadio(), "click");

		elementClick(pom.getBook_Now().getContinue_btn());
		sleep(2);

		String fname = particular_Data_Read(path, "sheet1", 16, 5);
		inputPass(pom.getBook_Confrom().getFname(), fname);

		String lname = particular_Data_Read(path, "sheet1", 17, 5);
		inputPass(pom.getBook_Confrom().getLname(), lname);

		String address = particular_Data_Read(path, "sheet1", 18, 5);
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
		
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "move");
		mouse(pom.getBooked_Itinerary().getItinerary_btn(), "click");
		sleep(2);

		takeScreenShot(
				".\\screenShot\\book_conform.png");
		sleep(2);

		elementClick(pom.getBooked_Itinerary().getLogout_btn());
		sleep(10);
		close();

	}
}
