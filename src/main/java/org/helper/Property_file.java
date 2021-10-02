package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property_file {

	public static Properties p;

	public Property_file() throws Throwable {
		File f = new File(
				".\\src\\main\\java\\org\\property\\congfigure.properties");

		FileInputStream input = new FileInputStream(f);

		p = new Properties();
		p.load(input);

	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getLocation() {
		String location = p.getProperty("Location");
		return location;
	}

	public String getHotel() {
		String Hotel = p.getProperty("Hotel");
		return Hotel;
	}

	public String getRoomType() {
		String room_type = p.getProperty("Room_type");
		return room_type;
	}

	public String getNoOfRoom() {
		String no_of_room = p.getProperty("No_of_room");
		return no_of_room;
	}

	public String getDateIn() {
		String dateIn = p.getProperty("date_check_in");
		return dateIn;
	}

	public String getDateOut() {
		String dateOut = p.getProperty("date_check_out");
		return dateOut;
	}

	public String getAdults() {
		String adults = p.getProperty("adults");
		return adults;
	}

	public String getChildren() {
		String children = p.getProperty("children");
		return children;
	}

	public String getFirstName() {
		String fname = p.getProperty("first_name");
		return fname;
	}

	public String getLastName() {
		String lname = p.getProperty("last_name");
		return lname;
	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String getCreditCard() {
		String card = p.getProperty("credit_card");
		return card;
	}

	public String getCardType() {
		String cardType = p.getProperty("card_type");
		return cardType;
	}

	public String getExpiryMonth() {
		String month = p.getProperty("expiry_month");
		return month;
	}

	public String getExpiryYear() {
		String year = p.getProperty("expiry_year");
		return year;
	}

	public String getCvv() {
		String cvv = p.getProperty("cvv_no");
		return cvv;
	}

}