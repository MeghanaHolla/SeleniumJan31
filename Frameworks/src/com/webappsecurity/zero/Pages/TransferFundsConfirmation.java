package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
	
	
	public TransferFundsConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css= "#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement transferFundsConfBox;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement userName;
	
	@FindBy(id="logout_link")
	private WebElement logout;
	
	public void logoutFromApp() {
		userName.click();
		logout.click();
	}
	public String getConfMsg() {
		String confMsg = transferFundsConfBox.getText();
		return confMsg;
	}

}
