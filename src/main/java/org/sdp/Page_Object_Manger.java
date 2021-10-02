package org.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.pom_class.Book_Conform;
import org.pom_class.Book_Now;
import org.pom_class.Booked_Itinerary;
import org.pom_class.Home_page;
import org.pom_class.Hotel_Serach;

public class Page_Object_Manger {

	public WebDriver driver;

	public Page_Object_Manger(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Home_page getHome() {
		Home_page hp = new Home_page(driver);
		return hp;
	}

	public Hotel_Serach getHotel() {
		Hotel_Serach hs = new Hotel_Serach(driver);
		return hs;
	}

	public Book_Now getBook_Now() {
		Book_Now bookNow = new Book_Now(driver);
		return bookNow;
	}

	public Book_Conform getBook_Confrom() {
		Book_Conform bookConform = new Book_Conform(driver);
		return bookConform;
	}

	public Booked_Itinerary getBooked_Itinerary() {
		Booked_Itinerary bookIt	= new Booked_Itinerary(driver);
		return bookIt;
	}
}
