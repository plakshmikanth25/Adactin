package org.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should cancel order id")
	public void userShouldCancelOrderId() throws InterruptedException {
		pom.getCancelBookingPage().cancelBooking();
		

	}

	@Then("User should verify after cancel order id {string}")
	public void userShouldVerifyAfterCancelOrderId(String expCancelMsg) throws InterruptedException  {

		String verifyCancelConfirmationMsg = pom.getCancelBookingPage().verifyCancelMsg();
		Assert.assertEquals(expCancelMsg, verifyCancelConfirmationMsg);
		
	}



	@Then("User should cancel existing order {string}")
	public void userShouldCancelExistingOrder(String Order) throws InterruptedException {
		pom.getCancelBookingPage().cancelBooking(Order);
		
}




}
