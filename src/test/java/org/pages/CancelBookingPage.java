package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class CancelBookingPage extends BaseClass{
	
	
	WebDriver driver;
	public CancelBookingPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private  WebElement txtOrderNo;
	
	@FindBy(xpath = "//a [contains(text(),'Booked Itinerary')]")
	public WebElement btnMyItinerary;
	
	@FindBy(id="order_id_text")
	public WebElement txtOrderIdInput;

	@FindBy(id="search_hotel_id")
	public WebElement btnGo;

	@FindBy(id="check_all")
	public WebElement btnSelectOrderno;


	@FindBy(name="cancelall")
	public WebElement btnCancelorder;


	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}


	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}

	public WebElement getTxtOrderIdInput() {
		return txtOrderIdInput;
	}


	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnSelectOrderno() {
		return btnSelectOrderno;
	}

	public WebElement getBtnCancelorder() {
		return btnCancelorder;
	}
	
	//1.Verifying Cancel order in Booked Itinerary page by entering all fields
	public void cancelBooking() throws InterruptedException {
		Thread.sleep(5000);
		String OrderId = getAttributeValue(findElementById("order_no"));
		System.out.println(OrderId);
		elementClick(findElementByXpath("//a [contains(text(),'Booked Itinerary')]"));
		elementSendKeys(findElementById("order_id_text"), OrderId);
		elementClick(findElementById("search_hotel_id"));
		elementClick(findElementByXpath("//input[contains(@id,'btn_id')]"));
		alertAccept();
	}	
	
	//2. Verifying Cancel order in Booked Itinerary page for a previous Order
	public void cancelBooking(String orderid) throws InterruptedException {
		
		Thread.sleep(5000);
		elementClick(findElementByXpath("//a[contains(text(),'Booked Itinerary')]"));
		elementSendKeys(findElementById("order_id_text"), orderid);
		
		elementClick(findElementById("search_hotel_id"));
		elementClick(findElementByXpath("//input[contains(@id,'btn_id')]"));
		alertAccept();
	}

	public String verifyCancelMsg() throws InterruptedException {
		Thread.sleep(5000);
		String cancelMsg = getText(findElementByXpath("//label[contains(text(),'cancelled.')]"));
		return cancelMsg;
	}
}
