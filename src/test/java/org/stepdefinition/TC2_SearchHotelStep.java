package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseClass.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should search {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchAnd(String location, String hotels, String roomType, String noOfRooms,
			String txtCheckInDate, String txtCheckOutDate, String adultsPerRoom, String childrensPerRoom) throws InterruptedException {

		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, noOfRooms, txtCheckInDate, txtCheckOutDate,
				adultsPerRoom, childrensPerRoom);

	}

	@Then("User should verify after search hotel {string}")
	public void userShouldVerifyAfterSearchHotel(String expMsg) {

		String verifySelectHotelMsg = pom.getSearchHotelPage().verifySelectHotelMsg();
		Assert.assertEquals(expMsg, "Select Hotel ");

	}

	private String getText(String txtSelectHotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("User should search hotel select all mandatory fields {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelSelectAllMandatoryFieldsAnd(String location, String noOfRooms,
			String txtCheckInDate, String txtCheckOutDate, String adultsPerRoom) {

		pom.getSearchHotelPage().searchHotel(location, noOfRooms, txtCheckInDate, txtCheckOutDate, adultsPerRoom);

	}

	@Then("User should verify date error message {string} and {string}")
	public void userShouldVerifyDateErrorMessage(String txtCheckIn, String txtCheckOut) {

		String verifyCheckInErrorMsg = pom.getSearchHotelPage().verifyCheckInErrorMsg();
		Assert.assertEquals(txtCheckIn, "Check-In Date shall be before than Check-Out Date");

		String verifyCheckOutErrorMsg = pom.getSearchHotelPage().verifyCheckOutErrorMsg();
		Assert.assertEquals(txtCheckOut, "Check-Out Date shall be after than Check-In Date");
	}

	@Then("User should click search")
	public void userShouldClickSearch() {

		pom.getSearchHotelPage().clickSearch();

	}

	@Then("User should verify after error message {string}")
	public void userShouldVerifyAfterErrorMessage(String errorLocationMsg) {

		String verifyLocationErrorMsg = pom.getSearchHotelPage().verifyLocationErrorMsg();
		Assert.assertEquals(errorLocationMsg, "Please Select a Location");
		
	}

}
