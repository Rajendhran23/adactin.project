package com.Adactin.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
public WebDriver driver;
	@FindBy(id="logout")
	private WebElement logout;

	public Booked_Itinerary(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
	}
	

	public WebElement getLogout() {
		return logout;
	}
	
}
