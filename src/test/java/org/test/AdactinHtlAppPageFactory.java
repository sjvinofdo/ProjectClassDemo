package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinHtlAppPageFactory extends BaseClass {

	public AdactinHtlAppPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "username"), @FindBy(xpath="//input[@name='username']"),@FindBy(xpath="//input[@type='text']")

	})

	private WebElement txtUsername;
	@CacheLookup
	@FindAll({ @FindBy(id = "password"), @FindBy(xpath="input[@name='password']"),@FindBy(xpath="//input[@type='password']") 
	})

	private WebElement txtPassword;
	
	@CacheLookup
	@FindBy(id = "login")
	private WebElement btnLogin;

	@CacheLookup
	@FindBy(id = "location")
	private WebElement ddnLocation;

	@CacheLookup
	@FindBy(id = "hotels")
	private WebElement ddnHotel;

	@CacheLookup
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@CacheLookup
	@FindBy(id = "room_nos")
	private WebElement ddnNoofRoom;

	@CacheLookup
	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@CacheLookup
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@CacheLookup
	@FindBy(id = "adult_room")
	private WebElement ddnAdultsRoom;

	@CacheLookup
	@FindBy(id = "child_room")
	private WebElement ddnChildrenRoom;

	@CacheLookup
	@FindBy(id = "Submit")
	private WebElement btnSearch;

	@CacheLookup
	@FindBy(id = "radiobutton_0")
	private WebElement radioButtonSelect;

	@CacheLookup
	@FindBy(id = "continue")
	private WebElement btnContinue;

	@CacheLookup
	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@CacheLookup
	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@CacheLookup
	@FindBy(id = "address")
	private WebElement txtBillingAddress;

	@CacheLookup
	@FindBy(id = "cc_num")
	private WebElement txtCreditCardNo;

	@CacheLookup
	@FindBy(id = "cc_type")
	private WebElement ddnCreditCardType;

	@CacheLookup
	@FindBy(id = "cc_exp_month")
	private WebElement ddnExpiryDateMonth;

	@CacheLookup
	@FindBy(id = "cc_exp_year")
	private WebElement ddnExpiryDateYear;

	@CacheLookup
	@FindBy(id = "cc_cvv")
	private WebElement txtCVVNo;

	@CacheLookup
	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	@CacheLookup
	@FindBy(id = "order_no")
	private WebElement txtOrderNo;

	@CacheLookup
	@FindBy(id = "logout")
	private WebElement btnLogout;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnHotel() {
		return ddnHotel;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getDdnNoofRoom() {
		return ddnNoofRoom;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getDdnAdultsRoom() {
		return ddnAdultsRoom;
	}

	public WebElement getDdnChildrenRoom() {
		return ddnChildrenRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getRadioButtonSelect() {
		return radioButtonSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtBillingAddress() {
		return txtBillingAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getDdnCreditCardType() {
		return ddnCreditCardType;
	}

	public WebElement getDdnExpiryDateMonth() {
		return ddnExpiryDateMonth;
	}

	public WebElement getDdnExpiryDateYear() {
		return ddnExpiryDateYear;
	}

	public WebElement getTxtCVVNo() {
		return txtCVVNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

}
