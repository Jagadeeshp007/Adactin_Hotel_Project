package org.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {

	public WebDriver driver;

	public Booked_Itinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement Itinerary_btn;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout_btn;

	public WebElement getItinerary_btn() {
		return Itinerary_btn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}

}
