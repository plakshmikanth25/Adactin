package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class SelectHotelPage extends BaseClass {
	WebDriver driver;

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadioButton;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	// verifying adactin search hotel name and verify book a hotel
	public void selectHotel() {
		WebElement btnRadioButton = findElementById("radiobutton_0");
		elementClick(btnRadioButton);
		WebElement btnContinue = findElementById("continue");
		elementClick(btnContinue);
	}

	// verifying adactin select hotel page without selecting hotel name
	public void clickContinue() {

		WebElement btnContinue = findElementById("continue");
		elementClick(btnContinue);
	}

	public String verifySelectHotelErrorMsg() {

		String errorMsg = getAttributeValue(findElementByXpath("//label [contains(text(), 'Please Select a Hotel')]"));
		return errorMsg;

	}

	public String verifyBookHotelMsg() {

		String bookHotelMsg = getAttributeValue(findElementByXpath("//td [contains(text(), 'Book A Hotel ')]"));
		return bookHotelMsg;

	}

}
