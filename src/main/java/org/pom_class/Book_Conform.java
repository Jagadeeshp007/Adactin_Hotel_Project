package org.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Conform {

	public WebDriver driver;

	public Book_Conform(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardNo;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement exMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement bookNow_btn;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExMonth() {
		return exMonth;
	}

	public WebElement getExYear() {
		return exYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow_btn() {
		return bookNow_btn;
	}

}
