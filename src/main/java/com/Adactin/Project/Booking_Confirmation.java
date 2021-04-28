package com.Adactin.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
public WebDriver driver;
@FindBy(id = "logout")
private WebElement logout;
public Booking_Confirmation(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getLogout() {
	return logout;
}




}


	
	


