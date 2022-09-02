package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	
	
	WebDriver driver;
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private  WebElement txtOrderNo;
	
	
	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	public String bookingOrderId() throws InterruptedException {
		Thread.sleep(10000);
		String txtOrderNo = getAttributeValue(findElementById("order_no"));
		return txtOrderNo;
	}

}

