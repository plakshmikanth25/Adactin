package org.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should select hotel name")
	public void userShouldSelectHotelName() {
		pom.getSelectHotelPage().selectHotel();

	}

	@Then("User should verify after select hotel name {string}")
	public void userShouldVerifyAfterSelectHotelName(String expBookHotelMsg) {
		
		String verifyBookHotelMsg = pom.getSelectHotelPage().verifyBookHotelMsg();
		Assert.assertEquals(expBookHotelMsg, "Book A Hotel ");
		

	}

	@Then("User should click continue without select any hotel name")
	public void userShouldClickContinueWithoutSelectAnyHotelName() {

		pom.getSelectHotelPage().clickContinue();
	}

	@Then("User should verify error message {string}")
	public void userShouldVerifyErrorMessage(String expSelectHotelErrorMsg) {
		
		String verifySelectHotelErrorMsg = pom.getSelectHotelPage().verifySelectHotelErrorMsg();
		Assert.assertEquals(expSelectHotelErrorMsg, "Please Select a Hotel");
		

	}

}
