package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.baseClass.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should book hotel {string},{string} and {string}")
	public void userShouldBookHotelAnd(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> m = dataTable.asMaps();
		Thread.sleep(10000);
		String creditCardNum = m.get(2).get("creditCardNo");
		String cardType = m.get(2).get("creditCardType");
		String expMonth = m.get(2).get("expMonth");
		String expYear = m.get(2).get("expYear");
		String cvvNum = m.get(2).get("cvvNumber");

		pom.getBookHotelPage().BookHotelPage(firstname, lastname, address, creditCardNum, cardType, expMonth, expYear,
				cvvNum);

	}

	@Then("User should verify after book hotel {string}")
	public void userShouldVerifyAfterBookHotel(String expBookingConfirmationMsg) throws InterruptedException {

		Thread.sleep(5000);
		String verifyBookingConfirmation = pom.getBookHotelPage().verifyBookingConfirmation();
		Assert.assertEquals(expBookingConfirmationMsg, "Booking Confirmation ");
	}

	@Then("User should click book now without select any field")
	public void userShouldClickBookNowWithoutSelectAnyField() {

		pom.getBookHotelPage().bookHotelClick();

	}

	@Then("User should verify error message {string},{string},{string},{string},{string},{string} and {string}")
	/**public void userShouldVerifyErrorMessageAnd(String expFirstname, String expLastname, String expAddress,
			String expCardNumError, String expCardType, String expMonthError, String expCvvError) {

		String verifyFirstnameError = pom.getBookHotelPage().verifyFirstnameError();
		Assert.assertEquals(expFirstname, "Please Enter your First Name");

		String verifyLastnameError = pom.getBookHotelPage().verifyLastnameError();
		Assert.assertEquals(expLastname, "Please Enter you Last Name");

		String verifyAdddressError = pom.getBookHotelPage().verifyAdddressError();
		Assert.assertEquals(expAddress, "Please Enter your Address");

		String verifyCardError = pom.getBookHotelPage().verifyCardError();
		Assert.assertEquals(expCardNumError, "Please Enter your 16 Digit Credit Card Number");

		String verifyCardTyperError = pom.getBookHotelPage().verifyCardTyperError();
		Assert.assertEquals(expCardType, "Please Select your Credit Card Type");

		String verifyExpMonthError = pom.getBookHotelPage().verifyExpMonthError();
		Assert.assertEquals(expMonthError, "Please Select your Credit Card Expiry Month");

		String verifyCvvError = pom.getBookHotelPage().verifyCvvError();
		Assert.assertEquals(expCvvError, "Please Enter your Credit Card CVV Number");

	}
*/
	@Then("User should verify error message {string}, {string}, {string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMessageAnd(String expFirstname, String expLastname, String expAddress, String expCardNumError,
			String expCardType, String expMonthError, String expCvvError) {
		String verifyFirstnameError = pom.getBookHotelPage().verifyFirstnameError();
		Assert.assertEquals(expFirstname, "Please Enter your First Name");

		String verifyLastnameError = pom.getBookHotelPage().verifyLastnameError();
		Assert.assertEquals(expLastname, "Please Enter you Last Name");

		String verifyAdddressError = pom.getBookHotelPage().verifyAdddressError();
		Assert.assertEquals(expAddress, "Please Enter your Address");

		String verifyCardError = pom.getBookHotelPage().verifyCardError();
		Assert.assertEquals(expCardNumError, "Please Enter your 16 Digit Credit Card Number");

		String verifyCardTyperError = pom.getBookHotelPage().verifyCardTyperError();
		Assert.assertEquals(expCardType, "Please Select your Credit Card Type");

		String verifyExpMonthError = pom.getBookHotelPage().verifyExpMonthError();
		Assert.assertEquals(expMonthError, "Please Select your Credit Card Expiry Month");

		String verifyCvvError = pom.getBookHotelPage().verifyCvvError();
		Assert.assertEquals(expCvvError, "Please Enter your Credit Card CVV Number");

		
		
	}

}
