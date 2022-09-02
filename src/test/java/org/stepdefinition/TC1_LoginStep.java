package org.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.baseClass.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("user is on the adactin hotel app page")
	public void userIsOnTheAdactinHotelAppPage() throws FileNotFoundException, IOException {

		getDriver(getPropertyFileValue("browserType"));
		enterUrl(getPropertyFileValue("url"));
	}

	@When("user should perform login {string}, {string}")
	public void userShouldPerformLogin(String username, String password) {

		pom.getLoginPage().Login(username, password);

	}

	@When("user should perform login {string} and {string} with Enter key")
	public void userShouldPerformLoginAndWithEnterKey(String username, String password) throws AWTException, InterruptedException {

		pom.getLoginPage().LoginWithEnter(username, password);

	}

	@When("user should perform login {string} and {string}")
	public void userShouldPerformLoginAnd(String username, String password) {

		pom.getLoginPage().Login(username, password);
	}

	@Then("user should verify after login error contains {string}")
	public void userShouldVerifyAfterLoginErrorContains(String errorMsg) throws InterruptedException {

		String loginError = pom.getLoginPage().loginError();
		Assert.assertEquals("Invalid credentials",loginError, errorMsg);

	}

	/**
	 * PageObjectManager pom = new PageObjectManager();
	 * 
	 * @Given("user is on the adactin hotel app page") 
	 * public void userIsOnTheAdactinHotelAppPage() throws FileNotFoundException, IOException {
	 * 
	 * getDriver(getPropertyFileValue("browserType"));
	 * enterUrl(getPropertyFileValue("url"));
	 * 
	 * }
	 * 
	 * @When("user should perform login {string}, {string}") public void
	 * userShouldPerformLogin(String username, String password) {
	 * 
	 * pom.getLoginPage().Login(username, password);
	 * 
	 * }
	 * 
	 * @When("user should perform login {string} and {string} with Enter key")
	 * public void userShouldPerformLoginAndWithEnterKey(String username, String
	 * password) throws AWTException {
	 * 
	 * pom.getLoginPage().LoginWithEnter(username, password); }
	 * 
	 * @Then("user should verify after login error contains {string}") public void
	 * userShouldVerifyAfterLoginErrorContains(String expErrorMsg) throws
	 * InterruptedException {
	 * 
	 * 
	 * String loginError = pom.getLoginPage().loginError();
	 * Assert.assertEquals("Invalid credentials", loginError, expErrorMsg);
	 * 
	 * }
	 * 
	 * 
	 * 
	 */

}
