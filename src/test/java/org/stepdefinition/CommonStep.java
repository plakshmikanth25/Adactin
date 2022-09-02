package org.stepdefinition;

import org.junit.Assert;

import com.baseClass.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass{

	PageObjectManager pom= new PageObjectManager();
	
	@Then("user should verify after login message {string}")
	public void userShouldVerifyAfterLoginMessage(String expWelcomeMsg) {
	
		String verifySuccess = pom.getLoginPage().verify();
		System.out.println(verifySuccess);
		Assert.assertEquals(expWelcomeMsg, verifySuccess);
		
	}
	
}
