package org.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Serach {

	public WebDriver driver;

	public Hotel_Serach(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomCount;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement dateIn;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement dateOut;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childRoom;

	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomCount() {
		return roomCount;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

}
