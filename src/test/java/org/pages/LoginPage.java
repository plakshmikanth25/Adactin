package org.pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.github.dockerjava.api.model.Driver;

public class LoginPage extends BaseClass {

	WebDriver driver;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	// 1. Login with valid credentials
	// 2. Login with Invalid credentials

	@FindBy(id = "username_show")
	private WebElement success;

	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement error;

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSuccess() {
		return success;
	}

	public WebElement getError() {
		return error;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void Login(String username, String password) {
		elementSendKeys(findElementById("username"), username);
		elementSendKeys(findElementById("password"), password);
		elementClick(findElementById("login"));

	}

	public void LoginWithEnter(String username, String password) throws AWTException, InterruptedException {

		elementSendKeys(findElementById("username"), username);
		elementSendKeys(findElementById("password"), password);
		Thread.sleep(3000);
		robotKeyPress(KeyEvent.VK_TAB);
		robotKeyRelease(KeyEvent.VK_TAB);
		robotKeyPress(KeyEvent.VK_TAB);
		robotKeyRelease(KeyEvent.VK_TAB);
		robotKeyPress(KeyEvent.VK_ENTER);
		robotKeyRelease(KeyEvent.VK_ENTER);

	}

	public String verify() {
		String attribute = getAttributeValue(findElementById("username_show"));
		return attribute;

	}

	public String loginError() throws InterruptedException {
		
		String text = getText(findElementByXpath("//div[@class='auth_error']"));
		System.out.println(text);
		return text;

	}

}
