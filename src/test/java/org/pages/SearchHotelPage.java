package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class SearchHotelPage extends BaseClass {

	WebDriver driver;

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	@FindBy(id = "username_show")
	private WebElement txtMessage;

	@FindBy(xpath = "//td[contains(text(),'Select Hotel ')]")
	private WebElement txtSelectHotel;

	@FindBy(xpath = "//span[contains(text(),'Check-In Date shall be before than Check-Out Date')]")
	private WebElement txtCheckInErrorMsg;

	@FindBy(xpath = "//span[contains(text(),'Check-Out Date shall be after than Check-In Date')]")
	private WebElement txtCheckOutErrorMsg;

	@FindBy(xpath = "//span[contains(text(),'Please Select a Location')]")
	private WebElement txtSelectLocationErrorMsg;

	public WebElement getTxtSelectLocationErrorMsg() {
		return txtSelectLocationErrorMsg;
	}

	public WebElement getTxtCheckInErrorMsg() {
		return txtCheckInErrorMsg;
	}

	public WebElement getTxtCheckOutErrorMsg() {
		return txtCheckOutErrorMsg;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}

	public WebElement getTxtMessage() {
		return txtMessage;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	// verifying adactin search hotel by select all fields
	// verifying adactin search hotel page with invalid dates
	public void searchHotel(String location, String hotels, String roomType, String noOfRooms, String txtCheckInDate,
			String txtCheckOutDate, String adultsPerRoom, String childrenPerRoom) {

		selectOptionByText(findElementById("location"), location);
		selectOptionByText(findElementById("hotels"), hotels);
		selectOptionByText(findElementById("room_type"), roomType);
		selectOptionByText(findElementById("room_nos"), noOfRooms);
		findElementById("datepick_in").clear();
		elementSendKeys(findElementById("datepick_in"), txtCheckInDate);
		findElementById("datepick_out").clear();
		elementSendKeys(findElementById("datepick_out"), txtCheckOutDate);
		selectByValueTextdDn(findElementById("adult_room"), adultsPerRoom);
		selectByValueTextdDn(findElementById("child_room"), childrenPerRoom);
		elementClick(findElementById("Submit"));
	}

	// verifying adactin search hotel page with mandatory fields
	public void searchHotel(String location, String noOfRooms, String txtCheckInDate, String txtCheckOutDate,
			String adultsPerRoom) {

		selectOptionByText(findElementById("location"), location);
		selectOptionByText(findElementById("room_nos"), noOfRooms);
		findElementById("datepick_in").clear();
		elementSendKeys(findElementById("datepick_in"), txtCheckInDate);
		findElementById("datepick_out").clear();
		elementSendKeys(findElementById("datepick_out"), txtCheckOutDate);
		selectByValueTextdDn(findElementById("adult_room"), adultsPerRoom);
		elementClick(findElementById("Submit"));

	}

	public void clickSearch() {

		elementClick(findElementById("Submit"));

	}

	public String verifySelectHotelMsg() {

		String txtSelect = getAttributeValue(findElementByXpath("//td[contains(text(),'Select Hotel ')]"));
		return txtSelect;

	}

	public String verifyCheckInErrorMsg() {

		String txtCheckIn = getAttributeValue(
				findElementByXpath("//span[contains(text(),'Check-In Date shall be before than Check-Out Date')]"));
		return txtCheckIn;
	}

	public String verifyCheckOutErrorMsg() {

		String txtCheckOut = getAttributeValue(
				findElementByXpath("//span[contains(text(),'Check-Out Date shall be after than Check-In Date')]"));
		return txtCheckOut;
	}

	public String verifyLocationErrorMsg() {

		String errorLocationMsg = getAttributeValue(
				findElementByXpath("//span [contains(text(),'Please Select a Location')]"));
		return errorLocationMsg;

	}

}