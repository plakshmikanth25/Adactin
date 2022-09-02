package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class BookHotelPage extends BaseClass {

	WebDriver driver;

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstname;

	@FindBy(id = "last_name")
	private WebElement txtLastname;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCardnum;

	@FindBy(id = "cc_type")
	private WebElement dDnCardType;

	@FindBy(name = "cc_exp_month")
	private WebElement dDnExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement dDnExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNumber;

	@FindBy(id = "book_now")
	private WebElement btnBooknow;

	@FindBy(xpath = "//td [contains(text(),'Booking Confirmation ')]")
	private WebElement txtBookingConfirmMsg;

	@FindBy(xpath = "//label [contains(text(), 'Please Enter your First Name')]")
	private WebElement txtFirstnameErrorMsg;

	@FindBy(xpath = "//label [contains(text(), 'Please Enter you Last Name')]")
	private WebElement txtLastnameErrorMsg;

	@FindBy(xpath = "//label [contains(text(), 'Please Enter your Address')]")
	private WebElement txtAddressErrorMsg;

	@FindBy(xpath = "//label [contains(text(), 'Please Enter your 16 Digit Credit Card Number')]")
	private WebElement txtCreditCardMsg;

	@FindBy(xpath = "//label [contains(text(),'Please Select your Credit Card Type')]")
	private WebElement txtCardTypeMsg;

	@FindBy(xpath = "//label [contains(text(),'Please Select your Credit Card Expiry Month')]")
	private WebElement txtExpiryMonthMsg;

	@FindBy(xpath = "//label [contains(text(),'Please Enter your Credit Card CVV Number')]")
	private WebElement txtCvvMsg;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxtBookingConfirmMsg() {
		return txtBookingConfirmMsg;
	}

	public WebElement getTxtFirstnameErrorMsg() {
		return txtFirstnameErrorMsg;
	}

	public WebElement getTxtLastnameErrorMsg() {
		return txtLastnameErrorMsg;
	}

	public WebElement getTxtAddressErrorMsg() {
		return txtAddressErrorMsg;
	}

	public WebElement getTxtCreditCardMsg() {
		return txtCreditCardMsg;
	}

	public WebElement getTxtCardTypeMsg() {
		return txtCardTypeMsg;
	}

	public WebElement getTxtExpiryMonthMsg() {
		return txtExpiryMonthMsg;
	}

	public WebElement getTxtCvvMsg() {
		return txtCvvMsg;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardnum() {
		return txtCardnum;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCvvNumber() {
		return txtCvvNumber;
	}

	public WebElement getBtnBooknow() {
		return btnBooknow;
	}

	public void BookHotelPage(String firstname, String lastname, String address, String cardNum, String cardType,
			String expMonth, String expYear, String cvvNum) throws InterruptedException {

		elementSendKeys(findElementById("first_name"), firstname);
		elementSendKeys(findElementById("last_name"), lastname);
		elementSendKeys(findElementById("address"), address);
		elementSendKeys(findElementById("cc_num"), cardNum);
		selectOptionByText(findElementById("cc_type"), cardType);
		selectOptionByText(findElementById("cc_exp_month"), expMonth);
		selectOptionByText(findElementById("cc_exp_year"), expYear);
		elementSendKeys(findElementById("cc_cvv"), cvvNum);
		elementClick(findElementById("book_now"));
		Thread.sleep(5000);
	}

	public void bookHotelClick() {
		elementClick(findElementById("book_now"));

	}

	public String verifyBookingConfirmation() {
		String txtBookingConfirmationMsg = getAttributeValue(
				findElementByXpath("//td [contains(text(),'Booking Confirmation ')]"));
		return txtBookingConfirmationMsg;

	}

	public String verifyFirstnameError() {

		String verifyFirstnameErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(), 'Please Enter your First Name')]"));
		return verifyFirstnameErrorMsg;
	}

	public String verifyLastnameError() {

		String verifyLastnameErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(), 'Please Enter you Last Name')]"));
		return verifyLastnameErrorMsg;
	}

	public String verifyAdddressError() {

		String verifyAdddressErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(), 'Please Enter your Address')]"));
		return verifyAdddressErrorMsg;
	}

	public String verifyCardError() {

		String verifyCardErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(), 'Please Enter your 16 Digit Credit Card Number')]"));
		return verifyCardErrorMsg;
	}

	public String verifyCardTyperError() {

		String verifyCardTypeErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(),'Please Select your Credit Card Type')]"));
		return verifyCardTypeErrorMsg;

	}

	public String verifyExpMonthError() {
		String verifyExpMonthErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(),'Please Select your Credit Card Expiry Month')]"));
		return verifyExpMonthErrorMsg;

	}

	public String verifyCvvError() {
		String verifyCvvErrorMsg = getAttributeValue(
				findElementByXpath("//label [contains(text(),'Please Enter your Credit Card CVV Number')]"));
		return verifyCvvErrorMsg;

	}

}
