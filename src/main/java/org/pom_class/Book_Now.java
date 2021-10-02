package org.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now {

	public WebDriver driver;

	public Book_Now(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_btn;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}
}
